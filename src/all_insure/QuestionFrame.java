package all_insure;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Color;

public class QuestionFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JTextField address10;
    private javax.swing.ButtonGroup businessActivity;
    private javax.swing.JComboBox<String> carState;
    private javax.swing.ButtonGroup fittings;
    private javax.swing.JComboBox<String> homeType;
    private javax.swing.JComboBox<String> insuranceType10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JLabel labelCarInsur;
    private javax.swing.JLabel labelFact;
    private javax.swing.JLabel labelRes;
    private javax.swing.JComboBox<String> licence;
    private javax.swing.ButtonGroup mortgage;
    private javax.swing.ButtonGroup mortgage1;
    private javax.swing.JComboBox<String> moveTime;
    private javax.swing.JRadioButton no40;
    private javax.swing.JRadioButton no41;
    private javax.swing.JRadioButton no42;
    private javax.swing.JRadioButton no43;
    private javax.swing.JTabbedPane overlook;
    private javax.swing.JRadioButton pORN;
    private javax.swing.JRadioButton pORY;
    private javax.swing.JComboBox<String> parked;
    private javax.swing.ButtonGroup placeOfResidence;
    private javax.swing.ButtonGroup placeOfResidence1;
    private javax.swing.JScrollPane popUp1;
    private javax.swing.JScrollPane popUp2;
    private javax.swing.JScrollPane popUp3;
    private javax.swing.JTextField postcode10;
    private javax.swing.ButtonGroup previousClaims;
    private javax.swing.JButton quote1;
    private javax.swing.JButton quote2;
    private javax.swing.JButton quote3;
    private javax.swing.ButtonGroup registered;
    private javax.swing.JTextField rego;
    private javax.swing.ButtonGroup regoGroup;
    private javax.swing.JRadioButton regoN;
    private javax.swing.JRadioButton regoY;
    private javax.swing.JComboBox<String> typeOfHome10;
    private javax.swing.JComboBox<String> typeOfMaterial10;
    private javax.swing.JComboBox<String> yearBuilt10;
    private javax.swing.JRadioButton yes40;
    private javax.swing.JRadioButton yes41;
    private javax.swing.JRadioButton yes42;
    private javax.swing.JRadioButton yes43;
    private javax.swing.ButtonGroup yougerDriver;
    // End of variables declaration 
    
    public QuestionFrame() {
        super("Questions");
        initComponents();
    }
    
    
    public void emptyAllBut(int i){
        if(i == 0){
            this.overlook.remove(1);
            this.overlook.remove(1);
        }
        else if(i == 1){
            this.overlook.remove(0);
            this.overlook.remove(1);
        }
        else if(i==2){
            this.overlook.remove(0);
            this.overlook.remove(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mortgage = new javax.swing.ButtonGroup();
        placeOfResidence = new javax.swing.ButtonGroup();
        businessActivity = new javax.swing.ButtonGroup();
        previousClaims = new javax.swing.ButtonGroup();
        mortgage1 = new javax.swing.ButtonGroup();
        placeOfResidence1 = new javax.swing.ButtonGroup();
        moveTime = new javax.swing.JComboBox<>();
        homeType = new javax.swing.JComboBox<>();
        fittings = new javax.swing.ButtonGroup();
        regoGroup = new javax.swing.ButtonGroup();
        yougerDriver = new javax.swing.ButtonGroup();
        registered = new javax.swing.ButtonGroup();
        popUp1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        popUp2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        popUp3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        overlook = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextArea11 = new javax.swing.JTextArea();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel131 = new javax.swing.JLabel();
        labelRes = new javax.swing.JLabel();
        insuranceType10 = new javax.swing.JComboBox<>();
        jLabel132 = new javax.swing.JLabel();
        postcode10 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        address10 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        yes40 = new javax.swing.JRadioButton();
        no40 = new javax.swing.JRadioButton();
        jLabel134 = new javax.swing.JLabel();
        yes41 = new javax.swing.JRadioButton();
        no41 = new javax.swing.JRadioButton();
        jLabel137 = new javax.swing.JLabel();
        yes42 = new javax.swing.JRadioButton();
        no42 = new javax.swing.JRadioButton();
        jLabel138 = new javax.swing.JLabel();
        typeOfHome10 = new javax.swing.JComboBox<>();
        jLabel139 = new javax.swing.JLabel();
        typeOfMaterial10 = new javax.swing.JComboBox<>();
        jLabel140 = new javax.swing.JLabel();
        yearBuilt10 = new javax.swing.JComboBox<>();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        yes43 = new javax.swing.JRadioButton();
        no43 = new javax.swing.JRadioButton();
        jLabel143 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        quote3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        pORY = new javax.swing.JRadioButton();
        pORN = new javax.swing.JRadioButton();
        quote2 = new javax.swing.JButton();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelCarInsur = new javax.swing.JLabel();
        labelFact = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        regoY = new javax.swing.JRadioButton();
        regoN = new javax.swing.JRadioButton();
        rego = new javax.swing.JTextField();
        carState = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        parked = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        licence = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        quote1 = new javax.swing.JButton();
        jTextArea13 = new javax.swing.JTextArea();

        moveTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "This year", "Last year", "2 years ago", "3years ago", "4 years ago", "More han 5 years ago", "Not yet living at this address" }));

        homeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Holiday home", "Unoccupied", "Rented to tenants", "Other" }));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("It is generally considered to be \nyour main residence if: \n- Your and your family live in it\n- Your personal belongings are in it \n- It is the address that recieves \n  your mail\n- It is your address on the electoral \n  roll\n");
        popUp1.setViewportView(jTextArea2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("What is Comprehensive Insurance? \nThis covers damage to the car as \nwell as the costs associated with \nrepairing any damages to other \nvehicles within the accident that occurred, when the driver of the vehicle is \ndeemed to be at fault in the accident.");
        popUp2.setViewportView(jTextArea1);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("This is to determine the value of\n the vehicle to let the insurer \nhave an accurate idea of the \nvehicles true value by listing\n all factory/dealer options and\n non-standard accessories.\n \n(What is Factory/dealer options? \nThese are items which were \nfitted to the car as an option \nby the manufacturer of dealer\n during the first purchase of \nthe vehicle (for example, \ntinted windows or interior \ndesign change.\n \nWhat is a non-standard \naccessory? \nThis is an additional item \nfitted to the vehicle which\n was not included in the \nfactory/dealer option or known\n as a standard fitting when \nthe vehicle was first purchased.\n");
        popUp3.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText("Duty of disclosure\n\nYou will answer all questions truthfully. All \nquestions regarding our decision to insure must\nbe answered in detail including all relevant \ninformation you possess on the topic.\n\nIf you do not tell us something or your \ninformation is fraudulent, we may cancel your \ncontract or reduce the amount we will pay if \nyou make a claim. ");

        jCheckBox11.setText("I agree to terms and conditions");

        jLabel131.setText("1. What is your type of insurance?");
        jLabel131.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel131FocusGained(evt);
            }
        });
        jLabel131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel131MouseEntered(evt);
            }
        });

        labelRes.setText("4. Is this your principal place of residence?");
        labelRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelResMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelResMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelResMouseExited(evt);
            }
        });

        insuranceType10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homeowner", "Tenant", "Landlord" }));

        jLabel132.setText("2. Address of Property to be insured?");

        jLabel133.setText("Postcode");

        jLabel135.setText("3. Do you have a mortgage on the home?");

        mortgage.add(yes40);
        yes40.setText("Yes");
        yes40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes40yesActionPerformed(evt);
            }
        });

        mortgage.add(no40);
        no40.setText("No");

        jLabel134.setText("Address");

        placeOfResidence.add(yes41);
        yes41.setText("Yes");
        yes41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes41yes1ActionPerformed(evt);
            }
        });

        placeOfResidence.add(no41);
        no41.setText("No");

        jLabel137.setText("5. Is there any business activity conducted from home?");

        businessActivity.add(yes42);
        yes42.setText("Yes");
        yes42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes42yes2ActionPerformed(evt);
            }
        });

        businessActivity.add(no42);
        no42.setText("No");

        jLabel138.setText("6. What type of home is it?");

        String[] homeType = new String[]  { "Townhouse", "Apartment", "Freestanding", "Home unit", "Flat", "Shipping countainer", "Warehouse", "Storage facility", "Shed", "Granny flat", "Other" };
        typeOfHome10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Townhouse", "Apartment", "Freestanding", "Home unit", "Flat", "Shipping countainer", "Warehouse", "Storage facility", "Shed", "Granny flat", "Other" }));

        jLabel139.setText("7. What is the main construction material of the walls?");

        typeOfMaterial10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weatherboard", "Besser block/cement", "Stone", "Double brick", "Brick veneer", "Other" }));

        jLabel140.setText("8. What year was the home built? ");

        yearBuilt10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2011+", "2000-2010", "1990-1999", "1980-1989", "1970-1979", "1960-1969", "Pre 1960" }));

        jLabel141.setText("9. In the last 5 years, have you or any other household members made any claims ");

        jLabel142.setText("for thefts or bruglaries under a home and/or contents policy? ");

        previousClaims.add(yes43);
        yes43.setText("Yes");
        yes43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes43yes3ActionPerformed(evt);
            }
        });

        previousClaims.add(no43);
        no43.setText("No");

        jLabel143.setText("10. What date would you like to start you policy?");

        jTextField12.setText("dd/mm/yyyy");

        quote3.setText("Get Quotes!");
        quote3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quote3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextArea11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132)
                            .addComponent(jCheckBox11)
                            .addComponent(jLabel131)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yes42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no42))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yes41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no41))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(yes40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(no40))
                                    .addComponent(jLabel142)
                                    .addComponent(yearBuilt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typeOfMaterial10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typeOfHome10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel143)
                                    .addComponent(quote3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(yes43)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(no43))
                                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(insuranceType10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel133))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(address10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel134)
                                                .addComponent(postcode10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel137)
                            .addComponent(jLabel135)
                            .addComponent(labelRes)
                            .addComponent(jLabel138)
                            .addComponent(jLabel139)
                            .addComponent(jLabel140)
                            .addComponent(jLabel141))
                        .addContainerGap(139, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insuranceType10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel132)
                .addGap(15, 15, 15)
                .addComponent(jLabel133)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postcode10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel134)
                .addGap(11, 11, 11)
                .addComponent(address10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel135)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes40)
                    .addComponent(no40))
                .addGap(18, 18, 18)
                .addComponent(labelRes)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes41)
                    .addComponent(no41))
                .addGap(18, 18, 18)
                .addComponent(jLabel137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes42)
                    .addComponent(no42))
                .addGap(18, 18, 18)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeOfHome10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(typeOfMaterial10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel140)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yearBuilt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes43)
                    .addComponent(no43))
                .addGap(18, 18, 18)
                .addComponent(jLabel143)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quote3)
                .addGap(15, 15, 15))
        );

        jScrollPane4.setViewportView(jPanel1);

        overlook.addTab("Home", jScrollPane4);

        jLabel1.setText("1. What is your type of occupancy?");

        jLabel2.setText("2. Address of Property to be insured?");

        jLabel3.setText("3. Do you have a mortgage on the home?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homeowner", "Tenant", "Landlord" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        mortgage1.add(jRadioButton1);
        jRadioButton1.setText("Yes");

        mortgage1.add(jRadioButton2);
        jRadioButton2.setText("No");

        jLabel4.setText("4. Is this your principal place of residence?");

        placeOfResidence1.add(pORY);
        pORY.setText("Yes");
        pORY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pORYActionPerformed(evt);
            }
        });

        placeOfResidence1.add(pORN);
        pORN.setText("No");
        pORN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pORNActionPerformed(evt);
            }
        });

        quote2.setText("Obtain Quote!");
        quote2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quote2ActionPerformed(evt);
            }
        });

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText("Duty of disclosure\n\nYou will answer all questions truthfully. All \nquestions regarding our decision to insure must\nbe answered in detail including all relevant \ninformation you possess on the topic.\n\nIf you do not tell us something or your \ninformation is fraudulent, we may cancel your \ncontract or reduce the amount we will pay if \nyou make a claim. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(quote2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pORY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pORN))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextArea12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pORY)
                    .addComponent(pORN))
                .addGap(18, 18, 18)
                .addComponent(quote2)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        overlook.addTab("Contents", jScrollPane1);

        jLabel5.setText("1. Is your vehicle registered? ");

        jLabel6.setText("2. In which state is the car registered in currently?");

        labelCarInsur.setText("3. What level of cover are you looking to purchase?");
        labelCarInsur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                labelCarInsurFocusGained(evt);
            }
        });
        labelCarInsur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCarInsurMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCarInsurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCarInsurMouseExited(evt);
            }
        });

        labelFact.setText("4. Are there non-standard or facorty/dealer accessories fitted in the car? ");
        labelFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelFactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelFactMouseExited(evt);
            }
        });

        jLabel9.setText("5. How will the vehicle be used?");

        registered.add(regoY);
        regoY.setText("Yes");
        regoY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regoYActionPerformed(evt);
            }
        });

        registered.add(regoN);
        regoN.setText("No");
        regoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regoNActionPerformed(evt);
            }
        });

        rego.setText("Please enter registration number");
        rego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regoActionPerformed(evt);
            }
        });

        carState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New South Wales", "Victoria", "Queensland", "Western Australia", "South australia", "australian Capital Territory", "Tasmania", "Northern Territooy" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comprehensive", "Third Party Fire and Thefy", "Third Party Property Damage" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        fittings.add(jRadioButton3);
        jRadioButton3.setText("Yes");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        fittings.add(jRadioButton4);
        jRadioButton4.setText("Unsure");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        fittings.add(jRadioButton5);
        jRadioButton5.setText("No");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private and/or commuting to work only", "Private and occasional business", "Private and business", "Business only" }));

        jLabel10.setText("6. Where is vehicle parked in given address?");

        parked.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garaged", "Car park", "Street", "Parking lot", "Driveway", "Locked Compound", "On private property", "Carport" }));
        parked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkedActionPerformed(evt);
            }
        });

        jLabel11.setText("7. What is the current status of the regular drivers licence level?");

        licence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full or unrestricted", "Provisional 2", "Provisional 1", "Learners" }));
        licence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenceActionPerformed(evt);
            }
        });

        jLabel12.setText("8. Will anyone younger be driving the vehicle?");

        yougerDriver.add(jRadioButton6);
        jRadioButton6.setText("Yes");

        yougerDriver.add(jRadioButton7);
        jRadioButton7.setText("No");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        quote1.setText("Obtain Quote!");
        quote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quote1ActionPerformed(evt);
            }
        });

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setText("Duty of disclosure\n\nYou will answer all questions truthfully. All \nquestions regarding our decision to insure must\nbe answered in detail including all relevant \ninformation you possess on the topic.\n\nIf you do not tell us something or your \ninformation is fraudulent, we may cancel your \ncontract or reduce the amount we will pay if \nyou make a claim. ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(labelCarInsur)
                    .addComponent(labelFact)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton7))
                            .addComponent(licence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rego, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(regoY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(regoN))))
                    .addComponent(quote1)
                    .addComponent(jTextArea13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regoY)
                    .addComponent(regoN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCarInsur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelFact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4))
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(licence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7))
                .addGap(18, 18, 18)
                .addComponent(quote1)
                .addContainerGap())
        );

        rego.setVisible(false);

        jScrollPane2.setViewportView(jPanel3);

        overlook.addTab("Car", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(overlook, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(overlook, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void yes40yesActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void yes41yes1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void yes42yes2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void yes43yes3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

    private void pORYActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(pORY.isSelected()){
            JOptionPane.showMessageDialog(null, moveTime, "When did you move?", JOptionPane.QUESTION_MESSAGE);

        }

    }                                    

    private void pORNActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(pORN.isSelected()){
            JOptionPane.showMessageDialog(null, homeType, "What is home used for?", JOptionPane.QUESTION_MESSAGE);
        }
    }                                    

    private void labelCarInsurFocusGained(java.awt.event.FocusEvent evt) {                                          

    }                                         

    private void regoYActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(regoY.isSelected()){
            rego.setVisible(true);
            QuestionFrame.this.revalidate();
            QuestionFrame.this.repaint();
        }
        else{
            rego.setVisible(false);
            QuestionFrame.this.revalidate();
            QuestionFrame.this.repaint();
        }
    }                                     

    public static double calcPrice() {
        return Math.random() * 100 + 50;
    }
    
    private void regoActionPerformed(java.awt.event.ActionEvent evt) {                                     

    }                                    

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void parkedActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void licenceActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void regoNActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(regoN.isSelected()){
            rego.setVisible(false);
            QuestionFrame.this.revalidate();
            QuestionFrame.this.repaint();
        }
        else{
            rego.setVisible(true);
            QuestionFrame.this.revalidate();
            QuestionFrame.this.repaint();
        }
    }                                     

    private void quote3ActionPerformed(java.awt.event.ActionEvent evt) {     
                
                
        double price = calcPrice();
        Controller.price = price;
        String message = String.format("%.2f$ per week", price);
        Main.obtainQuoteFrm.getPriceTextFld().setText(message);
        Main.obtainQuoteFrm.setVisible(true);
        this.setVisible(false);
    }                                      

    private void quote2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Main.obtainQuoteFrm.setVisible(true);
        this.setVisible(false);
    }                                      

    private void quote1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Main.obtainQuoteFrm.setVisible(true);
        this.setVisible(false);
    }                                      

    private void jLabel131FocusGained(java.awt.event.FocusEvent evt) {                                      

    }                                     

    private void jLabel131MouseEntered(java.awt.event.MouseEvent evt) {                                       
        //temp.setText("hello");
        QuestionFrame.this.revalidate();
        QuestionFrame.this.repaint();    // TODO add your handling code here:
    }                                      

    private void labelResMouseEntered(java.awt.event.MouseEvent evt) {                                      
        labelRes.setForeground(Color.BLUE);
        QuestionFrame.this.revalidate();
        QuestionFrame.this.repaint(); 
    }                                     

    private void labelResMouseExited(java.awt.event.MouseEvent evt) {                                     
        labelRes.setForeground(Color.BLACK);
        QuestionFrame.this.revalidate();
        QuestionFrame.this.repaint(); 
    }                                    

    private void labelResMouseClicked(java.awt.event.MouseEvent evt) {                                      
        JOptionPane.showMessageDialog(this, popUp1);
    }                                     

    private void labelCarInsurMouseEntered(java.awt.event.MouseEvent evt) {                                           
        labelCarInsur.setForeground(Color.BLUE);
        QuestionFrame.this.revalidate();
        QuestionFrame.this.repaint(); 
    }                                          

    private void labelCarInsurMouseExited(java.awt.event.MouseEvent evt) {                                          
        labelCarInsur.setForeground(Color.BLACK);
        QuestionFrame.this.revalidate();
        QuestionFrame.this.repaint(); 
    }                                         

    private void labelCarInsurMouseClicked(java.awt.event.MouseEvent evt) {                                           
        JOptionPane.showMessageDialog(this, popUp2);
    }                                          

    private void labelFactMouseClicked(java.awt.event.MouseEvent evt) {                                       
        JOptionPane.showMessageDialog(this, popUp3);
    }                                      

    private void labelFactMouseExited(java.awt.event.MouseEvent evt) {                                      
        labelFact.setForeground(Color.BLACK);
        QuestionFrame.this.revalidate();
        QuestionFrame.this.repaint(); 
    }                                     

    private void labelFactMouseEntered(java.awt.event.MouseEvent evt) {                                       
        labelFact.setForeground(Color.BLUE);
        QuestionFrame.this.revalidate();
        QuestionFrame.this.repaint();     
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionFrame().setVisible(true);
            }
        });
    }

                      
}
