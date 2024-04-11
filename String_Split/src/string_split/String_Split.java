/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string_split;

/**
 *
 * @author Rajesh
 */
public class String_Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String names = "Jack;John;Michael;Mark;Matthew;Sean;Luke";

String[] listOfNames = names.split (";");
// split up the list of names using the semicolon

for (int i = 0 ; i < listOfNames.length ; i++)
{
     System.out.println (listOfNames [i]);
     
} 
        
        
    }
}
