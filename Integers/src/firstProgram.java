/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhiravRana
 */
import java.util.Scanner;
public class firstProgram {

    public static void main(String [] args){

        Scanner kb = new Scanner(System.in);

        
        int count = 0;
        double ave = 0;
        int num1 = 0;
        int sum = 0;
        for(int i = 0; i<=10; i++)
        {
            System.out.println("Please enter a number: ");
            num = kb.nextInt();
            sum = num1 + sum;
            count++;
        }
            System.out.println("Sum : "  + sum);
            average = sum / count;
            System.out.println("Average: " + ave);
    }
}
