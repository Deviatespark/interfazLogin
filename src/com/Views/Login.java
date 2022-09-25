/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Views;

import java.awt.Color;

/**
 *
 * @author galve
 */
public class Login extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanelBar = new javax.swing.JPanel();
        jPExit = new javax.swing.JPanel();
        jLButtonExit = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        JTUser = new javax.swing.JTextField();
        JPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPboton = new javax.swing.JPanel();
        TextBoton = new java.awt.Label();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(3, 19, 47));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBar.setBackground(new java.awt.Color(3, 19, 47));
        jPanelBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarMouseDragged(evt);
            }
        });
        jPanelBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarMousePressed(evt);
            }
        });

        jPExit.setBackground(new java.awt.Color(3, 19, 47));
        jPExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPExitMouseEntered(evt);
            }
        });

        jLButtonExit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLButtonExit.setText("X");
        jLButtonExit.setToolTipText("");
        jLButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLButtonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLButtonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLButtonExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPExitLayout = new javax.swing.GroupLayout(jPExit);
        jPExit.setLayout(jPExitLayout);
        jPExitLayout.setHorizontalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPExitLayout.setVerticalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelBarLayout = new javax.swing.GroupLayout(jPanelBar);
        jPanelBar.setLayout(jPanelBarLayout);
        jPanelBarLayout.setHorizontalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarLayout.createSequentialGroup()
                .addComponent(jPExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1240, Short.MAX_VALUE))
        );
        jPanelBarLayout.setVerticalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarLayout.createSequentialGroup()
                .addComponent(jPExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(jPanelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 50));

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setInheritsPopupMenu(true);

        Login.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 134, 190));
        Login.setText("Login");

        User.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        User.setForeground(new java.awt.Color(0, 134, 190));
        User.setText("Usuario");

        Password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 134, 190));
        Password.setText("Password");

        JTUser.setBackground(new java.awt.Color(255, 255, 255));
        JTUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JTUser.setForeground(new java.awt.Color(204, 204, 204));
        JTUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTUser.setText("Ingrese nombre de usuario");
        JTUser.setBorder(null);
        JTUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTUserMousePressed(evt);
            }
        });
        JTUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTUserActionPerformed(evt);
            }
        });

        JPassword.setBackground(new java.awt.Color(255, 255, 255));
        JPassword.setText("********");
        JPassword.setToolTipText("");
        JPassword.setBorder(null);
        JPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPasswordMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 134, 190));

        jSeparator2.setForeground(new java.awt.Color(0, 134, 190));

        javax.swing.GroupLayout jPbotonLayout = new javax.swing.GroupLayout(jPboton);
        jPboton.setLayout(jPbotonLayout);
        jPbotonLayout.setHorizontalGroup(
            jPbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPbotonLayout.setVerticalGroup(
            jPbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        TextBoton.setAlignment(java.awt.Label.CENTER);
        TextBoton.setBackground(new java.awt.Color(0, 134, 190));
        TextBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TextBoton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TextBoton.setForeground(new java.awt.Color(255, 255, 255));
        TextBoton.setText("ENTRAR");
        TextBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Login)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTUser, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                        .addComponent(JPassword)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)))
                .addGap(39, 39, 39))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPboton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(Login)
                .addGap(50, 50, 50)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(TextBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPboton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Background.add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 470, 550));

        BackGround.setForeground(new java.awt.Color(102, 102, 102));
        Background.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTUserActionPerformed

    private void jPanelBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
    }//GEN-LAST:event_jPanelBarMousePressed

    private void jPanelBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMouseDragged
        int xPantalla = evt.getXOnScreen();
        int yPantalla = evt.getYOnScreen();
        this.setLocation(xPantalla - xMouse,yPantalla - yMouse);
    }//GEN-LAST:event_jPanelBarMouseDragged

    private void jLButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLButtonExitMouseClicked

    private void jLButtonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonExitMouseEntered
        //jLButtonEnter1.setBackground(Color.white);
        jLButtonExit.setForeground(Color.red);
    }//GEN-LAST:event_jLButtonExitMouseEntered

    private void jLButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonExitMouseExited
        jLButtonExit.setForeground(Color.white);
    }//GEN-LAST:event_jLButtonExitMouseExited

    private void jPExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPExitMouseEntered
        
    }//GEN-LAST:event_jPExitMouseEntered

    private void JTUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUserMousePressed
        if(JTUser.getText().equals("Ingrese nombre de usuario")){
            JTUser.setText("");
            JTUser.setForeground(Color.black);
        }
        if(String.valueOf(JPassword.getPassword()).isEmpty()){
            JPassword.setText("********");
            JPassword.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_JTUserMousePressed

    private void JPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPasswordMousePressed
        if(String.valueOf(JPassword.getPassword()).equals("********")){
            JPassword.setText("");
            JPassword.setForeground(Color.black);
            
        }
        if(JTUser.getText().isEmpty()){
            JTUser.setText("Ingrese nombre de usuario");
            JTUser.setForeground(Color.gray); 
        }
        
    }//GEN-LAST:event_JPasswordMousePressed

    private void TextBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonMouseEntered
        TextBoton.setBackground(new Color(3,19,47));
        TextBoton.setForeground(Color.black);
    }//GEN-LAST:event_TextBotonMouseEntered

    private void TextBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBotonMouseExited
        TextBoton.setBackground(new Color(0,134,190));
        TextBoton.setForeground(Color.white);
    }//GEN-LAST:event_TextBotonMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JPanel Background;
    private javax.swing.JPasswordField JPassword;
    private javax.swing.JTextField JTUser;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Password;
    private java.awt.Label TextBoton;
    private javax.swing.JLabel User;
    private javax.swing.JLabel jLButtonExit;
    private javax.swing.JPanel jPExit;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPboton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
