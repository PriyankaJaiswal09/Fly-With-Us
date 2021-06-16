package AirlineBookingSystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Reg extends javax.swing.JFrame {

    public Reg() {
        initComponents();
        
        jPanel1.setBackground(new Color (0,0,0,0));
        username.setBackground(new Color (0,0,0,0));
        email.setBackground(new Color (0,0,0,0));
        password.setBackground(new Color (0,0,0,0));
        confirmpassword.setBackground(new Color (0,0,0,0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        submit = new javax.swing.JButton();
        log = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 30));

        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f2.png"))); // NOI18N
        register.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        register.setPreferredSize(new java.awt.Dimension(90, 34));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 90, 34));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f1.png"))); // NOI18N
        login.setText("jButton1");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 90, 34));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 210, 30));

        email.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("Enter your Email ID");
        email.setBorder(null);
        email.setOpaque(false);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 270, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 270, 10));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 210, 30));

        confirmpassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        confirmpassword.setForeground(new java.awt.Color(153, 153, 153));
        confirmpassword.setText("password");
        confirmpassword.setBorder(null);
        confirmpassword.setOpaque(false);
        confirmpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmpasswordMouseClicked(evt);
            }
        });
        confirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(confirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 270, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 270, 10));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 210, 30));

        password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("password");
        password.setBorder(null);
        password.setOpaque(false);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 270, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 270, 10));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 210, 30));

        username.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Enter Username");
        username.setBorder(null);
        username.setOpaque(false);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 270, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 270, 10));

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f3.png"))); // NOI18N
        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 90, 30));

        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f5.png"))); // NOI18N
        log.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel1.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 90, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/new02.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 397, 509));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/new1.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        dispose();
        sign s=new sign();
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
     
    }//GEN-LAST:event_usernameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
        String s1 = username.getText();
        String s2 = email.getText();
        String s3 = String.valueOf(password.getPassword());
        String s4 = String.valueOf(confirmpassword.getPassword());
                
        if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Fill Up The Form Properly.","Error",JOptionPane.ERROR_MESSAGE);
            }
        else if(!s3.equals(s4))
        {
            JOptionPane.showMessageDialog(this,"Password does not match","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            userRegister(s1,s2,s3,s4);            
        }
    }//GEN-LAST:event_submitActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
     
        username.setText("");
        email.setText("");
        password.setText("");
        confirmpassword.setText("");
        
    }//GEN-LAST:event_registerActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

        email.setText("");
    }//GEN-LAST:event_emailActionPerformed

    private void confirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordActionPerformed
   
        confirmpassword.setText("");
    }//GEN-LAST:event_confirmpasswordActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      
        Main1 m = new Main1();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
     
        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
    
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void confirmpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmpasswordMouseClicked
    
         confirmpassword.setText("");
    }//GEN-LAST:event_confirmpasswordMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
      
        email.setText("");
    }//GEN-LAST:event_emailMouseClicked

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
    
        dispose();
        sign s=new sign();
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }//GEN-LAST:event_logActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reg r = new Reg();
                r.setLocationRelativeTo(null);
                r.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton log;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JButton submit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void userRegister(String s1, String s2, String s3, String s4) {
        Connection dbconn = connect.connectDB();
        PreparedStatement st;
        if(dbconn != null){
        try {
            st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO registration (username,emailid,password,confirmpassword) VALUES(?,?,?,?)");
            st.setString(1, s1);
            st.setString(2, s2);
            st.setString(3, s3);
            st.setString(4, s4);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this,"User data inserted.\n click on LOGIN to proceed.\n Thank You!","Success",JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }
       }else{
            System.out.println("the connection not available");
        }
    }
}
