/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reprecords;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author exam
 */
public class testRep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    
    {
        
        RepRecords rep1 = new RepRecords("Gebreab");
        RepRecords rep2 = new RepRecords();
        
        
        rep1.setDetails("kb",25, 76.8);
        JOptionPane.showMessageDialog(null, rep1.getName());
        JOptionPane.showMessageDialog(null, rep1.toString());
        
        
        
        
        
        /*try{
        Scanner kb = new Scanner(new FileReader("C:/details.txt"));
        
        String name = kb.nextLine();
        int age = kb.nextInt();
        
        }
        catch(FileNotFoundException e){
        System.out.println("The file does not exist");
        } */
            
    }
        
    }
    
