/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellohouse;

import java.util.Scanner;

/**
 *
 * @author SEWASH14
 */
public class Quadratics {
public static void main (String [] args) {

Scanner kb = new Scanner (System.in);

    int a, b, c;
        
        System.out.println("Quadratic equations are written in the form of ax^2 + bx + c ");
        
        System.out.print ("Enter the value of a:");
        a = kb.nextInt();
       
        System.out.print ("Enter the value of b:");
        b = kb.nextInt();
       
        System.out.print ("Enter the value of c:");
        c = kb.nextInt();

        double  x1;
        double  x2;
        
        x1 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        x2 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        System.out.println("The answer is" + Math.round(x2*100)/100.0);
        System.out.println("The answer is" + Math.round(x1*100)/100.0);
        

    }

}

