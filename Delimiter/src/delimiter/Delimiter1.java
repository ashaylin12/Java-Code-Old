/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package delimiter;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author prvt
 * 
 * 
 * 
 */


public class Delimiter1 {

  String in = "";
    String display = "";

    public void main1() {

        in = JOptionPane.showInputDialog("Input Sentence");
        String sent = in;
        int count = 0;

        Scanner sc = new Scanner(sent).useDelimiter(" ");
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() == 3) {
                count++;
            }
        }
        
        String temp1  = String.format("%30s","Sentence");
         display =  temp1 + "\n" + in +"\n Word Count :"+count;
         JOptionPane.showMessageDialog(null,display);
        
        


    }
}