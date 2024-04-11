import java.sql.*;
import javax.swing.*;
import java.util.*;
public class ViewFrame extends javax.swing.JFrame {
    
    SplMainDB mySoccer = new SplMainDB();
    public ViewFrame() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        standings = new javax.swing.JButton();
        attribute = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Animan/manu4ever.gif_160_160_256_32000_0_1_0.gif")))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        standings.setFont(new java.awt.Font("Adler", 1, 18));
        standings.setForeground(new java.awt.Color(255, 0, 0));
        standings.setText("VIEW TEAM STANDINGS");
        standings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standingsActionPerformed(evt);
            }
        });

        attribute.setFont(new java.awt.Font("Adler", 1, 18));
        attribute.setForeground(new java.awt.Color(255, 0, 0));
        attribute.setText("VIEW TEAM ATTRIBUTES");
        attribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attributeActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Adler", 1, 18));
        clear.setForeground(new java.awt.Color(255, 0, 0));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Adler", 1, 18));
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("EXIT PROGRAM");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Adler", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("RETURN TO MAINFRAME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attribute, 0, 0, Short.MAX_VALUE)
                            .addComponent(standings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standings)
                    .addComponent(clear))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(attribute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(47, 47, 47)
                .addComponent(exit)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void standingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standingsActionPerformed
         jTextArea1.append("TeamName\t\t\tMatchesPlayed\t\tMatchesWon\t\tMatchesDrawn\t\tMatchesLost\t\tPoints\t\t\n");
        jTextArea1.append("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
         
        try
        {
          ResultSet rs = mySoccer.queryTbl("SELECT * FROM LeagueTable");
         int count=0;
         while (rs.next())
         {
         String  tn = rs.getString("TeamName");
            String mp = rs.getString("MatchesPlayed");
          String   mw = rs.getString("MatchesWon");
          String   md = rs.getString("MatchesDrawn");
            String ml = rs.getString("MatchesLost");
            int p = rs.getInt("Points");
          
          
             jTextArea1.append(tn+"\t\t\t"+mp+"\t\t"+mw+"\t\t"+md+"\t\t"+ml+"\t"+p);
                   
         count++; 
         jTextArea1.append("\n");
       }
          rs.close();
     }   
      catch(Exception e)
      {
         System.out.println(e.getMessage());
      } 
        
                                       
      
      
    }//GEN-LAST:event_standingsActionPerformed

    private void attributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attributeActionPerformed
    jTextArea1.append("TeamName\t\t\tAttributeCode\t\tSpeed(%)\t\tSkill(%)\t\tBallPossession(%)\t\tDefence(%)\t\tAttacking(%)\t\tPassing(%)\t\t\n");
        jTextArea1.append("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
         
        try
        {
          ResultSet rs = mySoccer.queryTbl("SELECT * FROM AttributeTable");
         int count=0;
         while (rs.next())
         {
        String tn = rs.getString("TeamName");
        String     ac = rs.getString("AttributeCode");
        String     sp = rs.getString("Speed(%)");
        String     sk = rs.getString("Skill(%)");
        String     bp = rs.getString("BallPossession(%)");
        String     d = rs.getString("Defence(%)");
        String     a = rs.getString("Attacking(%)");
        String     p = rs.getString("Passing(%)");
          
          
             jTextArea1.append(tn+"\t\t\t"+ac+"\t\t"+sp+"\t\t"+sk+"\t\t"+bp+"\t"+d+"\t\t"+a+"\t\t"+p);
                   
         count++;    
       jTextArea1.append("\n");
         }
          rs.close();
     }   
      catch(Exception e)
      {
         System.out.println(e.getMessage());
      } 
        
       
    }//GEN-LAST:event_attributeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      jTextArea1.setText(" ");
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    new MainFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
 this.dispose();
 new ExitFrame().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attribute;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton standings;
    // End of variables declaration//GEN-END:variables
    
}
