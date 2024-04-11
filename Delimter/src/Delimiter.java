
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
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
            }//if
        }//while
String temp1 = "Sentence";
String temp2 = String.format("% 30s", sent);
String dsiplay = temp1 + temp2;        
    }//main
}
