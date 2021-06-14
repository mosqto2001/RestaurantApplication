/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantapp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AdminLogin extends javax.swing.JFrame {

    private String userName = "admin";
    private String userPassword = "1234";

    public AdminLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        tf_pwd = new javax.swing.JPasswordField();
        t_problem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(255, 223, 82));

        jLabel8.setFont(new java.awt.Font("Mitr Medium", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 60, 60));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADMINISTRATOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturantapp/user (2).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        tf_username.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        tf_username.setForeground(new java.awt.Color(102, 102, 102));
        tf_username.setText("username");
        tf_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_usernameMouseClicked(evt);
            }
        });

        bt_login.setBackground(new java.awt.Color(60, 223, 157));
        bt_login.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        bt_login.setForeground(new java.awt.Color(60, 60, 60));
        bt_login.setText("LOGIN");
        bt_login.setBorder(null);
        bt_login.setBorderPainted(false);
        bt_login.setIconTextGap(1);
        bt_login.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        bt_cancel.setBackground(new java.awt.Color(255, 97, 126));
        bt_cancel.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        bt_cancel.setForeground(new java.awt.Color(60, 60, 60));
        bt_cancel.setText("CANCEL");
        bt_cancel.setBorder(null);
        bt_cancel.setBorderPainted(false);
        bt_cancel.setIconTextGap(1);
        bt_cancel.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        tf_pwd.setText("a123987654");
        tf_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pwdMouseClicked(evt);
            }
        });
        tf_pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_pwdKeyReleased(evt);
            }
        });

        t_problem.setFont(new java.awt.Font("Mitr Light", 0, 11)); // NOI18N
        t_problem.setForeground(new java.awt.Color(255, 51, 51));
        t_problem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_username)
                            .addComponent(tf_pwd)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(t_problem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(tf_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_problem, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        this.dispose();
        AdminMenu admin = new AdminMenu();
        admin.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        checkAccount();
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        this.dispose();
        MenuPage menu = new MenuPage();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void tf_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pwdMouseClicked
        if (tf_pwd.getText().equalsIgnoreCase("a123987654")) {
            tf_pwd.setText("");
        }
    }//GEN-LAST:event_tf_pwdMouseClicked

    private void tf_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usernameMouseClicked
        if (tf_username.getText().equalsIgnoreCase("username")) {
            tf_username.setText("");
        }
    }//GEN-LAST:event_tf_usernameMouseClicked

    private void tf_pwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pwdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("asda");
        }
    }//GEN-LAST:event_tf_pwdKeyReleased

    public void checkAccount() {
        if (tf_username.getText().equalsIgnoreCase(userName) && tf_pwd.getText().equalsIgnoreCase(userPassword)) {

            this.dispose();
            AdminMenu admin = new AdminMenu();
            admin.setVisible(true);
            setVisible(false);
        } else if ((tf_username.getText().equalsIgnoreCase(userName))) {
            t_problem.setText("* Password incorrect!");
        } else {
            t_problem.setText("* Username not found!");
        }
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel t_problem;
    private javax.swing.JPasswordField tf_pwd;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
