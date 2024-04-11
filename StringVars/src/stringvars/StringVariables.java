/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringvars;

import java.util.Scanner;

/**
 *
 * @author Rajesh
 */
public class StringVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner keyboard = new Scanner(System.in) ;  
        
      
        System.out.println("Please insert your first name");    
        String first_name = first_name = keyboard.next(); 
       
        System.out.println("\rPlease insert your last name"); 
        String family_name = family_name = keyboard.next();  
                
        System.out.println(" \rYour name is " + (first_name + " " + family_name)); 
       
        System.out.println("");
        System.out.println("");
        
        
        
        // TODO code application logic here
    }
    
    
}
