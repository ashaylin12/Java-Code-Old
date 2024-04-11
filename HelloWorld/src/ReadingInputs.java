
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SEWASH14
 */
public class ReadingInputs {

    public static void main(String[] argd) {
  
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your mark: ");
        int mark = kb.nextInt() ;
        double avg = kb.nextDouble();
        //double avg 
        
        int mark2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your second mark"));
                  
        System.out.println("The mark input was : " + mark);           
                
                    
                                
                
    }

}   
