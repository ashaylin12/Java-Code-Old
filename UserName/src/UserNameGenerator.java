 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naimik14
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UserNameGenerator {

    public static void main(String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = kb.next();
        System.out.println("Please enter your surname: ");
        String surname = kb.next();

        char firstLetter = firstName.charAt(0);
        surname = surname.substring(0, 3);

        int randomNums = (int)(Math.random()* 900) + 100;

        System.out.println("Your username should be : " + firstLetter + surname + randomNums);


    }
    
    public static boolean validateUsername (String name) {
        
        
        String username = JOptionPane.showInputDialog(null,"What is your username");
        
        int numuser = username.charAt(0);
        int numuser1 = username.charAt(6);
        char test = username.charAt(0);
        
        if (numuser > 7 && numuser != 0)
        {
            boolean Valid = false;
        }    
            
        
        
        if (numuser1 < 100 && numuser1 <= 200) {
        boolean Valid = false; 
        
        
        
                
             
        }
             
        if ()
        
            return true;
            
            
        }
       
        
        
        
        
        
        
    }
    

