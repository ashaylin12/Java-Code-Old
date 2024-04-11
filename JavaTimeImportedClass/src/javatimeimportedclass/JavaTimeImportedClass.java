/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatimeimportedclass;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class JavaTimeImportedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        try {
            String myTime = JOptionPane.showInputDialog("What is the time?") ;
            SimpleDateFormat df = new SimpleDateFormat("HH.mm");
            Date d = df.parse(myTime); 
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            cal.add(Calendar.MINUTE, 10);
            String newTime = df.format(cal.getTime());
            System.out.println(newTime);
        } catch (ParseException e) {
           JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
 
    }
}
