   import java.io.*;
   import java.sql.*;
   import java.util.Scanner;

    public class TestSuperMkt
   {
       public static void main (String[] args) throws SQLException,IOException
      {
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
         SuperMkt DB = new SuperMkt();
         System.out.println();
      
         char choice = ' '; 
         do
         {         
            System.out.println("       MENU");
            System.out.println();
            System.out.println();
            System.out.println("    A - All Products");
            System.out.println("    B - Stock Qty");
            System.out.println("    C - Re-Order List");
            System.out.println("    D - Department Query");
            System.out.println("    E - Adjust Price");
            System.out.println("    F - Past 5 Months Order");
            System.out.println("    G - Supplier Detail");
            System.out.println("    Q - QUIT");
            System.out.println(" ");
            System.out.print("    Your Choice? ");
            choice = inKb.readLine().toUpperCase().charAt(0);
            System.out.println(" ");
            String sql = "";
            switch(choice)
            {
               case 'A':
                  {
                     sql = ""; // <--- SQL Code for Option A goes here 
                  					
                     DB.all(sql);// This statement passes SQL as parameter
                     break;
                  }
               case 'B':
                  {
                     sql = "";// <--- SQL Code for Option B goes here 
                  					 
                     DB.stockQty(sql);// This statement passes SQL as parameter
                     break;
                  }
               case 'C':
                  {
                     sql = ""; // <--- SQL Code for Option C goes here 
                  					
                     DB.reOrder(sql);// This statement passes SQL as parameter
                     break;
                  }  
               
               case 'D':
                  {
                     sql = ""; // <--- SQL Code for Option D goes here 
                  					
                     DB.deptQry(sql);// This statement passes SQL as parameter
                     break;
                  }  
               case 'E':
                  {	
                     sql = ""; // <--- SQL Code for Option E goes here 
                  					
                     DB.adjustPrice(sql);// This statement passes SQL as parameter
                     break;  
                  }
               case 'F':
                  {
                     sql = ""; // <--- SQL Code for Option F goes here 
                  					
                     DB.past5Qry(sql);// This statement passes SQL as parameter
                     break;
                  }   
               case 'G':
                  {
                     sql = ""; // <--- SQL Code for Option F goes here 
                  					
                     DB.supplierDetail(sql);// This statement passes SQL as parameter
                     break;
                  }  
            }        
         }while (choice != 'Q');  
      
         DB.disconnect();
         System.out.println("Done");  
      }
   }