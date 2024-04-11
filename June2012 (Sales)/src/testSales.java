
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

/**
 *
 * @author prvt
 */
public class testSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String inputmake = JOptionPane.showInputDialog("Input the Make");
        int inputsale = Integer.parseInt(JOptionPane.showInputDialog("Input the Amount"));
       char inputchar = JOptionPane.showInputDialog("Input the First Character").charAt(0);

        Sales obj = new Sales();

        obj.generate();

        System.out.println("Original Details Are :");

        obj.Display();
        obj.Search(inputmake, inputsale);

        System.out.println("\nSale Updated");
        System.out.println("\nSorted Array");
        obj.sort();
        obj.Display();

        System.out.println("\nThe Make of the Vehicle that generated the highest sales is : " + obj.highest());
        System.out.println("The number of makes that generated sales more that R 500 000 : " + obj.count());
        System.out.printf("The average sale is R :%-10.2f " , obj.Average(),"\n");
        
        obj.LinearSearch(inputchar);





    }
}
