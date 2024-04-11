/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringman;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author exam
 */
public class StringMan {
    
    String word;
    int i ;
    
    
    
    public static void main(String[] args) {
     
        StringMan obj = new StringMan();
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter any word you would like to reverse.");
        String input = kb.nextLine();
        System.out.println(obj.printRev(input));
        
    }
    
    public String printRev (String word) {
        
        String rev = "";
        for(int i = word.length()-1; i>=0 ; i--)
        {
        
        rev = rev + word.charAt(i);
        
        }
        
        return rev;
 
   
    }
    
  public int countNum(String word){
     int a ;
      
      a = word.length();
      
        return a;
  
  }
    
}

   

