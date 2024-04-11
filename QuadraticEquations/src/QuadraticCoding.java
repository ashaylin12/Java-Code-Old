import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh
 */
public class QuadraticCoding {
 public static void main(String []argd){
        
 Scanner kb = new Scanner(System.in);

 double zz12 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your second mark"));
 
System.out.println("Quadratic Equation Solution\nExample: ax²+bx+c\nPlease enter your the value for the variable 'a' : "); 

        double a1 = kb.nextDouble() ;
        System.out.println("Now enter the 'b' Value");
        double b1 = kb.nextDouble();
        System.out.println("Now enter the 'c' Value");
        double c1 = kb.nextDouble();
                System.out.println("Test : " + (a1 + c1 + zz12));  
       
               
         
    }

}   
