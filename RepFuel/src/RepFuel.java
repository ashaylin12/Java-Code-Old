
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rajesh
 */
public class RepFuel {

    private String arrName[] = new String[20];
    private int arrFuel[] = new int[20];
    private int count = 0;
    
   private String tempName = null;

    public int readData() {
        
         

        String temp = "";
        
        
        do {
            


            tempName =  JOptionPane.showInputDialog("Input the rep Name " + temp);
            
            
            if (tempName.compareToIgnoreCase("xxx")>0||tempName.compareToIgnoreCase("xxx")<0) {

                arrFuel[count] = Integer.parseInt(JOptionPane.showInputDialog("Input the fuel used for " + tempName));
                arrName[count] = tempName;
            }
            count++;
          

        temp = "OR xxx to Stop";
        
      

if(tempName.compareToIgnoreCase("xxx")==0){
 
    
        count--;
        
}

        }
        
        while (tempName.compareToIgnoreCase("xxx")<0||tempName.compareToIgnoreCase("xxx")>0 );     
        
        return count;
    }
    
    

    public void search() {

        String searchName = JOptionPane.showInputDialog("Input a name to update");

        boolean found = false;



        for (int i = 0; i < count; i++) {


            if (searchName.compareToIgnoreCase(arrName[i]) == 0) {


                found = true;

                System.out.println("");

                arrFuel[i] = Integer.parseInt(JOptionPane.showInputDialog("Input the updated fuel amount for " + arrName[i]));

            }//if search id


        }

        if (found == false) {
            System.out.println();
            System.out.println("ID " + searchName + " was not found. ");
        }





    }

    public void sort() {

        for (int i = 0; i < count; i++) {
            for (int k = i + 1; k < count; k++) {

                if (arrFuel[i] > arrFuel[k]) {

                    int tempFuel = arrFuel[i];
                    arrFuel[i] = arrFuel[k];
                    arrFuel[k] = tempFuel;

                    String tempName = arrName[i];
                    arrName[i] = arrName[k];
                    arrName[k] = tempName;

                }
            }
        }

    }
    
    
    public double calculateAvg(){
    
        double avgFuel = 0.0;
        for (int i = 0; i<count; i++){
        avgFuel = avgFuel + arrFuel[i];
        }
        avgFuel = (double)(avgFuel / count);
        return avgFuel;
    }
    
 
    public void display(){
        
       for(int i =0 ; i<count; i++){
      
    
           System.out.println(arrName[i] + "   Fuel : "   + arrFuel[i]);
      
       }
        
       
    
    }
}
