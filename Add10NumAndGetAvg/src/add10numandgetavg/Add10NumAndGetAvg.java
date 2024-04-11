/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package add10numandgetavg;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class Add10NumAndGetAvg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int add = 0;
        int count = 0;
        int avg = 0;
        int insert = 0;


        do {
            insert = Integer.parseInt(JOptionPane.showInputDialog("Insert a number"));
            add = add + insert;
            count ++ ;


        } while (count != 10);
        {
            
            count -- ;
            add = add -insert ;
            avg = add /count ;
           
            
        }
        
        System.out.println ("The Total is = " + avg);
        System.out.println ("The Average is = " + add);
    }
}
