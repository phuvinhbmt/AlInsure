package all_insure;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author lotha
 */
public class EditAccFrame extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JButton requestBtn; // button to request editting account
    private javax.swing.JLabel passwordLbl; // label to display password
    private javax.swing.JLabel addressLbl; // label to display address
    private javax.swing.JLabel emailLbl; // label to display email
    private javax.swing.JLabel detailLbl; // label to display 
    private javax.swing.JLabel contactAddressLbl; // label to display contact and address
    private javax.swing.JLabel mobileLbl; // label to display mobile
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordFld; // passwordField to get password
    private javax.swing.JScrollPane frameScrollPane; // scroll pane of frame
    private javax.swing.JTextField addressTextFld; // text field to get address
    private javax.swing.JTextField mobileTextFld; // text field to get mobile
    private javax.swing.JTextField emailTextFld; // get email
    // End of variables declaration 
    
    /**
     * Creates new form edit
     */
    
    public EditAccFrame() {
        super("Edit account");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        
        frameScrollPane = new javax.swing.JScrollPane();
        frameScrollPane.setViewportView(jPanel1);
        
        addressTextFld = new javax.swing.JTextField();
        
        addressLbl = new javax.swing.JLabel("Living Address: ");
        
        mobileTextFld = new javax.swing.JTextField();
        
        emailLbl = new javax.swing.JLabel("Email:");
        
        emailTextFld = new javax.swing.JTextField();
        
        mobileLbl = new javax.swing.JLabel("Mobile (H):");
        
        passwordLbl = new javax.swing.JLabel("Password:");
        
        passwordFld = new javax.swing.JPasswordField("jPasswordField1");


        requestBtn = new javax.swing.JButton("Request Changes");
        requestBtn.setBackground(new java.awt.Color(0, 153, 102));
        requestBtn.setFont(new java.awt.Font("SimSun-ExtB", 0, 11)); // NOI18N
        requestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        detailLbl = new javax.swing.JLabel("Personal Details");
        detailLbl.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        detailLbl.setForeground(new java.awt.Color(0, 153, 102));

        contactAddressLbl = new javax.swing.JLabel("Address and Contact Details");
        contactAddressLbl.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        contactAddressLbl.setForeground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emailTextFld, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addressLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addressTextFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                    .addComponent(emailLbl)
                    .addComponent(contactAddressLbl)
                    .addComponent(detailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(mobileTextFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mobileLbl)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(detailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(contactAddressLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(mobileLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(passwordLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(requestBtn)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }// </editor-fold>                        

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        JOptionPane.showMessageDialog(this, "Account details request is pending");
        Main.edit.setVisible(false);
    }                                      

    public JButton getRequestBtn() {
        return requestBtn;
    }

    public JPasswordField getjPasswordField1() {
        return passwordFld;
    }

    public JTextField getjTextField1() {
        return addressTextFld;
    }

    public JTextField getjTextField3() {
        return mobileTextFld;
    }

    public JTextField getjTextField5() {
        return emailTextFld;
    }
}