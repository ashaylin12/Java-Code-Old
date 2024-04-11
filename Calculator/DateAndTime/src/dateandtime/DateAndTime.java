/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

JOptionPane.showMessageDialog(null, "Current Date  :  "  + date);       // TODO code application logic here
 
    
    }
}
