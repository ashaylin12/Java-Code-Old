import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.util.*;
import java.io.*;
import java.sql.*;
public class RecordFrame extends javax.swing.JFrame {
    
   SplMainDB mySoccer = new SplMainDB();
  int c = MainFrame.current;
    
  
           int current=1;
  String tn ="";
  String rec = "";
  int gs=0;
  int cs =0;
  
  public RecordFrame() {
        initComponents();
        
  
  
       current = 1; 
       System.out.println("&&"+c);
     
        try
        {
          ResultSet rs = mySoccer.queryTbl("SELECT * FROM RecordTable");
          int count=0;
          while (rs.next())
          {
             tn = rs.getString("TeamName");
             rec = rs.getString("RecordNo");
             gs = rs.getInt("GoalsScored");
             cs = rs.getInt("CleanSheets");
             
             
            //System.out.println(tn);
                      
             if (count==c-1)
              {
                 System.out.println("**"+tn);
                jTextField1.setText(tn);
                jTextField2.setText(rec);
                jTextField3.setText(String.valueOf(gs));
                jTextField4.setText(String.valueOf(cs));
               
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        delete3 = new javax.swing.JButton();
        insert3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo0.jpg")))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 102));

        jLabel1.setFont(new java.awt.Font("EnglishTowne", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("TEAM NAME");

        jLabel2.setFont(new java.awt.Font("EnglishTowne", 1, 18));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("RECORD NO");

        jLabel3.setFont(new java.awt.Font("EnglishTowne", 1, 18));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("GOALS SCORED");

        jLabel4.setFont(new java.awt.Font("EnglishTowne", 1, 18));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("CLEAN SHEETS");

        jTextField1.setText(" ");

        jTextField2.setText(" ");

        jTextField3.setText(" ");

        jTextField4.setText(" ");

        delete3.setFont(new java.awt.Font("Adler", 1, 18));
        delete3.setForeground(new java.awt.Color(0, 0, 204));
        delete3.setText("DELETE");
        delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete3ActionPerformed(evt);
            }
        });

        insert3.setFont(new java.awt.Font("Adler", 1, 18));
        insert3.setForeground(new java.awt.Color(0, 0, 204));
        insert3.setText("INSERT");
        insert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                .addContainerGap(48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert3)
                    .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(insert3)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(delete3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bran/Sorry.gif"))); // NOI18N
        jLabel5.setText(" ");

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Adler", 1, 18));
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("EXIT PROGRAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 0));
        jButton2.setFont(new java.awt.Font("Adler", 1, 18));
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("RETURN TO MAINFRAME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(105, 105, 105))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.dispose();
  new ExitFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
  new MainFrame().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void insert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert3ActionPerformed
 jTextField1.setText("");
         jTextField2.setText("");
       jTextField3.setText(String.valueOf(""));
                jTextField4.setText(String.valueOf(""));
               
         
        
     
                 
         
                  String tn = JOptionPane.showInputDialog("Enter team Name");
                  jTextField1.setText(tn);
              do{
                  String rec =JOptionPane.showInputDialog("Enter RecordNo");
                 jTextField2.setText(rec);
              }
                while (rec.length()!= 6);
                    
              int gs =Integer.parseInt(JOptionPane.showInputDialog("Enter GoalsScored"));
                 jTextField3.setText(String.valueOf(gs));
                
                 
             
                 
               
                 int cs =Integer.parseInt(JOptionPane.showInputDialog("Enter clean Sheets "));
                 jTextField4.setText(String.valueOf(cs));
                  
                
                 
              try{
                 
                 mySoccer.updateTbl("INSERT INTO RecordTable (TeamName,RecordNo,GoalsScored,CleanSheets)values('"+tn+"','"+rec+"',"+gs+","+cs+")");
                 new MainFrame();
                 JOptionPane.showMessageDialog(null,"information added");
                 
               }
             catch(Exception e)
                 {
                     System.out.println("Cannot Add");
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
          mySoccer.updateTbl("DELETE FROM RecordTable WHERE TeamName = '"+deleted+"'");
          new RecordFrame();
     
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
                new RecordFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete3;
    private javax.swing.JButton insert3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    
}
