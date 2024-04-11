import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.swing.border.*;
import javax.accessibility.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.ImageIcon.*;


public class MainFrame extends javax.swing.JFrame 
{
  SplMainDB mySoccer = new SplMainDB();
  private Object output;
    static int current=1;
  String tn ="";
  String mp = "";
  String mw="";
  String md ="";
  String ml = "";
  int p = 0;
       
   public MainFrame() 
   {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        firstRecord = new javax.swing.JButton();
        lastRecord = new javax.swing.JButton();
        nextRecord = new javax.swing.JButton();
        previousRecord = new javax.swing.JButton();
        information = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        insert = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        update = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        editteam = new javax.swing.JMenuItem();
        editplayed = new javax.swing.JMenuItem();
        editWon = new javax.swing.JMenuItem();
        editDrawn = new javax.swing.JMenuItem();
        editLost = new javax.swing.JMenuItem();
        editPoints = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        editTeam2 = new javax.swing.JMenuItem();
        editAtt = new javax.swing.JMenuItem();
        editSpeed = new javax.swing.JMenuItem();
        editSkiil = new javax.swing.JMenuItem();
        editBallPos = new javax.swing.JMenuItem();
        editDefence = new javax.swing.JMenuItem();
        editAttack = new javax.swing.JMenuItem();
        editPassing = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        editTeam3 = new javax.swing.JMenuItem();
        editRec = new javax.swing.JMenuItem();
        editGoals = new javax.swing.JMenuItem();
        editClean = new javax.swing.JMenuItem();
        calculations = new javax.swing.JMenu();
        Winner = new javax.swing.JMenuItem();
        averagePoints = new javax.swing.JMenuItem();
        AverageGoals = new javax.swing.JMenuItem();
        total = new javax.swing.JMenuItem();
        search = new javax.swing.JMenuItem();
        exit1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ViewAll = new javax.swing.JMenuItem();
        ViewSort = new javax.swing.JMenuItem();
        Clear = new javax.swing.JMenuItem();
        print = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        userGuide = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();
        License = new javax.swing.JMenuItem();
        exit2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo0.jpg")))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" TEAM NAME");

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("MATCHES PLAYED");

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("MATCHES WON");

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("MATCHES DRAWN");

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("MATCHES LOST");

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("POINTS");

        jTextField1.setEditable(false);
        jTextField1.setText(" ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText(" ");

        jTextField3.setEditable(false);
        jTextField3.setText(" ");

        jTextField4.setEditable(false);
        jTextField4.setText(" ");

        jTextField5.setEditable(false);
        jTextField5.setText(" ");

        jTextField6.setEditable(false);
        jTextField6.setText(" ");

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUTTONZ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 1, 12), new java.awt.Color(51, 51, 51)));

        firstRecord.setBackground(new java.awt.Color(102, 102, 102));
        firstRecord.setFont(new java.awt.Font("Adler", 1, 12));
        firstRecord.setForeground(new java.awt.Color(0, 255, 0));
        firstRecord.setText("FIRST RECORD");
        firstRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstRecordActionPerformed(evt);
            }
        });

        lastRecord.setBackground(new java.awt.Color(102, 102, 102));
        lastRecord.setFont(new java.awt.Font("Adler", 1, 12));
        lastRecord.setForeground(new java.awt.Color(51, 255, 0));
        lastRecord.setText("LAST RECORD");
        lastRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastRecordActionPerformed(evt);
            }
        });

        nextRecord.setBackground(new java.awt.Color(102, 102, 102));
        nextRecord.setFont(new java.awt.Font("Adler", 1, 12));
        nextRecord.setForeground(new java.awt.Color(51, 255, 0));
        nextRecord.setText("NEXT RECORD");
        nextRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRecordActionPerformed(evt);
            }
        });

        previousRecord.setBackground(new java.awt.Color(102, 102, 102));
        previousRecord.setFont(new java.awt.Font("Adler", 1, 12));
        previousRecord.setForeground(new java.awt.Color(51, 255, 0));
        previousRecord.setText("PREVIOUS RECORD");
        previousRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousRecordActionPerformed(evt);
            }
        });

        information.setBackground(new java.awt.Color(102, 102, 102));
        information.setFont(new java.awt.Font("Adler", 1, 12));
        information.setForeground(new java.awt.Color(51, 255, 0));
        information.setText("MORE INFORMATION..");
        information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(102, 102, 102));
        exit.setFont(new java.awt.Font("Adler", 1, 12));
        exit.setForeground(new java.awt.Color(51, 255, 0));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Adler", 1, 12));
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setText("TEAM RECORDS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(previousRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(information, javax.swing.GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstRecord)
                    .addComponent(nextRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(information))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousRecord)
                    .addComponent(lastRecord)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel7.setText(" ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bran/man utd.gif"))); // NOI18N
        jLabel8.setText(" ");

        jLabel9.setFont(new java.awt.Font("GassyGaut", 1, 80));
        jLabel9.setForeground(new java.awt.Color(51, 255, 0));
        jLabel9.setText("S.P.L");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bran/magiccr19zbthumb.gif"))); // NOI18N
        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        insert.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        insert.setBackground(new java.awt.Color(255, 204, 0));
        insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo11.jpg"))); // NOI18N
        insert.setText("Insert                  ");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jMenu1.add(insert);

        delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        delete.setBackground(new java.awt.Color(255, 153, 153));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo13.jpg"))); // NOI18N
        delete.setText("Delete       ");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jMenu1.add(delete);

        update.setBackground(new java.awt.Color(204, 255, 51));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo1.jpg"))); // NOI18N
        update.setText("Update");

        jMenu8.setText("League Table");

        editteam.setText("Team Name");
        editteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editteamActionPerformed(evt);
            }
        });
        jMenu8.add(editteam);

        editplayed.setText("Matches Played");
        editplayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editplayedActionPerformed(evt);
            }
        });
        jMenu8.add(editplayed);

        editWon.setText("Matches Won");
        editWon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editWonActionPerformed(evt);
            }
        });
        jMenu8.add(editWon);

        editDrawn.setText("Matches Drawn");
        editDrawn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDrawnActionPerformed(evt);
            }
        });
        jMenu8.add(editDrawn);

        editLost.setText("MatchesLost");
        editLost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLostActionPerformed(evt);
            }
        });
        jMenu8.add(editLost);

        editPoints.setText("Points");
        editPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPointsActionPerformed(evt);
            }
        });
        jMenu8.add(editPoints);

        update.add(jMenu8);

        jMenu9.setText("Attribute Table");

        editTeam2.setText("Team Name");
        editTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeam2ActionPerformed(evt);
            }
        });
        jMenu9.add(editTeam2);

        editAtt.setText("Att Code");
        editAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAttActionPerformed(evt);
            }
        });
        jMenu9.add(editAtt);

        editSpeed.setText("Speed");
        editSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSpeedActionPerformed(evt);
            }
        });
        jMenu9.add(editSpeed);

        editSkiil.setText("Skill");
        editSkiil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSkiilActionPerformed(evt);
            }
        });
        jMenu9.add(editSkiil);

        editBallPos.setText("Ball Possession");
        editBallPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBallPosActionPerformed(evt);
            }
        });
        jMenu9.add(editBallPos);

        editDefence.setText("Defence");
        editDefence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDefenceActionPerformed(evt);
            }
        });
        jMenu9.add(editDefence);

        editAttack.setText("Attacking");
        editAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAttackActionPerformed(evt);
            }
        });
        jMenu9.add(editAttack);

        editPassing.setText("Passing");
        editPassing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPassingActionPerformed(evt);
            }
        });
        jMenu9.add(editPassing);

        update.add(jMenu9);

        jMenu7.setText("Record Table");

        editTeam3.setText("Team Name");
        editTeam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeam3ActionPerformed(evt);
            }
        });
        jMenu7.add(editTeam3);

        editRec.setText("Record No");
        editRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRecActionPerformed(evt);
            }
        });
        jMenu7.add(editRec);

        editGoals.setText("Goals Scored");
        editGoals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGoalsActionPerformed(evt);
            }
        });
        jMenu7.add(editGoals);

        editClean.setText("Cleen Sheets");
        editClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCleanActionPerformed(evt);
            }
        });
        jMenu7.add(editClean);

        update.add(jMenu7);

        jMenu1.add(update);

        calculations.setBackground(new java.awt.Color(204, 0, 0));
        calculations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo241.jpg"))); // NOI18N
        calculations.setText("Calculations");

        Winner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        Winner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/Picture 001.png"))); // NOI18N
        Winner.setText("Tournament Winner( highest points)");
        Winner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WinnerActionPerformed(evt);
            }
        });
        calculations.add(Winner);

        averagePoints.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        averagePoints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/Picture 001.png"))); // NOI18N
        averagePoints.setText("Average points");
        averagePoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averagePointsActionPerformed(evt);
            }
        });
        calculations.add(averagePoints);

        AverageGoals.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        AverageGoals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/Picture 001.png"))); // NOI18N
        AverageGoals.setText("Average Goals Scored");
        AverageGoals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AverageGoalsActionPerformed(evt);
            }
        });
        calculations.add(AverageGoals);

        total.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sou/Picture 001.png"))); // NOI18N
        total.setText("Total goals");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        calculations.add(total);

        jMenu1.add(calculations);

        search.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        search.setBackground(new java.awt.Color(0, 204, 255));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo7.jpg"))); // NOI18N
        search.setText("Search And Display");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jMenu1.add(search);

        exit1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        exit1.setBackground(new java.awt.Color(204, 0, 204));
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo3.jpg"))); // NOI18N
        exit1.setText("Exit program");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        jMenu1.add(exit1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bran/magiccr19zbthumb.gif"))); // NOI18N
        jMenu2.setText("View");

        ViewAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ViewAll.setBackground(new java.awt.Color(153, 255, 0));
        ViewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo9.jpg"))); // NOI18N
        ViewAll.setText("View All Data     ");
        ViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllActionPerformed(evt);
            }
        });
        jMenu2.add(ViewAll);

        ViewSort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        ViewSort.setBackground(new java.awt.Color(153, 0, 153));
        ViewSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo44.jpg"))); // NOI18N
        ViewSort.setText("View Sorted Data");
        ViewSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSortActionPerformed(evt);
            }
        });
        jMenu2.add(ViewSort);

        Clear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        Clear.setBackground(new java.awt.Color(153, 153, 0));
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo5.jpg"))); // NOI18N
        Clear.setText("Clear Screen");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jMenu2.add(Clear);

        jMenuBar1.add(jMenu2);

        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bran/magiccr19zbthumb.gif"))); // NOI18N
        print.setText("Printing");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setBackground(new java.awt.Color(0, 0, 255));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo10.jpg"))); // NOI18N
        jMenuItem8.setText("Printing");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        print.add(jMenuItem8);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        Exit.setBackground(new java.awt.Color(255, 51, 51));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo243.jpg"))); // NOI18N
        Exit.setText("Exit Program");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        print.add(Exit);

        jMenuBar1.add(print);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bran/magiccr19zbthumb.gif"))); // NOI18N
        jMenu5.setText("Help");

        userGuide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        userGuide.setBackground(new java.awt.Color(255, 255, 0));
        userGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo12.jpg"))); // NOI18N
        userGuide.setText("User Guide");
        userGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuideActionPerformed(evt);
            }
        });
        jMenu5.add(userGuide);

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        About.setBackground(new java.awt.Color(0, 153, 0));
        About.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo144.jpg"))); // NOI18N
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu5.add(About);

        License.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        License.setBackground(new java.awt.Color(255, 51, 255));
        License.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo45.jpg"))); // NOI18N
        License.setText("License");
        License.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LicenseActionPerformed(evt);
            }
        });
        jMenu5.add(License);

        exit2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        exit2.setBackground(new java.awt.Color(0, 102, 102));
        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S0u/logo47.jpg"))); // NOI18N
        exit2.setText("Exit");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });
        jMenu5.add(exit2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
this.dispose();
new ExitFrame().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void firstRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstRecordActionPerformed
     current = 1;
        try
        {
          ResultSet rs = mySoccer.queryTbl("SELECT *FROM LeagueTable");
          int count=0;
          while (rs.next())
          {
             tn = rs.getString("TeamName");
             mp = rs.getString("MatchesPlayed");
             mw = rs.getString("MatchesWon");
             md = rs.getString("MatchesDrawn");
             ml = rs.getString("MatchesLost");
             p = rs.getInt("Points");
            
                      
             if (count==0)
              {
                jTextField1.setText(tn);
                jTextField2.setText(mp);
                jTextField3.setText(mw);
                jTextField4.setText(md);
                jTextField5.setText(ml);
               jTextField6.setText(String.valueOf(p));
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
                                      
                                 
                                             
    }//GEN-LAST:event_firstRecordActionPerformed

    private void nextRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRecordActionPerformed
         current++;
        System.out.println(current);
        try
        {
         ResultSet rs = mySoccer.queryTbl("SELECT * FROM LeagueTable");
             
         for (int i=1; i<=current;i++)
         {
           rs.next();
         }
              tn = rs.getString("TeamName");
             mp = rs.getString("MatchesPlayed");
             mw = rs.getString("MatchesWon");
             md = rs.getString("MatchesDrawn");
             ml = rs.getString("MatchesLost");
             p = rs.getInt("Points");
            
                      
            
              
                jTextField1.setText(tn);
                jTextField2.setText(mp);
                jTextField3.setText(mw);
                jTextField4.setText(md);
                jTextField5.setText(ml);
               jTextField6.setText(String.valueOf(p));
          rs.close();
        }
       catch (Exception e)
       {
        System.out.println("No contents");
       }        
        
    
    }//GEN-LAST:event_nextRecordActionPerformed

    private void previousRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousRecordActionPerformed
     try
        {
         if (current >0)
          current--;
      
         ResultSet rs = mySoccer.queryTbl("SELECT* FROM LeagueTable");
         for (int i=0; i < current; i++)
           rs.next();
                 
            tn = rs.getString("TeamName");
             mp = rs.getString("MatchesPlayed");
             mw = rs.getString("MatchesWon");
             md = rs.getString("MatchesDrawn");
             ml = rs.getString("MatchesLost");
             p = rs.getInt("Points");
            
                      
          
             
                jTextField1.setText(tn);
                jTextField2.setText(mp);
                jTextField3.setText(mw);
                jTextField4.setText(md);
                jTextField5.setText(ml);
               jTextField6.setText(String.valueOf(p));
          rs.close();
        }
         catch (Exception e)
         {
             System.out.println(e.getMessage());
         }            
                                         

    }//GEN-LAST:event_previousRecordActionPerformed

private void lastRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastRecordActionPerformed
   
         current = 1;
        try
        {
          ResultSet rs = mySoccer.queryTbl("SELECT *FROM LeagueTable");
          int count=0;
          while (rs.next())
           {
              tn = rs.getString("TeamName");
             mp = rs.getString("MatchesPlayed");
             mw = rs.getString("MatchesWon");
             md = rs.getString("MatchesDrawn");
             ml = rs.getString("MatchesLost");
             p = rs.getInt("Points");
            
                      
             
             
                jTextField1.setText(tn);
                jTextField2.setText(mp);
                jTextField3.setText(mw);
                jTextField4.setText(md);
                jTextField5.setText(ml);
               jTextField6.setText(String.valueOf(p));                 
       count++;    
      }
       count--;
       rs.close();
   }   
    catch(Exception e)
    {
       System.out.println(e.getMessage());
    }
  int count1=0;
       try{
            ResultSet rs = mySoccer.queryTbl("SELECT count(ATeamName)AS Team FROM LeagueTable;");
           while (rs.next())
        {
              count1 = rs.getInt("no");
             
        }
            rs.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        current = count1;
                                        

}//GEN-LAST:event_lastRecordActionPerformed

private void informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationActionPerformed
    this.dispose();
    new MoreInfoFrame().setVisible(true);
}//GEN-LAST:event_informationActionPerformed

