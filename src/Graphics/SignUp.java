/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author SICHANGI
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField8 = new javax.swing.JTextField();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        signUpPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sNameLabel = new javax.swing.JLabel();
        occupationLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        fNameTextField = new javax.swing.JTextField();
        sNameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        occupationTextField = new javax.swing.JTextField();
        adressTextField = new javax.swing.JTextField();
        signupUsernameTextField = new javax.swing.JTextField();
        infoLabel = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        signupPassField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        signupPassConfirmField = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        phoneField = new javax.swing.JFormattedTextField();

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 0, 102));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp Form");
        setBackground(new java.awt.Color(143, 188, 143));
        setLocation(new java.awt.Point(400, 10));
        setMaximumSize(new java.awt.Dimension(950, 1100));
        setPreferredSize(new java.awt.Dimension(900, 1050));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 1050));

        signUpPanel.setBackground(new java.awt.Color(143, 188, 143));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adduser_32.png"))); // NOI18N

        fNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fNameLabel.setForeground(new java.awt.Color(51, 0, 102));
        fNameLabel.setText("First Name");

        idLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idLabel.setForeground(new java.awt.Color(51, 0, 102));
        idLabel.setText("ID Number");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("Residential Adress");

        sNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        sNameLabel.setForeground(new java.awt.Color(51, 0, 102));
        sNameLabel.setText("Second Name");

        occupationLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        occupationLabel.setForeground(new java.awt.Color(51, 0, 102));
        occupationLabel.setText("Occupation");

        genderLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(51, 0, 102));
        genderLabel.setText("Gender");

        dateLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 0, 102));
        dateLabel.setText("Date");

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 0, 102));
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 0, 102));
        passwordLabel.setText("Password");

        maleButton.setBackground(new java.awt.Color(143, 188, 143));
        buttonGroup1.add(maleButton);
        maleButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        maleButton.setForeground(new java.awt.Color(51, 0, 102));
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        femaleButton.setBackground(new java.awt.Color(143, 188, 143));
        buttonGroup1.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        femaleButton.setForeground(new java.awt.Color(51, 0, 102));
        femaleButton.setText("Female");

        fNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fNameTextField.setForeground(new java.awt.Color(51, 0, 102));
        fNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextFieldActionPerformed(evt);
            }
        });

        sNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        sNameTextField.setForeground(new java.awt.Color(51, 0, 102));
        sNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTextFieldActionPerformed(evt);
            }
        });

        idTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idTextField.setForeground(new java.awt.Color(51, 0, 102));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        occupationTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        occupationTextField.setForeground(new java.awt.Color(51, 0, 102));
        occupationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationTextFieldActionPerformed(evt);
            }
        });

        adressTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        adressTextField.setForeground(new java.awt.Color(51, 0, 102));
        adressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressTextFieldActionPerformed(evt);
            }
        });

        signupUsernameTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        signupUsernameTextField.setForeground(new java.awt.Color(51, 0, 102));
        signupUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupUsernameTextFieldActionPerformed(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(51, 0, 102));
        infoLabel.setText("Make sure all the fields are filled with correct details");

        signUpButton.setBackground(new java.awt.Color(204, 204, 255));
        signUpButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(51, 0, 102));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        signupPassField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        signupPassField.setForeground(new java.awt.Color(51, 0, 102));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Confirm Password");

        signupPassConfirmField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        signupPassConfirmField.setForeground(new java.awt.Color(51, 0, 102));

        jDateChooser1.setForeground(new java.awt.Color(51, 0, 102));
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Phone Number");

        phoneField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(occupationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adressTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(occupationTextField)
                                    .addComponent(fNameTextField)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(phoneField, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(130, 130, 130)
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(signupPassField)
                                    .addComponent(signupUsernameTextField)
                                    .addComponent(signupPassConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(maleButton, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(femaleButton, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(infoLabel))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameLabel)
                            .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sNameLabel)
                            .addComponent(sNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(adressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(occupationLabel)
                            .addComponent(occupationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(dateLabel))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addComponent(maleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femaleButton)))
                .addGap(18, 18, 18)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(signupUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(33, 33, 33)
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(signupPassConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(infoLabel)
                .addGap(47, 47, 47)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

    private void fNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextFieldActionPerformed

    private void sNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameTextFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void occupationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationTextFieldActionPerformed

    private void adressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adressTextFieldActionPerformed

    private void signupUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupUsernameTextFieldActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        Mainscreen main = new Mainscreen();
        main.show();
        
        dispose();
    }//GEN-LAST:event_signUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel infoLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel occupationLabel;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JFormattedTextField phoneField;
    private javax.swing.JLabel sNameLabel;
    private javax.swing.JTextField sNameTextField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPasswordField signupPassConfirmField;
    private javax.swing.JPasswordField signupPassField;
    private javax.swing.JTextField signupUsernameTextField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
