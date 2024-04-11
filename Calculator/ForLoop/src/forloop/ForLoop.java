/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int loopVal ;
        int end_val = 200 ;
                
         for (loopVal = 50; loopVal < end_val; loopVal++) {
            
            System.out.print("\rLoopVal = " + loopVal);
        }       
        
    }
}
