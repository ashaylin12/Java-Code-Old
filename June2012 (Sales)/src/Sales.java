
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prvt
 */
public class Sales {

    String makes[] = {"FORD", "AUDI", "BMW", "MERC", "HONDA", "HYUNDAI"};
    int sale[] = new int[6];

    public void generate() {

        for (int i = 0; i < 6; i++) {

            sale[i] = (int) (Math.random() * 800001/*high val - low val*/ + 100000/* low val*/);


        }//for


    }//generate
    public String highest() {

        String highMake = makes[0];
        int highSale = sale[0];
        for (int i = 1; i < 6; i++) {

            if (sale[i] > highSale) {
                highMake = makes[i];
                highSale = sale[i];
            }

        }
        return highMake;
    }

    public void sort() {

        for (int i = 0; i < 5; i++) {

            for (int j = i + 1; j < 6; j++) {

                if (makes[i].compareToIgnoreCase(makes[j]) > 0) {
                    String tempMake = makes[i];
                    makes[i] = makes[j];
                    makes[j] = tempMake;

                    int tempSale = sale[i];
                    sale[i] = sale[j];
                    sale[j] = tempSale;

                }
            }
        }
    }//sort
    public int count() {

        int counter = 0;

        for (int i = 0; i < 6; i++) {

            if (sale[i] > 500000) {
                counter++;
            }

        }

        return counter;
    }

    public void Search(String srchMake, int updatedsale) {

        int i = 0;
        boolean found = false;

        while (found = false && i < 6) {
            if (srchMake.equalsIgnoreCase(makes[i])) {
                sale[i] = updatedsale;
                found = true;
            }

            i++;

        }

        if (found = false) {

            JOptionPane.showMessageDialog(null, srchMake + " is an invalid make");
        }

    }

    public void Display() {
        System.out.printf("%-20s%-15s\n", "Make", "Sale");

        for (int i = 0; i < 6; i++) {
            System.out.printf("%-20s%-15s\n", makes[i], sale[i]);
        }

    }

    public double Average() {

        double avg = 0;

        for (int i = 0; i < 6; i++) {

            avg = avg + sale[i];
        }

        avg = (avg / 6.0);

        return avg;
    }

    public void LinearSearch(char searchLetter) {
        searchLetter = Character.toUpperCase(searchLetter);
        System.out.println("Vecihles that start with " + searchLetter);
        for(int i = 0 ; i<6; i++){
        if(makes[i].charAt(0)==searchLetter){
        
            System.out.println(makes[i]);
        }
       
        
        }



    }
}



