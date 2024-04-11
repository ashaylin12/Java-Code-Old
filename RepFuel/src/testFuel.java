/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh
 */
public class testFuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        RepFuel obj = new RepFuel();
        System.out.println("Count : " + obj.readData());
        System.out.println();
        System.out.println();
        
        
        obj.display();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        obj.search();
        obj.sort();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        obj.display();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        System.out.println("Average : " + obj.calculateAvg());
        System.out.println();
        System.out.println();
        System.out.println();
        obj.display();

    }
}