private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
      
    
    
    jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText(""); 
         jTextField6.setText("");
      
        
         
         
         
         
         
         
         
                
         JOptionPane.showMessageDialog(null,"The Format for team name is Team Name(Grade no.(division)");
         String tn = JOptionPane.showInputDialog("Enter team Name"); 
         if (tn.equals(""))
         {
     
                  
                          JOptionPane.showMessageDialog(null,"You have to enter data \nyou cannot enter nothing\nTry Again!!!"); 
          return;
         }
         
                  jTextField1.setText(tn);
              
         
         
                 String mp =JOptionPane.showInputDialog("Enter matchesplayed");
                if (mp.equals(""))
         {
     
                  
                          JOptionPane.showMessageDialog(null,"You have to enter data \nyou cannot enter nothing\nTry Again!!!"); 
          return;
         }
                  jTextField2.setText(mp);
           
                  
                 
                 String mw =JOptionPane.showInputDialog("Enter matches won");
                 if (mw.equals(""))
         {
     
                  
                          JOptionPane.showMessageDialog(null,"You have to enter data \nyou cannot enter nothing\nTry Again!!!"); 
          return;
         }
                  
                  
                 jTextField3.setText(String.valueOf(mw));
                
                 
                 String md =JOptionPane.showInputDialog("Enter matches drawn");
                 if (md.equals(""))
         {
     
                  
                          JOptionPane.showMessageDialog(null,"You have to enter data \nyou cannot enter nothing\nTry Again!!!"); 
          return;
         }
                  
                  
                 jTextField4.setText(md);
                  
                 
             String ml =JOptionPane.showInputDialog("Enter matches lost");
                
                  if (ml.equals(""))
         {
     
                  
                          JOptionPane.showMessageDialog(null,"You have to enter data \nyou cannot enter nothing\nTry Again!!!"); 
          return;
         }
                 
                  jTextField5.setText(String.valueOf(ml));
               
                 int p =Integer.parseInt(JOptionPane.showInputDialog("Enter points "));
                 if(p>30)
                 {
                                  
                          JOptionPane.showMessageDialog(null,"Error \nmaximum points allowed is 30\nTry Again!!!"); 
          return;
         
                 }
                 jTextField6.setText(String.valueOf(p));
                  
               
                 
                 
              try{
                 mySoccer.updateTbl("INSERT INTO LeagueTable (TeamName,MatchesPlayed,MatchesWon,MatchesDrawn,MatchesLost,Points)values('"+tn+"','"+mp+"','"+mw+"','"+md+"','"+ml+"',"+p+")");
                 new MainFrame();
                 JOptionPane.showMessageDialog(null,"information added");
                 
               }
              
             catch(Exception e)
                 {
                              JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!"); 
           System.out.println(e.getMessage());

                 }
        
                 
        
                
    
}//GEN-LAST:event_insertActionPerformed

