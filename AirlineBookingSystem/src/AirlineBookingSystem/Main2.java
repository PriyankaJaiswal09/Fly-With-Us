package AirlineBookingSystem;

public class Main2 extends javax.swing.JFrame {

    public Main2() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        details = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        ticket = new javax.swing.JLabel();
        flight = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chen = new javax.swing.JLabel();
        kol = new javax.swing.JLabel();
        mum = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(1214, 732));
        jPanel1.setPreferredSize(new java.awt.Dimension(1214, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        details.setForeground(new java.awt.Color(0, 0, 51));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("Flights Details");
        details.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsMouseClicked(evt);
            }
        });
        jPanel1.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, 40));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fly With Us");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 400, 70));

        close.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 50, 40));

        ticket.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ticket.setForeground(new java.awt.Color(0, 0, 51));
        ticket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticket.setText("Book Ticket");
        ticket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketMouseClicked(evt);
            }
        });
        jPanel1.add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 230, 40));

        flight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        flight.setForeground(new java.awt.Color(0, 0, 51));
        flight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flight.setText("Search Flight");
        flight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        flight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightMouseClicked(evt);
            }
        });
        jPanel1.add(flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, 40));

        jLabel7.setBackground(new java.awt.Color(51, 0, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>\n<body>\n<u>\nTourist Places\n</u>\n</body>\n</html>");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1210, 40));

        chen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/pic2.png"))); // NOI18N
        chen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chen.setMaximumSize(new java.awt.Dimension(400, 225));
        chen.setMinimumSize(new java.awt.Dimension(400, 225));
        chen.setPreferredSize(new java.awt.Dimension(400, 225));
        chen.setRequestFocusEnabled(false);
        chen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chenMouseClicked(evt);
            }
        });
        jPanel1.add(chen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 400, 210));

        kol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/pic3.jpg"))); // NOI18N
        kol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kol.setMaximumSize(new java.awt.Dimension(400, 225));
        kol.setMinimumSize(new java.awt.Dimension(400, 225));
        kol.setPreferredSize(new java.awt.Dimension(400, 225));
        kol.setRequestFocusEnabled(false);
        kol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kolMouseClicked(evt);
            }
        });
        jPanel1.add(kol, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 400, 210));

        mum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/pic1.jpg"))); // NOI18N
        mum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mum.setMaximumSize(new java.awt.Dimension(400, 225));
        mum.setMinimumSize(new java.awt.Dimension(400, 225));
        mum.setPreferredSize(new java.awt.Dimension(400, 225));
        mum.setRequestFocusEnabled(false);
        mum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mumMouseClicked(evt);
            }
        });
        jPanel1.add(mum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 400, 210));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/logout.jpg"))); // NOI18N
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setMaximumSize(new java.awt.Dimension(100, 46));
        logout.setMinimumSize(new java.awt.Dimension(100, 46));
        logout.setPreferredSize(new java.awt.Dimension(100, 46));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/main1.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setMaximumSize(new java.awt.Dimension(1214, 732));
        jLabel1.setMinimumSize(new java.awt.Dimension(1214, 732));
        jLabel1.setPreferredSize(new java.awt.Dimension(1214, 732));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void mumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mumMouseClicked

        mumbai m= new mumbai();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_mumMouseClicked

    private void chenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chenMouseClicked
 
        chennai c= new chennai();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
    }//GEN-LAST:event_chenMouseClicked

    private void kolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kolMouseClicked

        kolkata k= new kolkata();
        k.setVisible(true);
        k.setLocationRelativeTo(null);
    }//GEN-LAST:event_kolMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        Main1 m=new Main1();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_logoutActionPerformed

    private void ticketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketMouseClicked

        Booking a=new Booking();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_ticketMouseClicked

    private void flightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightMouseClicked
   
        flight f=new flight();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_flightMouseClicked

    private void detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMouseClicked

        details d= new details();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_detailsMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main2 m = new Main2();
                m.setVisible(true);
                m.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chen;
    private javax.swing.JLabel close;
    private javax.swing.JLabel details;
    private javax.swing.JLabel flight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kol;
    private javax.swing.JButton logout;
    private javax.swing.JLabel mum;
    private javax.swing.JLabel ticket;
    // End of variables declaration//GEN-END:variables
}
