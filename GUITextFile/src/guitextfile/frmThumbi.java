/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guitextfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author exam
 */
public class frmThumbi extends javax.swing.JFrame {
    
    /**
     * Creates new form frmThumbi
     */
    
    
    public frmThumbi() {
        
        int count = 0;
      

      
        
        
      
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchPNL = new javax.swing.JPanel();
        exitPNL = new javax.swing.JPanel();
        backPNL = new javax.swing.JPanel();
        restartPNL = new javax.swing.JPanel();
        fowardPNL = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        compName = new javax.swing.JLabel();
        compNameTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        co2Txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        leadTxt = new javax.swing.JTextField();
        hgTxt = new javax.swing.JTextField();
        exitBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        restartBTN = new javax.swing.JButton();
        readBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        fowardBTN = new javax.swing.JButton();

        jTextField1.setText(" ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Company Name : ");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout searchPNLLayout = new javax.swing.GroupLayout(searchPNL);
        searchPNL.setLayout(searchPNLLayout);
        searchPNLLayout.setHorizontalGroup(
            searchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        searchPNLLayout.setVerticalGroup(
            searchPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout exitPNLLayout = new javax.swing.GroupLayout(exitPNL);
        exitPNL.setLayout(exitPNLLayout);
        exitPNLLayout.setHorizontalGroup(
            exitPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        exitPNLLayout.setVerticalGroup(
            exitPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backPNLLayout = new javax.swing.GroupLayout(backPNL);
        backPNL.setLayout(backPNLLayout);
        backPNLLayout.setHorizontalGroup(
            backPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        backPNLLayout.setVerticalGroup(
            backPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout restartPNLLayout = new javax.swing.GroupLayout(restartPNL);
        restartPNL.setLayout(restartPNLLayout);
        restartPNLLayout.setHorizontalGroup(
            restartPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        restartPNLLayout.setVerticalGroup(
            restartPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fowardPNLLayout = new javax.swing.GroupLayout(fowardPNL);
        fowardPNL.setLayout(fowardPNLLayout);
        fowardPNLLayout.setHorizontalGroup(
            fowardPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        fowardPNLLayout.setVerticalGroup(
            fowardPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        compName.setText("Company Name : ");
        jPanel1.add(compName);
        compName.setBounds(30, 50, 120, 30);

        compNameTxt.setText(" ");
        jPanel1.add(compNameTxt);
        compNameTxt.setBounds(170, 50, 188, 30);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pollution Levels", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        co2Txt.setBackground(new java.awt.Color(255, 255, 51));
        co2Txt.setText(" ");

        jLabel3.setText("Carbon Dioxide");

        jLabel4.setText("Lead");

        jLabel5.setText("Mercury");

        leadTxt.setBackground(new java.awt.Color(255, 255, 0));
        leadTxt.setText(" ");

        hgTxt.setBackground(new java.awt.Color(255, 255, 51));
        hgTxt.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(leadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(co2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(co2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(leadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 110, 340, 170);

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        jPanel1.add(exitBTN);
        exitBTN.setBounds(290, 320, 120, 23);

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        jPanel1.add(backBTN);
        backBTN.setBounds(10, 350, 80, 23);

        restartBTN.setText("Restart");
        restartBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBTNActionPerformed(evt);
            }
        });
        jPanel1.add(restartBTN);
        restartBTN.setBounds(170, 350, 73, 23);

        readBtn.setText("Read Data");
        readBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readBtnActionPerformed(evt);
            }
        });
        jPanel1.add(readBtn);
        readBtn.setBounds(10, 320, 110, 23);

        searchBtn.setText("Search Company");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn);
        searchBtn.setBounds(140, 320, 130, 23);

        fowardBTN.setText("Foward");
        fowardBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fowardBTNActionPerformed(evt);
            }
        });
        jPanel1.add(fowardBTN);
        fowardBTN.setBounds(330, 350, 80, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
       
        System.exit(0);
        this.dispose();
        
        
    }//GEN-LAST:event_exitBTNActionPerformed

    private void readBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readBtnActionPerformed
    searchBtn.setVisible(false);
    
 
               try{
                   
                                     
             
             Scanner kb = new Scanner (new FileReader ("inputs.txt"));
             boolean found = false;
            
             int add = 0;
             if(kb.hasNext())
             
             {
            
                 String cm = kb.nextLine();
                 String [] piece = cm.split("#");
                 
              
                 
                 compNameTxt.setText(piece [0]);
                 co2Txt.setText(piece [1]);
                 leadTxt.setText(piece [2]);
                 hgTxt.setText(piece [3]);
                
                 
             
                 
                 
                 }
             }
             
                
         
          catch(FileNotFoundException e)
         {
             
             JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
         
         }
         
    
    }//GEN-LAST:event_readBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed


        fowardBTN.setVisible(false);
        backBTN.setVisible(false);
        readBtn.setVisible(false);
        
       String cName = JOptionPane.showInputDialog(null,"Please put in a company name to search");


               try{
                   
                                     
             
             Scanner kb = new Scanner (new FileReader ("inputs.txt"));
             boolean found = false;
            
             int add = 0;
             while(kb.hasNext())
             
             {
            
                 String cm = kb.nextLine();
                 String [] piece = cm.split("#");
                 
                 if(piece [0] .equals(cName)){
                 
                 compNameTxt.setText(piece [0]);
                 co2Txt.setText(piece [1]);
                 leadTxt.setText(piece [2]);
                 hgTxt.setText(piece [3]);
                 found = true;
                 
             
                 }
               
             }
             
               
                 if (found != true){
                 JOptionPane.showMessageDialog(null, "The Company " +cName + "Cannot be found.");
                 }
             
           }       
         
          catch(FileNotFoundException e)
         {
             
             JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
         
         }
         
    }//GEN-LAST:event_searchBtnActionPerformed

    private void restartBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBTNActionPerformed
int count = 0;
fowardBTN.setVisible(true);
backBTN.setVisible(true);
readBtn.setVisible(true); 
restartBTN.setVisible(true);  
searchBtn.setVisible(true);  
exitBTN.setVisible(true); 

        
      co2Txt.setText("");
        compNameTxt.setText("");  
        leadTxt.setText("");
        
    

        
    }//GEN-LAST:event_restartBTNActionPerformed

    private void fowardBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fowardBTNActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_fowardBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
   
         
    }//GEN-LAST:event_backBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmThumbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmThumbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmThumbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmThumbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThumbi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JPanel backPNL;
    private javax.swing.JTextField co2Txt;
    private javax.swing.JLabel compName;
    private javax.swing.JTextField compNameTxt;
    private javax.swing.JButton exitBTN;
    private javax.swing.JPanel exitPNL;
    private javax.swing.JButton fowardBTN;
    private javax.swing.JPanel fowardPNL;
    private javax.swing.JTextField hgTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField leadTxt;
    private javax.swing.JButton readBtn;
    private javax.swing.JButton restartBTN;
    private javax.swing.JPanel restartPNL;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel searchPNL;
    // End of variables declaration//GEN-END:variables
}

