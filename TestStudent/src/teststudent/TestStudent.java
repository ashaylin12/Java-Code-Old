/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  Student NewName = new Student(); 
  NewName.setValues();
  JOptionPane.showMessageDialog(null, "Your Average is " + NewName.GetAvg() + "%" );
  NewName.Achieve();
  JOptionPane.showMessageDialog(null, "Your Highest Percentage is " + NewName.HighMark() + "%" + " and was achieved in  " + NewName.HighSubject()  );
 
  
        
        
              

    }
}
