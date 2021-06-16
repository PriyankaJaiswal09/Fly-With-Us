package AirlineBookingSystem;

public class Main1 extends javax.swing.JFrame {

    public Main1() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mum = new javax.swing.JLabel();
        chenn = new javax.swing.JLabel();
        kol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 732));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 732));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/pic3.jpg"))); // NOI18N
        mum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        mum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(mum, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 400, 220));

        chenn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/pic1.jpg"))); // NOI18N
        chenn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(chenn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 400, 220));

        kol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/pic2.png"))); // NOI18N
        kol.setText("jLabel3");
        kol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        kol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(kol, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 400, 220));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("About Us");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 240, 40));

        Login.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 0, 102));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Login");
        Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginMousePressed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 240, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Register");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 240, 40));

        close.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 50, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/main2.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
       
        sign s=new sign();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_LoginMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        Reg r=new Reg();
        r.setVisible(true);
        r.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      
        About a=new About();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMousePressed

    }//GEN-LAST:event_LoginMousePressed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Main1 m = new Main1();
               m.setLocationRelativeTo(null);
               m.setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel chenn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kol;
    private javax.swing.JLabel mum;
    // End of variables declaration//GEN-END:variables
}
