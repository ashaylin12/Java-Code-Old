import javax.swing.*;
import java.io.*;
import java.sql.*;
public class SearchFrame extends javax.swing.JFrame {
    
SplMainDB mySoccer = new SplMainDB(); 
    String searchfield;
    String srch;
     String tn ="";
  String mp = "";
  String mw="";
  String md ="";
  String ml = "";
  int p = 0;
    public SearchFrame() {
        initComponents();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        team = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        mainFrame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Animan/c.ronaldo7.gif_160_160_256_32000_0_1_0.gif")))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        team.setFont(new java.awt.Font("Adler", 1, 14));
        team.setForeground(new java.awt.Color(153, 153, 153));
        team.setText("TEAM SEARCH");
        team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Adler", 1, 14));
        clear.setForeground(new java.awt.Color(153, 153, 153));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Adler", 1, 14));
        exit.setForeground(new java.awt.Color(153, 153, 153));
        exit.setText("EXIT PROGRAM");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        mainFrame.setFont(new java.awt.Font("Adler", 1, 14));
        mainFrame.setForeground(new java.awt.Color(153, 153, 153));
        mainFrame.setText("RETURN TO MAINFRAME");
        mainFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24));
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SEARCH...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(team, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel1))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(team)
                        .addGap(37, 37, 37)
                        .addComponent(clear)
                        .addGap(34, 34, 34)
                        .addComponent(mainFrame)
                        .addGap(35, 35, 35)
                        .addComponent(exit)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
  jTextArea1.setText(" ");
    }//GEN-LAST:event_clearActionPerformed

    private void mainFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainFrameActionPerformed
this.dispose();
new MainFrame().setVisible(true);
    }//GEN-LAST:event_mainFrameActionPerformed

    private void teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamActionPerformed
System.out.println("Format for Team Name is TeamName followed by grade,division eg) Manchester United(Grade 12(1))");
        String admis =JOptionPane.showInputDialog("Enter the Team Name to search");
        
        jTextArea1.append("\t\tTeamName\t\tMatchesPlayed\tMatchesWon\tMatchesDrawn\tMatchesLost\tPoints\n");
        jTextArea1.append("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
     
         try
         {
             
         ResultSet rs = mySoccer.queryTbl("SELECT * FROM LeagueTable");
         int count=0;
         while (rs.next())
         {
          tn = rs.getString("TeamName");
             mp = rs.getString("MatchesPlayed");
             mw = rs.getString("MatchesWon");
             md = rs.getString("MatchesDrawn");
             ml = rs.getString("MatchesLost");
             p = rs.getInt("Points");
         
         
          if (admis.equals(tn))
            jTextArea1.append("\t\t"+tn+"\t"+mp+"\t"+mw+"\t"+md+"\t"+ml+"\t"+p+"\t\t\n");
                   
         count++;    
       }
          rs.close();
     }   
      catch(Exception e)
      {
         System.out.println(e.getMessage());
      } 
        
    }//GEN-LAST:event_teamActionPerformed

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
                new SearchFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mainFrame;
    private javax.swing.JButton team;
    // End of variables declaration//GEN-END:variables
    
}
