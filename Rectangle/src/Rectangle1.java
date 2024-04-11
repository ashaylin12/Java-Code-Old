/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhiravRana
 */
import java.util.*;
import javax.swing.*;

public class Rectangle1 { 
double len,bre;

Scanner kb = new Scanner(System.in);
public void input (){
    
System.out.println("Enter the length");
len = kb.nextDouble();
System.out.println("Enter the Breadth");
bre = kb.nextDouble();

}//input

public void output(){
    
System.out.println("The length is:" + len);    
System.out.println("The Breadth is:" + bre);

}//output

public double calcArea(){

double area = len * bre;    
return area;

}//area

public double calcPerimetre(){
    
double perimetre = 2*(len+bre);
return perimetre;

}//perimetre

public static void main(String[] args){

Rectangle1 obj = new Rectangle1();    
    
obj.input();
obj.output();
System.out.println("The area is:" + obj.calcArea());
System.out.println("The perimetre is:" + obj.calcPerimetre());
    
}//main
    
}