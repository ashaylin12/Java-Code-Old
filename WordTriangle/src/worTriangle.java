/* 
Dhirav Rana
*/
   import javax.swing.*;

   public class worTriangle
   {
      public static String input = "";
      public static void main(String [] args)
      {
      
         input = JOptionPane.showInputDialog(null, "Please input the word u want made into a word traingle");
         input = input.toUpperCase();
         
         if(input.charAt(0) != input.charAt(input.length()-1))
         {
            JOptionPane.showMessageDialog(null, "The word you have input is not suitable for the program");
         }
         else
         {
         	
            char [] inputArr = new char [(input.length())];
            int p = 0;
            int i = 0;
            int temp1 = input.length();
            int temp2 = input.length();
         
            for(int g=0;g<(input.length());g++)
            {
               inputArr [g] = input.charAt(g);
            }
            int j = 0;
            for(int h=0;h<(input.length()-1);h++)
            {
               System.out.println();
               for(j=0;j<(temp1);j++)
               {
                  System.out.print(" ");
               }
               temp1--;
               if(h==(input.length())-1)
               {
               	
               }
               else
               {
                  System.out.print(inputArr[h]);
               }
               for(p=0;p<((h*2)-1);p++)
               {
                  System.out.print(" ");
               }
               if(temp1==0)
               {
               	
               }
               else if(temp1==input.length()-1)
               {
               	
               }
               else
               {
                  System.out.print(inputArr[temp1]);
               }
            }
            System.out.println();
            for(i=0;i<(input.length());i++)
            {
               System.out.print(" "+inputArr[i]);
            }
         }
      }   
   }
