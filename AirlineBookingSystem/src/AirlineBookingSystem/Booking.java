package AirlineBookingSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Booking extends javax.swing.JFrame {

    public Booking() {
        initComponents();
   
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        clas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        from = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        to = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 16, 43, 43));

        clas.setBackground(new java.awt.Color(0, 0, 51));
        clas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clas.setForeground(new java.awt.Color(255, 255, 255));
        clas.setMaximumRowCount(3);
        clas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "First", " " }));
        clas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasActionPerformed(evt);
            }
        });
        jPanel1.add(clas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("To");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 60, 30));

        from.setBackground(new java.awt.Color(0, 0, 51));
        from.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        from.setForeground(new java.awt.Color(255, 255, 255));
        from.setMaximumRowCount(3);
        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Chennai", "Kolkata", " " }));
        from.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });
        jPanel1.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 220, 30));

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 51));
        price.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Class");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 60, 30));

        to.setBackground(new java.awt.Color(0, 0, 51));
        to.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        to.setForeground(new java.awt.Color(255, 255, 255));
        to.setMaximumRowCount(3);
        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Chennai", "Kolkata", " " }));
        to.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });
        jPanel1.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 220, 30));

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 51));
        date.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Date of travel[DD/MM/YY]");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("From");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 60, 30));

        book.setBackground(new java.awt.Color(0, 0, 51));
        book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("Book And Download");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        jPanel1.add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/flightback.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 669, 300));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Your Flight !");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 67));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirlineBookingSystem/Icon/logout.jpg"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setMaximumSize(new java.awt.Dimension(100, 46));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 46));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 46));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        Main2 m=new Main2();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_closeMouseClicked

    private void clasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasActionPerformed
  
    }//GEN-LAST:event_clasActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed

    }//GEN-LAST:event_fromActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
   
    }//GEN-LAST:event_toActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
      
        if(from.getSelectedItem() == to.getSelectedItem())
                {
                    JOptionPane.showMessageDialog(null, "From and To destinations can't be the same.");
                }
            if(from.getSelectedItem() == "Mumbai")
            {
                if(to.getSelectedItem()=="Chennai"){
                    tprice = tprice + 800;
                }
                else{
                    tprice = tprice+1000;
                }
            }
            else if(from.getSelectedItem() == "Chennai")
            {
                if(to.getSelectedItem()=="Mumbai"){
                    tprice = tprice+800;
                }
                else{
                    tprice = tprice+1000;
                }
            }
            else{
                tprice= tprice+1000;
            }
            switch(clas.getSelectedIndex()){
                case 0:
                    tprice=tprice+200;
                    break;
                case 1:
                    tprice=tprice+250;
                    break;
                case 2:
                    tprice=tprice+300;
                    break;
            }
        try
            {
                Date date1=new SimpleDateFormat("dd/MM/yy").parse(date.getText());
                price.setText("$"+tprice);
                JOptionPane.showMessageDialog(null,"Ticket\nFrom:"+from.getSelectedItem()+"\nTo:"+to.getSelectedItem()+"\nPrice:$"+tprice+"\nClass:"+clas.getSelectedItem()+"\nDate of Travel:"+date.getText()+"\nThank You for Flying With Us!");
                BufferedWriter writer = null;
        try {
                writer = new BufferedWriter(new FileWriter("C:\\Users\\Siddhanth\\Documents\\NetBeansProjects\\AirlineBookingSystem\\src\\AirlineBookingSystem\\AirlineTicket.txt"));
                writer.write("YOUR AIRLINE TICKET!\nFrom:"+from.getSelectedItem()+"\nTo:"+to.getSelectedItem()+"\nPrice:$"+tprice+"\nClass:"+clas.getSelectedItem()+"\nDate of Travel:"+date.getText()+"\nThank You for Flying With Us!");
                JOptionPane.showMessageDialog(null,"Ticket Downloaded");
                
            } catch(IOException e2){
                System.err.println(e2);
                
            } finally {
            
                if (writer != null) {
                    
        try {
                writer.close();
            } catch (IOException e3){
                System.err.println(e3);
            }
        }
                
    }
 }
        catch(ParseException pe){
            
            JOptionPane.showMessageDialog(null, "Date must be in DD/MM/YY format only.");
        }
    }//GEN-LAST:event_bookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Main1 m=new Main1();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Booking b=new Booking();
                b.setVisible(true);
                b.setLocationRelativeTo(null);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JComboBox<String> clas;
    private javax.swing.JLabel close;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
    int tprice=0;  
}
