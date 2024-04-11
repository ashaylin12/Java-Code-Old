
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
public class Quest3 {
    
    String mixnumber = "";
    String arr [] = new String [20];
    String original [] = new String [20];
   
    public static void main(String [] args){
    
        Quest3 obj = new Quest3();
        obj.writeToFile();
        obj.readFromFile();
       
    
    }
 
      
    
 public void writeToFile(){
        
        try{ 
            
            PrintWriter out = new PrintWriter
                    
                    (new FileWriter ("inputs.txt",true));
            for(int i = 0; i<20 ; i++){
            
                mixnumber = JOptionPane.showInputDialog("Enter the Phone number");
                    if(mixnumber != "q"){
                    out.println(mixnumber);
                    }
                    else{
                    i = 21;
                    }
                
                            
            }
            out.close();
            
            
            
            
                    }
        catch(IOException e){
            
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
                   
        }
              
}
 
   public void readFromFile(){
             
         try{
             
             Scanner kb = new Scanner (new FileReader ("inputs.txt"));
             
             int count = 0;
             int add = 0;
             while(kb.hasNext())
             
             {
             arr [count] = kb.nextLine();
             
             count ++;
             }
             
           }       
         
          catch(FileNotFoundException e)
         {
             
             JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
         
         }
         
    }
   
   public void originalArray(){
   
   for(int i = 0; i < 20; i++){
       
       original [i] = arr [i];
   
   }
   
   }
   public void decrypt(){
   
       for (int i =  0; i<20 ; i++){
       
          arr [i].replaceAll("[abcABC]", "2"); 
          arr [i].replaceAll("[defDEF]", "3"); 
          arr [i].replaceAll("[ghiGHI]", "4"); 
          arr [i].replaceAll("[jklJKL]", "5"); 
          arr [i].replaceAll("[mnoMNO]", "6"); 
          arr [i].replaceAll("[pqrsPQRS]", "7"); 
          arr [i].replaceAll("[tuvTUV]", "8"); 
          arr [i].replaceAll("[wxyzWXYZ]", "9"); 
          
       
       }
       
       
   }
 
}
     



