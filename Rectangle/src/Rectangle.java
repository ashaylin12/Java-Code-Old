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
public class Rectangle {
static double len,bre;
static Scanner kb = new Scanner(System.in);
public static void input (){
    
System.out.println("Enter the length");
len = kb.nextDouble();
System.out.println("Enter the Breadth");
bre = kb.nextDouble();

}//input

public static void output(){
    
System.out.println("The length is:" + len);    
System.out.println("The Breadth is:" + bre);

}//output

public static double calcArea(){

double area = len * bre;    
return area;

}//area

public static double calcPerimetre(){
    
double perimetre = 2*(len+bre);
return perimetre;

}//perimetre

public static void main(String[] args){

input();
output();
System.out.println("The area is:" + calcArea());
System.out.println("The perimetre is:" + calcPerimetre());
    
}//main
    
}//class
