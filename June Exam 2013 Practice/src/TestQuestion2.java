//Type your examination number in ...
   import java.io.*;
   import java.util.Scanner;
import javax.swing.JOptionPane;


    public class TestQuestion2 {
    
   
       public static void main(String[] args) throws Exception 
      {
         BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
                
         char choice = ' ';
         do {
            System.out.println("    MENU");
            System.out.println();
            System.out.println("  Option A");
            System.out.println("  Option B");
               System.out.println("  Option C");
            System.out.println();
            System.out.println("  Q - QUIT");
            System.out.println("\n  Your choice?  ");
            choice =kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
               case 'A': 
                 
              double total = 0.0;
             int counter = 0;
                 try{
                    Scanner sc = new Scanner (new FileReader("DataQ2.txt"));
                      
                     System.out.printf("%-25s%-15s%-10s%-10s\n","name","num","size","cat");
                    while(sc.hasNext()){
                        
                        String line = sc.nextLine();
                        line = line.replaceAll(";","#");
                        Scanner d1 = new Scanner(line).useDelimiter("#");
                        String [] parts = line.split("#");

                        String name = parts[0];
                        int num = Integer.parseInt(parts[1]);
                        double size = Double.parseDouble(parts[2]);
                        char cat = parts[3].charAt(0);
                        System.out.printf("%-25s%-15s%-10.2f%-10s\n",name,num,size,cat);
                        
                        counter ++;
                        total = total + size;
                        
                    }
                     
                     total = total/counter;
                     //System.out.printf("%10s%15.2f\n","Average : ",total);
                     //total =  Math.round(total);
                     System.out.printf("Average is : %-6.2f" ,total);
                     
                    
                   
                 }
                 catch(FileNotFoundException e){
                     
                 JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
                 
                 }
                  break;
               case 'B':
                   
                   try{
                       
                       PrintWriter out = new PrintWriter(new FileWriter ("Months.txt"));
                      
                       
                       for(int i = 0; i<3;i++){
                       String month = JOptionPane.showInputDialog("Input Month : ");
                       out.println(month);
                       }
                       
                       out.close();
                   
                   }catch(IOException e){
                   
                   JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
                   }
                  break;
               case 'Q':
                  System.out.println("Quit");
                   break;
                   
                   case 'C':
                   
                   try{
                       
                       PrintWriter k = new PrintWriter(new FileWriter ("Months.txt",true));
                     
                      String a = JOptionPane.showInputDialog("Input a month to add");
                      k.println(a);
                       k.close();
                      
                   
                   }catch(IOException e){
                   
                   JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
                   }
                  
            }
            
         } while (choice != 'Q');
      }
   
   }       