private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
           
     
   JOptionPane.showMessageDialog(null,"The Format for team name is Team Name(Grade no.(division)");
      String deleted = "";
 
 
                    
           deleted = JOptionPane.showInputDialog("Enter the Team you would like to delete");
          if (deleted.equals(""))
         {
       
          JOptionPane.showMessageDialog(null,"You have to enter data\nTry Again!!!"); 
          return;
        }
         try
         {
          mySoccer.updateTbl("DELETE FROM LeagueTable WHERE TeamName = '"+deleted+"'");
          new MainFrame();
     
          JOptionPane.showMessageDialog(null,"Information deleted!!!"); 
         }
         catch(SQLException e)
         {
           
          JOptionPane.showMessageDialog(null,"Error!Could not delete record!!! The Format for team name is Team Name(Grade no.(division) " +
                  ""); 
             System.out.println(e.getMessage());
         }
        
                      
       
            
}//GEN-LAST:event_deleteActionPerformed

private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
   this.dispose();
   new ExitFrame().setVisible(true);
}//GEN-LAST:event_exit1ActionPerformed

private void ViewSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSortActionPerformed
  this.hide();
    new SortFrame().setVisible(true);
}//GEN-LAST:event_ViewSortActionPerformed

private void ViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllActionPerformed
   this.dispose();
   new ViewFrame().setVisible(true);
}//GEN-LAST:event_ViewAllActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
 this.dispose();
 new SearchFrame().setVisible(true);
}//GEN-LAST:event_jMenu1ActionPerformed

