/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prvt
 */
import java.util.*;
import javax.swing.*;

public class Employee {

static String name;
static double hoursWorked;
static double ratePerHour;



public static void input (){
    
name = JOptionPane.showInputDialog("Input a name");

hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Input a hoursWorked"));
ratePerHour = Double.parseDouble(JOptionPane.showInputDialog("Input a ratePerHour"));

        
}//input

public static void output (){

JOptionPane.showMessageDialog(null, "The name is:" + name);    
JOptionPane.showMessageDialog(null, "The Hours Worked is:" + hoursWorked); 
JOptionPane.showMessageDialog(null, "The Rate Per Hour is:" + ratePerHour); 
    
}//output

public static double calcSalary(){

double salary = hoursWorked*ratePerHour;    

return salary;   
}//calcSalary

public static double calcBonus(){

double bonus = calcSalary()*10/100;
    
return bonus;

}//Bonus


public static void main(String []args){
    
input();
output();
JOptionPane.showMessageDialog(null, "The Salary is:" + calcSalary());
JOptionPane.showMessageDialog(null, "The Bonus is:" + calcBonus());
}


}//class
