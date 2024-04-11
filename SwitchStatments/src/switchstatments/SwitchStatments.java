/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatments;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class SwitchStatments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int user = 18  ;
                     
        switch ( user ) {
        
            case 18:
                System.out.println("You are 18");
                break;
            case 19:
                System.out.println("You are 19");
                break;    
            case 20:
                System.out.println("You are 20");
                break; 
            default:
                System.out.println("You are not 18, 19, or 20");
                break;     
                
                              
         
        }  
        System.exit(0);     
    }
}
    
