   import java.io.*;
   import java.util.Scanner;

    public class TestPlaneSpares
   {
      
       public static void main(String args[]) 
      {
         
         
         Scanner inKb = new Scanner(System.in);
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
            ch = inKb.next().toUpperCase().charAt(0);
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