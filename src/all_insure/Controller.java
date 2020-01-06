package all_insure;

import java.awt.Font;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;

public final class Controller {

    Model model;
    Login login;
    SignUp signup;

    MainPage mainPage;
    Obatin obtain;
    Quote quote;
    BookAppointment fin;
    Edit edit;
    Purchase purchase;
    MyStaff staff;
    ActionItem actionItem;
    CustDetailsStaff custDetail;
    ProductView productView;

    public static String currentUsername = null;
    public static double price = 0;
    private Insurance insurance = new Insurance();
    public static String mobile;
    static String email;
    static String address;
    static String password;

    public Controller(Model model, Login login, SignUp signup, MainPage mainPage, Obatin obtain, Quote quote, BookAppointment fin, Edit edit, Purchase purchase, MyStaff staff, ActionItem actionItem, CustDetailsStaff custDetail, ProductView productView) {
        this.model = model;
        this.login = login;
        this.signup = signup;
        this.mainPage = mainPage;
        this.obtain = obtain;
        this.quote = quote;
        this.fin = fin;
        this.edit = edit;
        this.purchase = purchase;
        this.staff = staff;
        this.actionItem = actionItem;
        this.custDetail = custDetail;
        this.productView = productView;

        // handle events
        //customer handler
        handleLogin();
        handleSignUp();
        handleselectQuote();
        handlePaymentMethod();
        handleRequestChange();

        // staff handler
        handleSearchUser();
        handleCustomerProduct();
        handleCustomerDetail();
        viewRequestChange();
        approveRequestChange();
    }
    
    public boolean verifyCustomerLogin(String username, String password)  {
        // select customer from database and store result  set
        try {
            ResultSet resultSet = model.selectCustomerByUsernamePassword(username, password);
            while (resultSet.next()) {
                if (username.equals(resultSet.getString("USERNAME")) && password.equals(resultSet.getString("PASSWORD"))) {
                    return true;
                }
            }
    
        } catch (SQLException ex) {
        }
        
        return false;
    }
    
    
    public boolean verifyStaffLogin(String username, String password)  {
        // select staff from database and store result  set
        try {
            ResultSet resultSet = model.selectStaffByUsernamePassword(username, password);
            while (resultSet.next()) {
                if (username.equals(resultSet.getString("USERNAME")) && password.equals(resultSet.getString("PASSWORD"))) {
                    return true;
                }
            }
    
        } catch (SQLException ex) {
        }
        
        return false;
    }