private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
        jTextField6.setText(" ");
       
}//GEN-LAST:event_ClearActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
   
         PrinterJob job = PrinterJob.getPrinterJob();
  job.getJobName();
  boolean ok = job.printDialog();
  if (ok) 
  {
    try
    {
	  job.print();
    
    JOptionPane.showMessageDialog(null,"Can not print!");
    }
 catch (PrinterException ex) 
 {
 System.out.println(ex.getMessage());
 }
  }
    }                                     

    private void exitPrintingActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
        jTextField6.setText(" ");
       
        System.exit(0);
                                   

}//GEN-LAST:event_jMenuItem8ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
 this.dispose();
 new MainFrame().setVisible(true);
}//GEN-LAST:event_ExitActionPerformed

    private void userGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuideActionPerformed
  this.dispose();
        new HelpFrame().setVisible(true);
}//GEN-LAST:event_userGuideActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
       this.dispose();
     new AboutFrame().setVisible(true);
}//GEN-LAST:event_AboutActionPerformed

    private void LicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LicenseActionPerformed
this.dispose();
     new LicenseFrame().setVisible(true);
}//GEN-LAST:event_LicenseActionPerformed

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
     jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
        jTextField6.setText(" ");
  
        System.exit(0);
}//GEN-LAST:event_exit2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  this.dispose();
  new RecordFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AverageGoalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AverageGoalsActionPerformed
 double avg=0;
        
        try
     {
       
       ResultSet rs = mySoccer.queryTbl("SELECT AVG([GoalsScored])AS[Average Goals Scored] FROM RecordTable;");
       while (rs.next())
        {
         avg = rs.getDouble("Average Goals Scored");
        
        
        }
         rs.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
          JOptionPane.showMessageDialog(null,"The average goals scored are "+avg);    
}//GEN-LAST:event_AverageGoalsActionPerformed

    private void editteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editteamActionPerformed
   JOptionPane.showMessageDialog(null,"The Format for team name is Team Name(Grade no.(division)");
        String updateTeam = JOptionPane.showInputDialog("Enter the Team Name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new Team Name");
            
        try
             {
              mySoccer.updateTbl("UPDATE LeagueTable SET TeamName = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Format for team name is Team Name(Grade no.(division)"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    }//GEN-LAST:event_editteamActionPerformed

    private void editplayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editplayedActionPerformed
     JOptionPane.showMessageDialog(null,"Not more than 10 matches can be played");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new matches played");
             try
             {
              mySoccer.updateTbl("UPDATE LeagueTable SET MatchesPlayed = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Not more than 10 matches can be Played"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    }//GEN-LAST:event_editplayedActionPerformed

    private void editWonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editWonActionPerformed
      JOptionPane.showMessageDialog(null,"Not more than 10 matches can be won");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new matches Won");
             try
             {
              mySoccer.updateTbl("UPDATE LeagueTable SET MatchesWon = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Not more than 10 matches can be Won"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
    }//GEN-LAST:event_editWonActionPerformed

    private void editDrawnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDrawnActionPerformed
     JOptionPane.showMessageDialog(null,"Not more than 10 matches can be Drawn");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new matches Drawn");
             try
             {
              mySoccer.updateTbl("UPDATE LeagueTable SET MatchesDrawn = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Not more than 10 matches can be Drawnn"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
    }//GEN-LAST:event_editDrawnActionPerformed

    private void editLostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLostActionPerformed
    JOptionPane.showMessageDialog(null,"Not more than 10 matches can be Lost");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new matches lost");
             try
             {
              mySoccer.updateTbl("UPDATE LeagueTable SET MatchesLost = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Not more than 10 matches can be Lost"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
    }//GEN-LAST:event_editLostActionPerformed

    private void editPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPointsActionPerformed
       JOptionPane.showMessageDialog(null,"Not more than 30 points may be obtained");
        String updatePoints = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new amount of points");
             try
             {
              mySoccer.updateTbl("UPDATE LeagueTable SET Points = '"+newInfo+"' WHERE TeamName = '"+updatePoints+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!points must be <=30"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
    }//GEN-LAST:event_editPointsActionPerformed

    private void editTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeam2ActionPerformed
      JOptionPane.showMessageDialog(null,"The Format for team name is Team Name(Grade no.(division)");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new Team Name");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET TeamName = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Format for team name is Team Name(Grade no.(division)"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
    }//GEN-LAST:event_editTeam2ActionPerformed

    private void editAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAttActionPerformed
        JOptionPane.showMessageDialog(null,"The Format for Attribute code is Att000");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new Attribute code");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET MatchesPlayed = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Format for Attribute code is Att000"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
    }//GEN-LAST:event_editAttActionPerformed

private void editSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSpeedActionPerformed
  JOptionPane.showMessageDialog(null,"Rating must be <= 100");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter rating for skill");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET Speed = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Rating must be <=100"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
}//GEN-LAST:event_editSpeedActionPerformed

private void editSkiilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSkiilActionPerformed
     JOptionPane.showMessageDialog(null,"Rating must be <= 100");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter rating for skill ");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET Skill = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Rating must be <=100"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
    
}//GEN-LAST:event_editSkiilActionPerformed

private void editBallPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBallPosActionPerformed
  JOptionPane.showMessageDialog(null,"Rating must be <= 100");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter rating for BallPossession ");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET BallPossession = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Rating must be <=100"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
}//GEN-LAST:event_editBallPosActionPerformed

private void editDefenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDefenceActionPerformed
    JOptionPane.showMessageDialog(null,"Rating must be <= 100");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter rating for defence");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET Defence = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Rating must be <=100"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
}//GEN-LAST:event_editDefenceActionPerformed

