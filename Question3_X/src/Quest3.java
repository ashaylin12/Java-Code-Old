
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author exam
 */
public class Quest3 {
    
    String mixnumber = "";
    
    public static void main(String [] args){
    
        Quest3 obj = new Quest3();
        obj.output();
    
    }
 
    
    
 public void output(){
        
        try{ 
            PrintWriter out = new PrintWriter
                    
                    (new FileWriter ("inputs.txt",true));
            for(int i = 0; i<20 ; i++){
                mixnumber = JOptionPane.showInputDialog("Enter the Phone number");
                out.println(mixnumber);
                            
            }
            out.close();
            
            
                    }
        catch(IOException e){
            
            
            
            
        
        
        }
              
}
 
}
     



