
import java.util.Scanner;
import javax.swing.*;

public class RepRecord {

    Scanner kb = new Scanner(System.in);
     String name;
     int age;
     double weight;

    public RepRecord() {

        age = 0;
        name = null;
        weight = 0;
        

    }//set
    
    
     public RepRecord(String theName) {
     
         name = theName;
      
     
     }
     
     public RepRecord(String theName,int theAge,double theWeight) {
     
     
     name = theName;
     age = theAge;
     weight = theWeight;
     
     }
     
     
     
     

    public void set(String theName,int theAge,double theWeight) {
   
            name = theName;
            age = theAge;
            weight = theWeight;

    }
    
    
    public void setWeight(double theWeight) {
    
        weight = theWeight;
        
    
    }
    
    
     public void setAge(int theAge) {
    
        weight = theAge;
        
    
    }
     
     public String getName(){
     
     return name;
         
     }
     
     public int getAge(){
     
     return age;
     
     }
 
    
    
}