private void editAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAttackActionPerformed
   JOptionPane.showMessageDialog(null,"Rating must be <= 100");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter rating for Attacking");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET Attacking = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Rating must be <=100"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
}//GEN-LAST:event_editAttackActionPerformed

private void editPassingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPassingActionPerformed
    JOptionPane.showMessageDialog(null,"Rating must be <= 100");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter rating for passing");
             try
             {
              mySoccer.updateTbl("UPDATE AttributeTable SET Passing = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
  
              JOptionPane.showMessageDialog(null,"Information updated!!!Rating must be <=100"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
}//GEN-LAST:event_editPassingActionPerformed

private void editTeam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeam3ActionPerformed
  JOptionPane.showMessageDialog(null,"The Format for team name is Team Name(Grade no.(division)");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new Team Name");
             try
             {
              mySoccer.updateTbl("UPDATE RecordTable SET TeamName = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!The Format for team name is Team Name(Grade no.(division"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
      
}//GEN-LAST:event_editTeam3ActionPerformed

private void editRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRecActionPerformed
     JOptionPane.showMessageDialog(null,"The Format for Record Number is rec000");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new record No");
             try
             {
              mySoccer.updateTbl("UPDATE RecordTable SET RecordNo = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!!Format for recordNo is rec000"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
  
}//GEN-LAST:event_editRecActionPerformed

private void editGoalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGoalsActionPerformed
    JOptionPane.showMessageDialog(null,"Goals Scored must be <=200");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new amount of goals scored");
             try
             {
              mySoccer.updateTbl("UPDATE RecordTable SET GoalsScored = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!! Must be <=200"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
  
}//GEN-LAST:event_editGoalsActionPerformed

private void editCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCleanActionPerformed
    JOptionPane.showMessageDialog(null,"No team can have more than 10 clean sheets");
        String updateTeam = JOptionPane.showInputDialog("Enter the team name you want to update");
        String newInfo = JOptionPane.showInputDialog("Enter new amount of cleansheets");
             try
             {
              mySoccer.updateTbl("UPDATE RecordTable SET CleanSheets = '"+newInfo+"' WHERE TeamName = '"+updateTeam+"'");
       
              JOptionPane.showMessageDialog(null,"Information updated!!!"); 
             }
             catch(Exception e)
             {
   
          JOptionPane.showMessageDialog(null,"There has been an error \nwhile entering data!!! Make sure no. entered is <=10"); 
          System.out.println(e.getMessage());
                System.out.println(e.getMessage());
             }
  
}//GEN-LAST:event_editCleanActionPerformed

private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_printActionPerformed

private void WinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WinnerActionPerformed
   String bestTeam ="";
         int highPoints = 0;
         int c  =0;
                   
        try
     {
       
       ResultSet rs = mySoccer.queryTbl("SELECT * FROM LeagueTable;");
       while (rs.next())
        {
         String teamName = rs.getString("TeamName");  
         int points = rs.getInt("Points");
         if (points > highPoints)
         {
             highPoints = points;
             bestTeam = teamName;
             
         }
        
        c++;
        }
         rs.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
         JOptionPane.showMessageDialog(null,"Best team: "+bestTeam+" Points: "+highPoints);
}//GEN-LAST:event_WinnerActionPerformed

private void averagePointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averagePointsActionPerformed
   double avg=0;
        
        try
     {
       
       ResultSet rs = mySoccer.queryTbl("SELECT AVG([Points])AS[Average] FROM LeagueTable;");
       while (rs.next())
        {
         avg = rs.getDouble("Average");
        
        
        }
         rs.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
          JOptionPane.showMessageDialog(null,"The average points is "+avg); 
    
}//GEN-LAST:event_averagePointsActionPerformed

private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
   this.dispose();
   new SearchFrame().setVisible(true);
}//GEN-LAST:event_searchActionPerformed

private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
 double tot=0;
        
        try
     {
       
       ResultSet rs = mySoccer.queryTbl("SELECT SUM([GoalsScored])AS[Total] FROM RecordTable;");
       while (rs.next())
        {
         tot = rs.getDouble("Total");
        
        
        }
         rs.close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
          JOptionPane.showMessageDialog(null,"The total points is "+tot); 
}//GEN-LAST:event_totalActionPerformed
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem AverageGoals;
    private javax.swing.JMenuItem Clear;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem License;
    private javax.swing.JMenuItem ViewAll;
    private javax.swing.JMenuItem ViewSort;
    private javax.swing.JMenuItem Winner;
    private javax.swing.JMenuItem averagePoints;
    private javax.swing.JMenu calculations;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem editAtt;
    private javax.swing.JMenuItem editAttack;
    private javax.swing.JMenuItem editBallPos;
    private javax.swing.JMenuItem editClean;
    private javax.swing.JMenuItem editDefence;
    private javax.swing.JMenuItem editDrawn;
    private javax.swing.JMenuItem editGoals;
    private javax.swing.JMenuItem editLost;
    private javax.swing.JMenuItem editPassing;
    private javax.swing.JMenuItem editPoints;
    private javax.swing.JMenuItem editRec;
    private javax.swing.JMenuItem editSkiil;
    private javax.swing.JMenuItem editSpeed;
    private javax.swing.JMenuItem editTeam2;
    private javax.swing.JMenuItem editTeam3;
    private javax.swing.JMenuItem editWon;
    private javax.swing.JMenuItem editplayed;
    private javax.swing.JMenuItem editteam;
    private javax.swing.JButton exit;
    private javax.swing.JMenuItem exit1;
    private javax.swing.JMenuItem exit2;
    private javax.swing.JButton firstRecord;
    private javax.swing.JButton information;
    private javax.swing.JMenuItem insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton lastRecord;
    private javax.swing.JButton nextRecord;
    private javax.swing.JButton previousRecord;
    private javax.swing.JMenu print;
    private javax.swing.JMenuItem search;
    private javax.swing.JMenuItem total;
    private javax.swing.JMenu update;
    private javax.swing.JMenuItem userGuide;
    // End of variables declaration//GEN-END:variables
    
}
