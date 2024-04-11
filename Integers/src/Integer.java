/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhiravRana
 */
import java.util.Scanner;
public class Integer {

    public static void main(String [] args){

    Scanner kb = new Scanner(System.in);
    int num1 = 0;
    int sum = 0;
    System.out.println("Enter a number: ");
    num1 = kb.nextInt();
    double ave = 0;
    int cnt = 0;
    
    

    while (num1!=-999)
    {
        cnt++;
        sum = sum + num1;
        System.out.println("Enter another number: ");
        num = kb.nextInt();
    }
    System.out.println("Sum: " + sum);
    ave = sum / cnt;
    System.out.println("Average: " + ave);

    }


}
