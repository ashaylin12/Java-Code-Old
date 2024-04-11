/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringminipulation;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author exam
 */
public class StringMinipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name;
        String surname;
        int UserNum;


        Scanner kb = new Scanner(System.in);

        System.out.println("What is your Name ? ");
        name = kb.next();

        System.out.println("What is your Surname ? ");
        surname = kb.next();

        String str;
        int int1;
        char name1stchar = name.charAt(0);

        String User1 = surname.substring(0, 3);


        UserNum = (int) (Math.random() * 100 + 100);
        System.out.println("" + name1stchar + User1 + "" + UserNum);


    }

    public static boolean ValidateUsername(String name) {

        String username = JOptionPane.showInputDialog(null, "What is your username?");

        int numuser = username.charAt(0);
        int numuser1 = username.charAt(6);
        char test = username.charAt(0); 


        if (numuser > 7 && numuser == 0) {
            boolean Valid = false;
        }



        if (numuser1 < 100 && numuser1 > 200) {
            boolean Valid = false;

        }
        
        


        return true;


    }
}
