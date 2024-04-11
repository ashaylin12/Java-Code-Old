/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatments;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class IFStatments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String user ;      
              
       
        user = JOptionPane.showInputDialog("What is your age?");
        
        int foo = Integer.parseInt( user );
        
        System.out.print("" + foo);
        
        if (foo != 18){
        
        JOptionPane.showMessageDialog(null, "System Error 404 - Run Program Again and Enter Correct value");
        
        System.exit(0);
        }    
        
        if (foo >= 18){
            
        JOptionPane.showMessageDialog(null, "You are above the age limit");
            
        }
        
        if (foo < 17){
        
        JOptionPane.showMessageDialog(null, "You are below the age limit");
        }
              
        System.exit(0);
                
        // TODO code application logic here
    }
}
