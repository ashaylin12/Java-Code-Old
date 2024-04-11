/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textfile_input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author exam
 */
public class Worker {
    
     String mixnumber = "";
    String arr[] = new String[20];
    String original[] = new String[20];

   

    /*public void writeToFile(){
        
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
              
     }*/
    public void readFromFile() {

        try {

            Scanner kb = new Scanner(new FileReader("inputs.txt"));

            int count = 0;
            int add = 0;
            while (kb.hasNext()) {
                arr[count] = kb.nextLine();

                count++;
            }

        } catch (FileNotFoundException e) {

            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());

        }

    }

    public void originalArray() {

        for (int i = 0; i < 20; i++) {

            original[i] = arr[i];

        }

    }

    public void decrypt() {

        String replace[] = new String[8];

     
        for (int i = 0; i < 20; i++) {

            arr[i] = arr[i].toUpperCase();
            arr[i] = arr[i].replaceAll("[ABC]", "2");
            arr[i]= arr[i].replaceAll("[DEF]", "3");
            arr[i] = arr[i].replaceAll("[GHI]", "4");
            arr[i]= arr[i].replaceAll("[JKL]", "5");
            arr[i]= arr[i].replaceAll("[MNO]", "6");
            arr[i] = arr[i].replaceAll("[PQRS]", "7");
            arr[i] = arr[i].replaceAll("[TUV]", "8");
            arr[i] = arr[i].replaceAll("[WXYZ]", "9");
            
            System.out.println(arr[i]);


        }



    }
    
}
