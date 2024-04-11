
 /* ##   ##        HH      HH      LL          IIIIIIIIIIIIII   NNN         NN
    ##   ##        HH      HH      LL                III        NN  NN      NN  
 ##############    HHHHHHHHHH      LL                III        NN    NN    NN
    ##    ##       HHHHHHHHHH      LL                III        NN      NN  NN            
 ##############    HH      HH      LL                III        NN       NN NN
    ##    ##       HH      HH      LL                III        NN         NNN
    ##    ##       HH      HH      LLLLLLLLLLL  IIIIIIIIIIIIII  NN         NNN 
 
ASHAYLIN SEWNATH 11SA 
* */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class testClients {

 
    public static void main(String[] args) throws IOException {

          ClientInfoSewnathAS [] arrClients = new ClientInfoSewnathAS [200];
        int counter = 0;
          
         try { 

                       Scanner sc = new Scanner(new FileReader("Clients.txt"));

                       
                       while (sc.hasNext()) {                                                   

                            String line = sc.nextLine();
                            String [] piece = line.split("#");
                            
                             int id =  Integer.parseInt(piece [0]);//id
                            String cname =  piece [1];//name
                            double hours =  Double.parseDouble(piece [2]);//hours
                            
                          
                           
                            
                         
                     arrClients [counter] = new ClientInfoSewnathAS(id,cname,hours);
                                 
                       
                                                
                             counter++;
                        }//while
                        sc.close();
                     
                       


                    }//try
         
         catch (FileNotFoundException e) {

                        JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
                        System.exit(0);

                    }//catch

    
       
        

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
            ch =inKb.readLine().toUpperCase().charAt(0);
          

            

            switch (ch) {
                
                case 'A': {
                  
                       System.out.println();   
                       System.out.println(String.format("%-20s%-25s%-15s%-10s%-10s%10s%5s", "ClientID", "Client Name",  "Hours Used" , "Discount ","", "Cost ",""));
                       System.out.println("-------------------------------------------------------------------------------------------------");
                       
                    
                    for(int i = 0; i<counter; i++){
                System.out.println(arrClients[i].toString());
                    }// for
                    break;
                }//case A
                case 'B': {
                    
                    int countR = 0;
                    int countNR = 0;
                    double costR = 0;
                    double costNR = 0;
                    
                    for(int i = 0; i<counter; i++){
                    
                    if(arrClients[i].getClientName().equalsIgnoreCase("Sundry")){
                        
                        countNR ++;
                    costNR = costNR + arrClients[i].CalculateCost();
                          
                    
                    }//if
                    
                    else{
                    
                                   
                        countR ++;
                    costR = costR + arrClients[i].CalculateCost()-arrClients[i].CalculateDiscount ();
                    }//else
                    
                    
                    
                    
                    }//for
                    
                    System.out.println();
                    System.out.printf("%-30s%-10s%-5s%-10.2f","Number of Registed Client " , ":  "+countR, ("Total Income : R"), (costR) );
                    System.out.println();
                    System.out.printf("%-30s%-10s%-5s%-10.2f","Number of Non Registed Client " , ":  "+ countNR ,"Total Income : R", (costNR)) ;
                    System.out.println();

                    break;
                }//case B

                case 'C': {
                  
                    boolean found = false;
                    boolean showHead = false;
                    Scanner kb=new Scanner (System.in);
                   System.out.println("ID:");//Integer.parseInt(JOptionPane.showInputDialog("Input Client ID : "));
                   int searchID = kb.nextInt();
                   String heading = String.format("%-20s%-25s%-15s%-10s%-10s%10s%5s", "ClientID", "Client Name",  "Hours Used" , "Discount ","", "Cost ","");
                   String dash =("-------------------------------------------------------------------------------------------------");
                   
                   for(int i =0 ;i<counter; i++){
                   
                      if(searchID == arrClients[i].getClientID()){
                          
                          
                      found = true;
                    
                      
                   
                      
                      
                      System.out.println(arrClients[i].toString());
                      
                      }//if search id
                      
                   
                   }
                   
                   if(found == false){
                       System.out.println();
                   System.out.println("ID "+ searchID + " was not found. ");
                   }
                    

                    break;
                    
                    
                }//if found = false

                case 'Q': {
                    System.exit(0);
                }//case Q

            }//switch
        }//while switch


    }//main
    
}//class
    
   


    

