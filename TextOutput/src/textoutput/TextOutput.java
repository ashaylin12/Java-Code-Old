/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author prvt
 */
public class TextOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        TextOutput obj = new TextOutput();
        obj.asdf();
        
        
    }
    
    public void asdf(){
        
        try{ 
            PrintWriter out = new PrintWriter
                    
                    (new FileWriter ("learners.txt",true));
            for(int i = 1; i<=5 ; i++){
                String adminNo = JOptionPane.showInputDialog("Enter Admin Number");
                String name = JOptionPane.showInputDialog("Enter Name");
                out.println(adminNo + "#" +name);
                
                
                
               
            
            }
            out.close();
            
            
                    }
        catch(IOException e){
            
            
            
            
        
        
        }
    
    }
}
