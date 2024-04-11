package marks;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class Marks {

    double total, average, highest;
    int count = 0;
    double[] inputArray;
    double add= 0;
    public void input() {
       
        inputArray = new double[10];

        do {

            inputArray[count] = Double.parseDouble(JOptionPane.showInputDialog("What is the your mark?"));
            add= add+ inputArray[count];
            count++;
        } 
        
        
        
        
        while (count != 10); {

            JOptionPane.showMessageDialog(null, "The addition of the numbers is " + (add) );

        }

    }

    
    
    public double CalcAvg() {

        double avg;
        avg = (add/ 10);

        return (avg);

    }

    
    
    
    public static void main(String[] args) {
        Marks abc = new Marks();
        abc.input();
        JOptionPane.showMessageDialog(null, "The Average is " + abc.CalcAvg() + "%");



    }
}
