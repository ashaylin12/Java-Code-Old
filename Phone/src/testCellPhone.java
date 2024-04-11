
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhiravRana
 */
public class testCellPhone {

    public static void main (String [] args)
    {
       CellPhone myphone = new CellPhone();
       
       CellPhone yourphone = new CellPhone("Blackberry", "9900", "White", 5500.55, 0);
       
       myphone.displayInfo();
       myphone.recieveSMS();

       String nColor =  JOptionPane.showInputDialog("Please input your new color of your cellphone");
       yourphone.setColor (nColor);
       
       yourphone.displayInfo();
       yourphone.recieveSMS();

       



    }

}
