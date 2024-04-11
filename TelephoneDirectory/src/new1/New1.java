/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package new1;


import javax.swing.JOptionPane;

/**
 *
 * @author exam
 */
public class New1 {
    
        public static void main(String[] args) {

        New1 obj = new New1();
        obj.Answer();

    }//main
        
   
        

    public void Answer() {
        
        String Answer = "";
        String userinput;
        userinput = JOptionPane.showInputDialog("What is the sentence?");
        
        
      
        String [] array = userinput.split(" "); 
           
     
   
        for (int k = 0; k < array.length; k++  )
        {
        Answer = Answer + array[k].charAt(0) + array[k].substring(1).replaceAll("[aeiou]" , "") +" " ;
        
        }
       
        JOptionPane.showMessageDialog(null, "" + Answer);
        
        System.exit(0);


    }//answer


}//class

