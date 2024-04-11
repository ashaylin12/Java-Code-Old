/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rana
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh
 */
public class testClients {

    public static void main(String[] args) throws IOException {

        ClientsInfoRDhirav[] arrClients = new ClientsInfoRDhirav[200];
        int counter = 0;

        try {

            Scanner sc = new Scanner(new FileReader("Clients.txt"));


 

            while (sc.hasNext()) {

                String line = sc.nextLine();
                String[] piece = line.split("#");

                int id = Integer.parseInt(piece[0]);
                String cname = piece[1];
                double hours = Double.parseDouble(piece[2]);




                arrClients[counter] = new ClientsInfoRDhirav(id, cname, hours);



                counter++;
            }
            sc.close();




        } catch (FileNotFoundException e) {

            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
            System.exit(0);

        }





        BufferedReader inKb = new BufferedReader(new InputStreamReader(System.in));
        char ch = ' ';

        while (ch != 'Q') {
            System.out.println("\n\n");
            System.out.println("    Menu");
            System.out.println("");
            System.out.println("A - Display Client Infomation");
            System.out.println("B - Summarised Total Income");
            System.out.println("C - Look up a client");
            System.out.println("Q - QUIT");
            System.out.println("");
            System.out.print("Your Choice? :");
            ch = inKb.readLine().toUpperCase().charAt(0);




            switch (ch) {

                case 'A': {

                    for (int i = 0; i < counter; i++) {
                        System.out.println(arrClients[i].toString());
                    }
                    break;
                }
                case 'B': {
                    
                    int Rcount = 0;
                    int NRcount = 0;
                    double Rcost = 0;
                    double NRcost = 0;

                    for (int i = 0; i < counter; i++) {

                        if (arrClients[i].getClientName().equalsIgnoreCase("Sundry")) {

                            NRcount++;
                            NRcost = NRcost + arrClients[i].CalculateCost();


                        } else {


                            Rcount++;
                            Rcost = Rcost + arrClients[i].CalculateCost()-arrClients[i].Discount();
                        }
                    }

                    System.out.println("Number of Registed Client : " + Rcount + ("\t") + ("Total Income : ") + (Rcost));
                    System.out.println("Number of Non Registed Client : " + NRcount + ("\t") + ("Total Income : ") + (NRcost));


                    break;
                }

                case 'C': {
                    boolean found = false;
                    Scanner kb = new Scanner(System.in);
                    System.out.println("ID:");
                    int searchID = kb.nextInt();
                    for (int i = 0; i < counter; i++) {

                        if (searchID == arrClients[i].getClientID()) {
                            found = true;
                            System.out.println(arrClients[i].toString());

                        }
                    }
                    if (found == false) {
                        System.out.println("ID " + searchID + " was not found. ");
                    }


                    break;
                }

                case 'Q': {
                    System.exit(0);
                }

            }//switch
        }//while


    }//main
}//testClients
