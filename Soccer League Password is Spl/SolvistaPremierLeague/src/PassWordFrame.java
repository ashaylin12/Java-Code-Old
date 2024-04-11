import java.util.*;
import javax.swing.*;
import java.io.*;
public class PassWordFrame extends javax.swing.JFrame {
    
    private int hours   = 0;
    private int minutes = 0;
    private int seconds = 0;
    private int millis  = 0;
    private int month=0;
    private int year=0;
    private int day=0;
int c =1;
    public PassWordFrame() {
        initComponents();
    Calendar now = Calendar.getInstance();
        hours   = now.get(Calendar.HOUR);
        minutes = now.get(Calendar.MINUTE);
        seconds = now.get(Calendar.SECOND);
        millis  = now.get(Calendar.MILLISECOND);
        Date.setText(""+hours+":"+minutes+":"+seconds);
        year = now.get(Calendar.YEAR);
        month = now.get(Calendar.MONTH);
        day = now.get(Calendar.DAY_OF_MONTH);
       
       Time.setText(""+year+":"+(month+1)+":"+day);
       jPasswordField1.setText("");
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Time = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Animan/Christiano Ronaldo.gif")))); // NOI18N

        jLabel1.setFont(new java.awt.Font("EnglishTowne", 0, 24));
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("ENTER PASSWORD");

        Time.setEditable(false);
        Time.setText(" ");
        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });

        Date.setEditable(false);
        Date.setText(" ");

        jPasswordField1.setText("spl");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Adler", 3, 18));
        exit.setForeground(new java.awt.Color(204, 204, 0));
        exit.setText("EXIT PROGRAM");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Adler", 1, 18));
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setText("HINT?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("EnglishTowne", 1, 24));
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("DATE");

        jLabel3.setFont(new java.awt.Font("EnglishTowne", 1, 24));
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("TIME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Time)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                        .addContainerGap(104, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(jButton1))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_TimeActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
                 String Password = jPasswordField1.getText();
 
c++;
if(c==1 || c==2 || c==3 )
{
    if(Password.equalsIgnoreCase("Spl"))
    {
    this.dispose();
    new WelcomeFrame().setVisible(true);
    
    }   
    
    else
    {
  
    JOptionPane.showMessageDialog(null,"Wrong password");
    }
}

else
{
  
 this.dispose();
 new DeniedFrame().setVisible(true);
}
jPasswordField1.setText("");
jPasswordField1.setCaretPosition(0);

 System.out.println(c);  

        

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
     new PassWordHelp().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassWordFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Time;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
    
}

