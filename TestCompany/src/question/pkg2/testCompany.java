package question.pkg2;

import java.io.*;
import java.util.Scanner;
   import javax.swing.JOptionPane;
    
    public class testCompany 
    
    
   {
        
        
         public static void main(String args[]) throws Exception
      {
        
          testCompany [] arrcorp = new testCompany[100];
          int count = 0;
          String b = "";
          
          try{
              Scanner sc = new Scanner (new FileReader("C:/pollution.txt"));
              
              while(sc.hasNext()){                 
                  String line = sc.nextLine();
                  String [] piece = line.split("#"); //delimiter
                  String cname = piece[0];
                  int co2 = Integer.parseInt(piece[1]);
                  int pb = Integer.parseInt(piece[2]);
                  int hg = Integer.parseInt(piece[3]);
                  
                  
                  for(count = 0; count >100; count++){
                  
                  arrcorp [count] = new testCompany(cname ,co2 ,pb ,hg);
                  count++;
                                           
                  
              }
              
              
              }
              
          }
              
          
          
          
          catch(FileNotFoundException e){
          
          JOptionPane.showMessageDialog(null, "Error : " + e.getMessage() );
          
          }
          
         
          for (int i = 0 ; i < count ; i++  ){
              b = b + arrcorp[i] + "\n";
          
          
          }
          
          
	
      }

            
   
       public  void asdf() throws Exception
      {
         
         
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
         char ch = ' ';
         
         while (ch != 'Q')
         {
            System.out.println("\n\n");
            System.out.println("    Menu");
            System.out.println("");
            System.out.println("A - ");
            System.out.println("B - ");
            System.out.println("C - ");
            System.out.println("Q - QUIT");
            System.out.println("");
            System.out.print("Your Choice? :");
            ch = inKb.readLine().toUpperCase().charAt(0);
            switch (ch)
            {
               case 'A':
                  {
                     
                     break;
                  }
               case 'B':
                  {
                     
                     break;
                  } 
              
               case 'C':
                  {
                     
                    break;
                  }
               
               case 'Q':
                  {
                     System.exit(0);
                  }
            
            }
         }      

         
      }
   }