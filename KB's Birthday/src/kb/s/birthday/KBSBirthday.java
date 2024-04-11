/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kb.s.birthday;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class KBSBirthday {

    String Str = "Happy b-day";
    String writer = "";
    public void main(String[] args){
    KBSBirthday obj = new KBSBirthday();
    k();
    }
        
      
           
            public void k (){    
            File fileOut = new File("Bday.txt");
           BufferedWriter A = new BufferedWriter(A);
         
           for (int i = 0; i< 100 ; i++){
              Str = "\n" + Str ;
           }
        try {
            A.write(Str);
        } catch (IOException ex) {
            Logger.getLogger(KBSBirthday.class.getName()).log(Level.SEVERE, null, ex);
        }
          
           }
}

               
        
    
