
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author exam
 */
public class testCompany {

   
    
    public static void main (String [] Args) {
    
    Company obj = new Company();
     
    obj.setDetails();
    obj.PrintOut();
    System.out.println(obj.highestPolution());
    System.out.println(obj.toString());
      
   
    
    
    }
    
    
}
