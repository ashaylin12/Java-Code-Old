/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string_convert_int;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class String_convert_Int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String user  ;
                  
        user = JOptionPane.showInputDialog("Insert your age");
              
        int foo = Integer.parseInt(user);
              
        System.out.println("You are " + foo + " years old");
        
        System.exit(0);   // TODO code application logic here
    }
}
