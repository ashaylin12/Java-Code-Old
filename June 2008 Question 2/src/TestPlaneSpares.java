   import java.io.*;
   import java.util.Scanner;
import javax.swing.JOptionPane;
 

    public class TestPlaneSpares
   {
        
         PlaneSpares []  arrSpares = new PlaneSpares[100];
         int c = 0;
         
         public void readFromFile(){
             
         try{
             
             Scanner sc = new Scanner (new FileReader ("Spares.txt"));
             
             while(sc.hasNext()){
             
             String line = sc.nextLine();
             
             Scanner scLine = new Scanner (line).useDelimiter(";");
             
             String code1 = scLine.next();
             String description1 = scLine.next();
             double costPrice1 = scLine.nextDouble();
             int noInStock = scLine.nextInt();
             
             arrSpares[c] = new PlaneSpares (code1,description1,costPrice1,noInStock);
             c++;
             
             }//while
             
             sc.close();
                    
         }//try
         
         
         catch(FileNotFoundException e)
         {
             
             JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
         
         }//catch
         
         
                 
         }
         
         public void display(){
         
         System.out.println("List of all Stock Items");
         System.out.println("=======================");
         System.out.printf("%-10s%-30s%-14s%-10s","Item Code","Item Descriotion","Cost Price","Quantity");
         System.out.println();
         
         for(int i = 0; i < c; i++){
         
         System.out.println(arrSpares[i].toString());
         
         
         
         }
       
         
         
         }
         
         public void Sort(){
         
             
             for(int i=0; i<c-1; i++){
             
               for(int j=i+1; j<c-1; j++){
               
                   if(arrSpares[i].calcSellingPrice() > arrSpares[j].calcSellingPrice()){
                   
                   
                   
                PlaneSpares temp = arrSpares[i];
                arrSpares[i] = arrSpares[j];
                arrSpares[j] = temp;
                
                  
                   
                   }//if
               
               }//forb
             
             
             }//fora
             
             display();
         
         }//sort
      
       public static void main(String args[]) 
      {
         
          TestPlaneSpares obj = new TestPlaneSpares();
          obj.readFromFile();
          obj.display();
         
         Scanner inKb = new Scanner(System.in);
         char ch = ' ';
         
         while (ch != 'Q')
         {
            System.out.println("\n\n");
            System.out.println("    Menu");
            System.out.println("");
            System.out.println("A - Basic Display ");
            System.out.println("B - Sort by Price ");
            System.out.println("C - ");
            System.out.println("Q - QUIT");
            System.out.println("");
            System.out.print("Your Choice? :");
            ch = inKb.next().toUpperCase().charAt(0);
            switch (ch)
            {
               case 'A':
                  {
                   
                      obj.display();
                     break;
                  }
               case 'B':
                  {
                     obj.Sort();
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

   