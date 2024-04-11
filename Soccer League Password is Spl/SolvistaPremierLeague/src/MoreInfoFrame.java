import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.util.*;
import java.io.*;
import java.sql.*;

public class MoreInfoFrame extends javax.swing.JFrame 
{
  SplMainDB mySoccer = new SplMainDB();
  int c = MainFrame.current;
  //*private Object output;
    int current=1;
  String tn ="";
  String ac = "";
  String sp="";
  String sk ="";
  String bp = "";
  String d = "";
  String a="";
  String p="";
   public MoreInfoFrame() 
   {
        initComponents();
       current = 1; 
       System.out.println("&&"+c);
     
        try
        {
          ResultSet rs = mySoccer.queryTbl("SELECT * FROM AttributeTable");
          int count=0;
          while (rs.next())
          {
             tn = rs.getString("TeamName");
             ac = rs.getString("AttributeCode");
             sp = rs.getString("Speed(%)");
             sk = rs.getString("Skill(%)");
             bp = rs.getString("BallPossession(%)");
             d = rs.getString("Defence(%)");
             a = rs.getString("Attacking(%)");
             p = rs.getString("Passing(%)");
            //System.out.println(tn);
                      
             if (count==c-1)
              {
                 System.out.println("**"+tn);
                jTextField1.setText(tn);
                jTextField2.setText(ac);
                jTextField3.setText(sp);
                jTextField4.setText(sk);
                jTextField5.setText(bp);
               jTextField6.setText(d);
               jTextField7.setText(a);
               jTextField8.setText(p);
               }
               count++;    
            }
            count=0;
            rs.close();
        }   
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
                                      
                                 
                                             
                                          

 
        
   }
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        mainFrame1 = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        insert3 = new javax.swing.JButton();
        delete3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo0.jpg")))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel1.setText("TEAM NAME");

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel2.setText("ATT CODE");

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel3.setText("SPEED (%)");

        jLabel4.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel4.setText("SKILL (%)");

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel5.setText("BALL POSSESSION (%)");

        jLabel6.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel6.setText("DEFENSE (%)");

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel7.setText("ATTACKING (%)");

        jLabel8.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel8.setText("PASSING (%)");

        jTextField1.setText(" ");

        jTextField2.setText(" ");

        jTextField3.setText(" ");

        jTextField4.setText(" ");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setText(" ");

        jTextField6.setText(" ");

        jTextField7.setText(" ");

        jTextField8.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo0.jpg")))); // NOI18N

        mainFrame1.setFont(new java.awt.Font("Adler", 1, 18));
        mainFrame1.setText("RETURN TO MAIN FRAME");
        mainFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrame1ActionPerformed(evt);
            }
        });

        exit1.setFont(new java.awt.Font("Adler", 1, 18));
        exit1.setText("EXIT PROGRAM");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/Spinning Football-87284.gif"))); // NOI18N
        jLabel9.setText(" ");

        insert3.setFont(new java.awt.Font("Adler", 1, 18));
        insert3.setText("INSERT ");
        insert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert3ActionPerformed(evt);
            }
        });

        delete3.setFont(new java.awt.Font("Adler", 1, 18));
        delete3.setText("DELETE");
        delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(insert3)
                        .addGap(100, 100, 100)
                        .addComponent(delete3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(exit1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert3)
                    .addComponent(delete3))
                .addGap(53, 53, 53)
                .addComponent(jLabel9)
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainFrame1)
                    .addComponent(exit1))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        this.dispose();
        new ExitFrame().setVisible(true);
    }//GEN-LAST:event_exit1ActionPerformed

    private void mainFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainFrame1ActionPerformed
        this.dispose();
        new MainFrame().setVisible(true); 
    }//GEN-LAST:event_mainFrame1ActionPerformed

    private void insert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert3ActionPerformed
      jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText(""); 
         jTextField6.setText("");
         jTextField7.setText("");
         jTextField8.setText("");        
         
         
                  String tn = JOptionPane.showInputDialog("Enter team Name");
                  jTextField1.setText(tn);
         
                  
                  
                 String ac =JOptionPane.showInputDialog("Enter attribute code");
                 jTextField2.setText(ac);
                  
                  
                  
                 String sp =JOptionPane.showInputDialog("Enter speed");
                 jTextField3.setText(sp);
                 
                 String sk =JOptionPane.showInputDialog("Enter skill");
                 jTextField4.setText(sk);
                 
                 String bp =JOptionPane.showInputDialog("Enter ball possession");
                 jTextField5.setText(bp);
       
                  String d =JOptionPane.showInputDialog("Enter defence");
                 jTextField6.setText(d);
           
                  String a =JOptionPane.showInputDialog("Enter attacking");
                 jTextField7.setText(a);
                 
                  String p =JOptionPane.showInputDialog("Enter passing");
                 jTextField8.setText(p);
                 
              try{
                 mySoccer.updateTbl("INSERT INTO AttributeTable (AttributeCode,Speed(%),Skill(%),BallPossession(%),Defence(%),Attacking(%),Passing(%)) values('"+ac+"','"+sp+"','"+sk+"','"+bp+"','"+d+"','"+a+"','"+p+"')");
                 
                 JOptionPane.showMessageDialog(null,"information added");
                 new MainFrame();
               }
             catch(Exception e)
                 {
                     System.out.println(e.getMessage());
                 }
        
                 try{
                 mySoccer.updateTbl("Update AttributeTable SET TeamName = '"+tn+"' WHERE AttributeCode ='"+ac+"'");
                 
                 JOptionPane.showMessageDialog(null,"information added");
                 new MainFrame();
               }
             catch(Exception e)
                 {
                     System.out.println(e.getMessage());
                 }
        
        
                
    
}//GEN-LAST:event_insert3ActionPerformed

    private void delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete3ActionPerformed
       String deleted = "";
 
 
                    
           deleted = JOptionPane.showInputDialog("Enter the Team you would like to delete");
          if (deleted.equals(""))
         {
       
          JOptionPane.showMessageDialog(null,"You have to enter data\nTry Again!!!"); 
          return;
        }
         try
         {
          mySoccer.updateTbl("DELETE FROM AttributeTable WHERE TeamName = '"+deleted+"'");
          new MoreInfoFrame();
     
          JOptionPane.showMessageDialog(null,"Information deleted!!!"); 
         }
         catch(SQLException e)
         {
           
          JOptionPane.showMessageDialog(null,"Error!Could not delete record!!!"); 
             System.out.println(e.getMessage());
         }
}//GEN-LAST:event_delete3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoreInfoFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete3;
    private javax.swing.JButton exit1;
    private javax.swing.JButton insert3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton mainFrame1;
    // End of variables declaration//GEN-END:variables
    
}
