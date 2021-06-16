package AirlineBookingSystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sign extends javax.swing.JFrame {

    public sign() {
        initComponents();
        
        jPanel1.setBackground(new Color (0,0,0,0));
        username.setBackground(new Color (0,0,0,0));
        password.setBackground(new Color (0,0,0,0));
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        checkbox = new javax.swing.JCheckBox();
        text = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
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
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 30));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f1.png"))); // NOI18N
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 90, 34));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 200, 40));

        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f2.png"))); // NOI18N
        register.setText("jButton1");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 80, 34));

        username.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Enter Username");
        username.setBorder(null);
        username.setOpaque(false);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 290, 30));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 310, 20));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 200, 40));

        password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("jPasswordField1");
        password.setBorder(null);
        password.setOpaque(false);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 310, 30));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 310, 20));

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f4.png"))); // NOI18N
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 90, 30));

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/f3.png"))); // NOI18N
        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 90, 30));

        checkbox.setBackground(new java.awt.Color(0, 51, 102));
        checkbox.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        checkbox.setForeground(new java.awt.Color(255, 255, 255));
        checkbox.setText("Agree");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });
        jPanel1.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, 20));

        text.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        text.setForeground(new java.awt.Color(50, 139, 182));
        text.setText("<html>\n<body>\n<u>Terms and Conditions</u>\n</body>\n</html>");
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 200, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/new02.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 410, 510));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/new1.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 510));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       
        username.setText("");
        password.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
      
    }//GEN-LAST:event_checkboxActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained

        username.setText("");
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
      
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
    
        Main1 m = new Main1();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
   
                String s1 = username.getText();
                String s2 = String.valueOf(password.getPassword());
                
                if (s1.isEmpty() || s2.isEmpty())
                {
                    JOptionPane.showMessageDialog(this,"Username/Password should not be empty","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    userLogin(s1,s2);
                }
    }//GEN-LAST:event_submitActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
     
        dispose();
        Reg r = new Reg();
        r.setVisible(true);
        r.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    
        username.setText("");
        password.setText("");
    }//GEN-LAST:event_loginActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sign s = new sign();
                s.setLocationRelativeTo(null);
                s.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JLabel text;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String s1, String s2) {
        Connection dbconn = connect.connectDB();
        PreparedStatement st;
        if(dbconn != null){
        try {
            st = (PreparedStatement)
                    dbconn.prepareStatement("Select * from registration WHERE username = ? AND password = ?");
            st.setString(1, s1);
            st.setString(2, s2);
            ResultSet res = st.executeQuery();
            if(res.next())
            {
                 Main2 m= new Main2();
                 m.setVisible(true);
                 m.setLocationRelativeTo(null);
                 
                 
            }else
            {
                System.out.println("username" + s1);
                System.out.println("password" + s2);
                JOptionPane.showMessageDialog(this,"Username/Password not found","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
        }
       }else{
            System.out.println("the connection not available");
        }
    }
}
