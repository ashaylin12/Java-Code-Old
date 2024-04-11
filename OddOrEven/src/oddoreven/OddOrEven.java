/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class OddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String input ;
              
        
        input = JOptionPane.showInputDialog("What is the number?");
        
        int number = Integer.parseInt(input);
        
        if (number % 2 == 0)
{
  
   JOptionPane.showMessageDialog(null, "The Number " + number + " Is an Even Number");
    
    
}
else
{
      
   JOptionPane.showMessageDialog(null, "The Number " + number + " Is an Odd Number");
}
        System.exit(0);
        // TODO code application logic here
    }
}
