/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loopnumuntilenter.pkg999;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class LoopNumUntilEnter999 {

  
       public static void main(String[] args) {



        boolean stopper = false;
        int stop = 0;
        int adder = 0;
        int count = 0;
        int avg = 0;
                
        

        do {

            stop = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            adder = stop + adder;
            count ++ ;
       
        }
        
        while (stop != -999);{
        
        adder = adder + 999 ;
        count -- ;
        avg = (adder / count) ;
    
    
    }
        
     System.out.println("Total = " + adder);  
     System.out.println("Average = " + count);

    }
       
}

       
    

