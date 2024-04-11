/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author prvt
 */
public class Delimiter {

    String in = "";

    public void main() {

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


    }
}
