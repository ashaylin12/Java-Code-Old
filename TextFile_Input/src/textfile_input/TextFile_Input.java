
package textfile_input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class TextFile_Input {

   
    public static void main(String[] args) {
        
        TextFile_Input obj = new TextFile_Input();
        obj.readFromFile();
        
    }
    
    public void readFromFile(){
             
         try{
             
             Scanner kb = new Scanner (new FileReader ("C:/inputfile.txt"));
             
             int count = 0;
             int add = 0;
             while(kb.hasNext()){
             String line = kb.nextLine();
             System.out.println(line);
             add = add + Integer.parseInt(line);
             count ++;
             }
             
             System.out.println("There are "+count+" records in the file");
             System.out.println("Total numbers added together is : " +add);
}       
         
          catch(FileNotFoundException e)
         {
             
             JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
         
         }
         
    }
    
   
    
}
         
         
