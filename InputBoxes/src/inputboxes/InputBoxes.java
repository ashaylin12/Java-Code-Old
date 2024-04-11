/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inputboxes;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class InputBoxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String first_name;
        first_name = JOptionPane.showInputDialog("Your First Name is :");
       
        String family_name;
        family_name = JOptionPane.showInputDialog("Your Last Name is :");     
        
        String full_name;
        full_name = "You are " + family_name + " " + first_name;
        String sewnath;
        
       JOptionPane.showMessageDialog(null, full_name);
       
     
        System.exit(0);
    }
           
   
}