    // customer handlers
    public void handleLogin() {
        // Login events
        login.getLogLogBut().addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = String.valueOf(login.getLogPassText().getPassword());
                String username = login.getLogUserText().getText();
                System.out.printf("%s\n%s\n", username, password);
                if (verifyStaffLogin(username, password)) {
                    JLabel msgLabel = new JLabel("Welcome staff: "+username);
                    msgLabel.setFont(new Font("sanserif", 0, 15));
                    JOptionPane.showMessageDialog(null, msgLabel);
                    
                    
                    // function logLogButActionPerformed
                    All_Insure.mainy.getLogin().setText("Sign Out");
                    All_Insure.mainy.getSignUp().setText("");
                    All_Insure.mainy.revalidate();
                    All_Insure.mainy.repaint();
                    All_Insure.log.setVisible(false);
                    All_Insure.staff.setVisible(true);
                    
                    currentUsername = username;
                    login.loggedIn = true;
                    
                    login.getLogUserText().setText("");
                    login.getLogPassText().setText("");
                    
                } else if (verifyCustomerLogin(username, password)) {
                    All_Insure.mainy.getLogin().setText("Sign Out");
                    All_Insure.mainy.getSignUp().setText("");
                    All_Insure.mainy.revalidate();
                    All_Insure.mainy.repaint();
                    All_Insure.log.setVisible(false);
                    
                    currentUsername = username;
                    login.loggedIn = true;
                    
                    login.getLogUserText().setText("");
                    login.getLogPassText().setText("");
                    
                    productView.setLocationRelativeTo(null);
                    productView.setVisible(true);
                    refreshJTable(productView.getjTable1());
                    
                } else {
                    JOptionPane.showMessageDialog(login, "Login not successful\nUsername or password incorrect");
                    login.loggedIn = false;
                }
            }
        }));
    }

    public void handleSignUp() {
        // Sign up event
        signup.getSignSignBut().addActionListener((ActionEvent e) -> {
            // get information from user
            String fname = signup.getSignFirstText().getText();
            String lname = signup.getSignLastText().getText();
            String dob = signup.getSignDOBText().getText();
            String email = signup.getSignEmailText().getText();
            int phone = 0;

            // parse phone string to phone number
            try {
                phone = Integer.parseInt(signup.getSignPhoneText().getText().replaceAll("\\s+", ""));

            } catch (NumberFormatException ex) {
                signup.getSignLabel().setText(signup.getSignLabel().getText() + "Please fill in phone number without space");
            }
            String username = email.split("@")[0];
            String password = String.valueOf(signup.getSignPassText().getPassword());

            try {
                model.insertCustomer(fname, lname, username, password, dob, email, phone);
//                JOptionPane.showMessageDialog(null, "Congratulations! You have created account successfully");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }

    public String getSelectedCustIdInJTable(JTable table) {
        int row = table.getSelectedRow();
        System.out.println("row = " +row);
        if (row == -1) {
            row = 1;
        }
        String custId = (String) table.getValueAt(row, 0);
        return custId;
    }
    
    public void viewRequestChange( ) {
        staff.getActionItem().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.printf("allow request:\n \tmobile: %s address: %s %s\n", mobile, address, mobile);
                staff.actionItemActionPerformed(evt);
                
                JTable table = All_Insure.actionItem.getjTable1();
                // get selected customer 
                String custId = getSelectedCustIdInJTable(staff.getjTable2());
                
                // display old info
                
                try {
                    
                    System.out.printf("custId = \n", custId);
                    ResultSet resultSet = model.selectCustomerById(custId);
                    while (resultSet.next()) {
                        String ml = resultSet.getString("email");
                        String mob = resultSet.getString("phone");
                        String addr= resultSet.getString("address");
                        
                        table.setValueAt(mob, 0, 1);
                        table.setValueAt(ml, 1, 1);
                        table.setValueAt(addr, 2, 1);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                
                // display new info
                // string, row, 2
                table.setValueAt(mobile, 0, 2);
                table.setValueAt(email, 1, 2);
                table.setValueAt(address, 2, 2);
            }
        });
    }
    
    public void approveRequestChange() {
        All_Insure.actionItem.getjButton1().addActionListener((ActionEvent e) -> {
            try {
                String custId = getSelectedCustIdInJTable(staff.getjTable2());
                JTable table = All_Insure.actionItem.getjTable1();
                String newMob = (String) table.getValueAt(0, 2);
                String newMail = (String) table.getValueAt(1, 2);
                String newAddr = (String) table.getValueAt(2, 2);
                model.updateCustomer(custId, newAddr, newMail, newMob);
                System.out.println(newMob);
                System.out.println(newMail);
                System.out.println(newAddr);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    } 
    
    public void handleRequestChange() {
        edit.getChange().addActionListener((java.awt.event.ActionEvent evt) -> {
            address = edit.getjTextField1().getText();
            mobile = edit.getjTextField3().getText();
            email = edit.getjTextField5().getText();
            password =  String.valueOf(edit.getjPasswordField1().getPassword());
//            
            System.out.println("attribute at request change ");
        });
    }
    
    public void handleselectQuote() {
        // if home insurance button is selected
        quote.getHome().addActionListener((java.awt.event.ActionEvent evt) -> {
            quote.homeActionPerformed(evt);
            insurance.setInsurance_type("Home");
        });
        quote.getContents().addActionListener((java.awt.event.ActionEvent evt) -> {
            quote.homeActionPerformed(evt);
            insurance.setInsurance_type("Content");
        });
        quote.getCar().addActionListener((java.awt.event.ActionEvent evt) -> {
            quote.homeActionPerformed(evt);
            insurance.setInsurance_type("Car");
        });

//        price = calcPrice();
//        String message = String.format("%.2f$ per week", price);
//        obtain.getjTextField1().setText(message);

    }

    public void handlePurchaseInsurance() {
//        price = calcPrice();
//        String message = String.format("%.2f$ per week", price) ;
//        obtain.getjTextField1().setText(message);

        int custId = 0;
        try {
            ResultSet resultSet = model.selectCustomerByUsername(currentUsername);
            while (resultSet.next()) {
                custId = Integer.parseInt(resultSet.getString("ID"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        insurance.setCustomer_id(custId);
        insurance.setPrice(price);

//        System.out.printf("insurance in selectQuote: %s\n", insurance.getInsurance_type());
//        System.out.printf("price: %s\n", insurance.getPrice());
//        System.out.printf("cust id: %d\n", insurance.getCustomer_id());
        try {
            model.insertInsurance(custId, insurance);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // add payment method to database 
    public void handlePaymentMethod() {
        purchase.getPurchase().addActionListener((java.awt.event.ActionEvent evt) -> {

            // get card number, expiration date, cvv
            long cnumber = 0;
            String month = purchase.getjTextField4().getText();
            String year = purchase.getjTextField3().getText();
            int cvv = Integer.parseInt(purchase.getjTextField2().getText());
            purchase.purchaseActionPerformed(evt);

            // get current user
            int customerId = 0;
            try {
                cnumber = Integer.parseInt(purchase.getjTextField1().getText());
                ResultSet resultSet = model.selectCustomerByUsername(currentUsername);
                while (resultSet.next()) {
                    customerId = Integer.parseInt(resultSet.getString("ID"));
                }
            } catch (SQLException ex) {
                System.err.println("User not found");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter your card number again!");
            }

            //add new credit card to database
//            try {
//                model.insertPayment(cnumber, month, year, cvv, customerId);
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }

            handlePurchaseInsurance();

            //display purchased insurance at jtable
            try {
                //get customer id from customer username
                String id = "1";
                ResultSet idResult = model.selectCustomerByUsername(currentUsername);
                while(idResult.next()) {
                    id = idResult.getString("id");
                }
                // get result set of insurance purchased by customer id
                ResultSet insuranceResult = model.selectInsuranceByCustId(id);

                // display reulst at jtable
                displayInsurance(insuranceResult, productView.getjTable1());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        });
    }

    // staff handlers
    public void handleSearchUser() {

//        searchCustomerByFname();
        staff.getjTextField1().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // when search field is pressed enter 
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String searchedField = staff.getjTextField1().getText();
                    int selected = staff.getjComboBox1().getSelectedIndex();
                    switch (selected) {
                        case 1: // search by first name
                            refreshJTable(staff.getjTable2());
                            searchCustomerByFname(searchedField);
                            break;
                        case 2: // search by last name
                            refreshJTable(staff.getjTable2());
                            searchCustomerByLname(searchedField);
                            break;
                        case 3: // search by id
                            refreshJTable(staff.getjTable2());
                            searchCustomerById(searchedField);
                            break;
                        default:
                            searchCustomerByFname("");
                            break;

                    }
                }
            }
        });

    }

    public void handleCustomerDetail() {
        staff.getjButton1().addActionListener((java.awt.event.ActionEvent evt) -> {
            custDetail.setVisible(true);
//            refreshJTable(custDetail.getjTable1());
            int row = staff.getjTable2().getSelectedRow();
            System.out.println("Selected row = " + row);
            if (row == -1) {
                row = 1;
            }
            String id = (String) staff.getjTable2().getValueAt(row, 0);
            try {
                // get result set of insurance purchased by customer id
                ResultSet custDetailResult = model.selectCustomerById(id);

                // display reulst at jtable
                displayCustomerDetails(custDetailResult);
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }
    public void handleCustomerProduct() {
        staff.getjButton2().addActionListener((java.awt.event.ActionEvent evt) -> {
            productView.setVisible(true);
            int row = staff.getjTable2().getSelectedRow();
            if (row == -1) {
                row = 1;
            }
            String id = (String) staff.getjTable2().getValueAt(row, 0);

            try {
                // get result set of insurance purchased by customer id
                ResultSet insuranceResult = model.selectInsuranceByCustId(id);

                // display reulst at jtable
                displayInsurance(insuranceResult, productView.getjTable1());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }

//        });
//    }
//
//    
    public void displayCustomer(int row, String id, String fname, String lname) {

//        ((AbstractTableModel) staff.getjTable2().getModel()).setRowCount(0);
        DefaultTableModel model = (DefaultTableModel) staff.getjTable2().getModel();
//        model.getDataVector().removeAllElements();
//        staff.getjTable2().revalidate();

        staff.getjTable2().setValueAt(id, row, 0);
        staff.getjTable2().setValueAt(fname, row, 1);
        staff.getjTable2().setValueAt(lname, row, 2);
    }

    
    public static void refreshJTable(JTable table) {
        System.out.println( "jtable" +table.getRowCount());
        int row = 0;
        while (row < table.getRowCount()) {
            table.setValueAt("", row, 0);
            table.setValueAt("", row, 1);
            table.setValueAt("", row, 2);
            row++;
        }
//        System.out.println(staff.getjTable2().getRowCount());
//        int row = 0;
//        while (row <= staff.getjTable2().getRowCount()) {
//            staff.getjTable2().setValueAt(null, row, 0);
//            staff.getjTable2().setValueAt(null, row, 1);
//            staff.getjTable2().setValueAt(null, row, 2);
//            row++
//        }
    }

    
    public void displayCustomerDetails(ResultSet resultSet) {
        try {
            int row = 0;
            
            while (resultSet.next()) {
                String address = resultSet.getString("address");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                System.out.printf("%s %s %s", address, email, phone);
                custDetail.getjTable1().setValueAt(phone, 0, 1);
                custDetail.getjTable1().setValueAt(email, 1, 1);
                custDetail.getjTable1().setValueAt(address, 2, 1);
            }
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(mainPage, "Customer not found!!");
               ex.printStackTrace();
        }
    }
    
    public void displayCustomer(ResultSet resultSet) {
        try {
            int row = 0;
            // select customer from database by backend methods 

            // while result from select has > 0 rows, populate jtable
            while (resultSet.next()) {
                // get value
                String fname = resultSet.getString("fname");
                String lname = resultSet.getString("lname");
                String id = resultSet.getString("id");
                // display in jtable
                staff.getjTable2().setValueAt(id, row, 0);
                staff.getjTable2().setValueAt(fname, row, 1);
                staff.getjTable2().setValueAt(lname, row, 2);

                row++;
            }
            // if no customers found, inform
            if (row == 0) {
                //JOptionPane.showMessageDialog(null, "No customer found!!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(mainPage, "Customer not found!!");
        }

    }

    
    
    public void displayInsurance(ResultSet resultSet, JTable table) {
        try {
            int row = 0;

            refreshJTable(table);
            // select customer from database by backend methods 

            // while result from select has > 0 rows, populate jtable
            while (resultSet.next()) {
                // get value
                String customerId = resultSet.getString("customer");
                String insurance = resultSet.getString("insurance_type");
                String price = resultSet.getString("price");
                // display in jtable
                table.setValueAt(customerId, row, 0);
                table.setValueAt(insurance, row, 1);
                table.setValueAt(price, row, 2);

                row++;
            }
            // if no customers found, inform
            if (row == 0) {
                //JOptionPane.showMessageDialog(null, "No customer found!!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(mainPage, "Customer not found!!");
        }

    }

    public void searchCustomerByFname(String searchedFname) {
        // call function from Model to search user by first name
        try {
            // select customer from database by backend methods 
            ResultSet resultSet = model.selectCustomerByFname(searchedFname);

            displayCustomer(resultSet);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(mainPage, "Customer not found!!");
        }

    }

    public void searchCustomerById(String searchedId) {
        // call function from Model to search user by first name
        try {
            // select customer from database by backend methods 
            ResultSet resultSet = model.selectCustomerById(searchedId);
            displayCustomer(resultSet);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(mainPage, "Customer not found!!");
        }

    }

    public void searchCustomerByLname(String searchedLname) {
        // call function from Model to search user by first name
        try {
            // select customer from database by backend methods 
            ResultSet resultSet = model.selectCustomerByLname(searchedLname);

            // while result from select has > 0 rows, populate jtable
            displayCustomer(resultSet);
//                while (resultSet.next()) {
//                    String fname = resultSet.getString("fname");
//                    String lname = resultSet.getString("lname");
//                    String id = resultSet.getString("id");
//                    displayCustomer(totalCust, id, fname, lname);
//                    totalCust++;
//                }
//                // if no customers found, inform
//                if (totalCust == 0) {
////                    JOptionPane.showMessageDialog(null, "No customer found!!");
//                }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(mainPage, "Customer not found!!");
        }

    }

    public static double calcPrice() {
        return Math.random() * 100 + 50;
    }

}
