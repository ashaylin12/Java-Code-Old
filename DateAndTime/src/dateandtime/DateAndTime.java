/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class DateAndTime {

 
     
    public static void main(String[] args) {
     
     
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();
System.out.println(dateFormat.format(date));

JOptionPane.showMessageDialog(null, "Current Date  :  "  + date);    

char as = '2';
int asdf = Character.getNumericValue(as); 
JOptionPane.showMessageDialog(null, asdf);
 
    
    }
}
