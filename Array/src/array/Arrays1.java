/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import javax.swing.*;

public class Arrays1 {

    int[] numArr = new int[5];

    public void Input() {

        for (int i = 0; i < 5; i++) {
            numArr[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1)));
        }
    }

    public void Output() {

        String Output1 = "";
        for (int i = 0; i < 5; i++) {

            Output1 = Output1 + numArr[i] + " ";
            
        }
       
        int a = numArr.length;

        JOptionPane.showMessageDialog(null, Output1);
        JOptionPane.showMessageDialog(null, "The length of the array is : " + a );

    }

    public double CalcAvgerage() {

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            sum = sum + numArr[i];

        }

        int avg = sum / 5;


        return avg;

    }

    public int CountEvenNumbers() {

        int count = 0;

        for (int i = 0; i < 5; i++) {

            if (numArr[i] % 2 == 0) {

                count++;
            }

        }

        return count;
    }

    public String Reverse() {

        String revanswer = "";

        for (int i = 4; i >= 0; i--) {

            revanswer = revanswer + numArr[i] + "";

        }

        return revanswer;

    }

    public static void main(String[] args) {

        Arrays1 obj = new Arrays1();
        obj.Input();
        obj.Output();
        JOptionPane.showMessageDialog(null, "The average is " + obj.CalcAvgerage());
        JOptionPane.showMessageDialog(null, "The number of even number is : " + obj.CountEvenNumbers());
        JOptionPane.showMessageDialog(null, "The numbers in reverse order  is : " + obj.Reverse());
        
        

    }
}
