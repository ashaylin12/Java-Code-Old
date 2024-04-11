
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author exam
 */
public class Company {
    
    private String CompanyName;
    private int dioxide;
    private int lead;
    private int mercury;
    
    
    
    public Company(){
    
    CompanyName = null; // #hashlin
    dioxide = 0;
    lead = 0;
    mercury = 0;
    
    }
    
      public String toString() {

      String  Str = CompanyName + "#" + dioxide + "#" + lead + "#" + mercury;

        return Str;

    }
      
         public void PrintOut() { 

try{
    
        File fileOut = new File("C:/Info.txt");
        PrintWriter out = new PrintWriter(fileOut);
        out.println(toString());
        out.close();
        
}catch(Exception e) {
    
    System.out.println("Error");
    
}   
    }
         
         public void setDetails (){
      
             CompanyName = JOptionPane.showInputDialog("What is the Company name?");
             dioxide = Integer.parseInt(JOptionPane.showInputDialog("Input the polution level of Carbon Dioxide?"));
             lead = Integer.parseInt(JOptionPane.showInputDialog("Input the polution level of Lead?"));
             mercury = Integer.parseInt(JOptionPane.showInputDialog("Input the polution level of Mercury?"));
      
         }
         
         public String highestPolution (){
        
                        
             
             if (dioxide > lead & dioxide >mercury){
             return "dioxide";
         }
                if ( lead > mercury&  lead >mercury){
             return "lead";
         }
                else{
                return "Mercury";
                }
         
            
         }
      
      
    
    
}
