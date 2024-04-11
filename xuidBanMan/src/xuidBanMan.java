
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class xuidBanMan {
   
    String [] xuid = new String[50];
    int count = 0;
    
    
   public xuidBanMan(){

try{
             
             Scanner kb = new Scanner (new FileReader ("E:/Modern Warfare 3 2.7.0.1 server/addon/xuids.config"));
             
             
            
            
             while(kb.hasNext()){
             xuid[count] = kb.nextLine();
             
             count ++;
             
             }
             
             
           }       

         
          catch(FileNotFoundException e)
         {
             
             JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
         
         }

   }
   
   
   
   
   
     
  public void readPlayerLog(){
  int counter = 0;
  try{
             
             Scanner sc = new Scanner (new FileReader ("E:/Modern Warfare 3 2.7.0.1 server/addon/logs/player.txt"));
             
             while(sc.hasNext()){
             if(xuid[count].equalsIgnoreCase(sc.nextLine())){
                 
                
                             
             }
             
             
       }
  }
  
  
  
  
 catch(FileNotFoundException e)
         {
             
             JOptionPane.showMessageDialog(null,"Error : " + e.getMessage());
         
         }
          
}
   
   
 
  
  
  
  
  
  
   
}



   



