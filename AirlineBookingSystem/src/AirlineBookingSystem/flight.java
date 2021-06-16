package AirlineBookingSystem;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class flight extends javax.swing.JFrame {

    public flight() {
        initComponents();
        table.getTableHeader().setFont(new Font("Seque UI",Font.BOLD,16));
        table.getTableHeader().setForeground(new Color(0,0,51));
                
    }  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        show = new javax.swing.JLabel();
        codebox = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setBackground(new java.awt.Color(0, 0, 51));
        show.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show.setForeground(new java.awt.Color(0, 0, 51));
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setText("Show");
        show.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 30));

        codebox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codebox.setForeground(new java.awt.Color(0, 0, 51));
        codebox.setText("e.g.F002");
        codebox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        codebox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeboxMouseClicked(evt);
            }
        });
        jPanel1.add(codebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 150, 30));

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 3));
        table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Flight Name", "Source", "Destination", "Class"
            }
        ));
        table.setGridColor(new java.awt.Color(0, 0, 51));
        table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table.setOpaque(false);
        table.setRowHeight(30);
        table.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 650, 120));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<body>\n<u>\nFlight Code\n</u>\n</body>\n</html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/flightback.jpg"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 669, 300));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Flight Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 26, 329, 53));

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
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 43, 39));

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
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeboxMouseClicked
       
        codebox.setText("");
    }//GEN-LAST:event_codeboxMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        Main1 m=new Main1();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_logoutActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
      
        Main2 m=new Main2();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_closeMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
 
        String code = codebox.getText();
                Connection dbconn = connect.connectDB();
                PreparedStatement st;
                try {
                    st = (PreparedStatement)
                    dbconn.prepareStatement("select f_code,f_name,src,dst,class_name from flight where f_code = '"+code+"'");
                    ResultSet res = st.executeQuery();
          
                    table.setModel(DbUtils.resultSetToTableModel(res));	
                    
                }catch(SQLException e){
                    e.printStackTrace();
                }
    }//GEN-LAST:event_showMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                flight f=new flight();
                f.setVisible(true);
                f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JTextField codebox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel show;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
