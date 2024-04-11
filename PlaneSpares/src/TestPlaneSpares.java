
import java.io.*;
import java.util.*;
import javax.swing.*;

public class TestPlaneSpares {

    PlaneSpares[] arrSpares = new PlaneSpares[100];
    int c = 0;

    public void readFromFile() {
        try {
            Scanner sc = new Scanner(new FileReader("Spares.txt"));

            while (sc.hasNext()) {
                String line = sc.nextLine();

                Scanner scLine = new Scanner(line).useDelimiter(";");

                String code1 = scLine.next();
                String description1 = scLine.next();
                double costPrice1 = scLine.nextDouble();
                int noInStock1 = scLine.nextInt();

                arrSpares[c] = new PlaneSpares(code1, description1, costPrice1, noInStock1);
                c++;

            }//while
            sc.close();
        }//try
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
    }

    public void display() {

        //String line1 = "List of all Stock Items";
        //String line2 = "=======================";
        //String line3 = String.format("%-10s%-30s%-12s%-10s","Item code","Item Description","Cost Price","Quantity");
        //String temp = line1 + "\n" + line2 + "\n" + line3;
        //JOptionPane.showMessageDialog(null, temp);
        System.out.println("List of all Stock Items");
        System.out.println("=======================");
        System.out.printf("%-10s%-30s%-12s%-10s", "Item code", "Item Description", "Cost Price", "Quantity");
        System.out.println();

        for (int i = 0; i < c; i++) {
            System.out.println(arrSpares[i].toString());
        }
    }

    public void sort() {
        for (int i = 0; i < c - 1; i++) {
            for (int j = i + 1; j < c; j++) {
                if (arrSpares[i].calcSellingPrice() > arrSpares[j].calcSellingPrice()) {
                    PlaneSpares temp = arrSpares[i];
                    arrSpares[i] = arrSpares[j];
                    arrSpares[j] = temp;
                }//if    
            }//for
        }//for    
        display();
    }//method

    public static void main(String args[]) {
        TestPlaneSpares obj = new TestPlaneSpares();
        obj.readFromFile();



        Scanner inKb = new Scanner(System.in);
        char ch = ' ';

        while (ch != 'Q') {

            //JOptionPane.showInputDialog( "\n\n" + "    Menu" + "\n A - Basic Display " + " \n B - Sort By Price" + " \n C - " + " \n Q - Quit" + "\n" + "\n Your Choice? :" ); 
            System.out.println("\n\n");
            System.out.println("    Menu");
            System.out.println("");
            System.out.println("A - Basic Display ");
            System.out.println("B - Sort By Price ");
            System.out.println("C - ");
            System.out.println("Q - QUIT");
            System.out.println("");
            System.out.print("Your Choice? :");
            ch = inKb.next().toUpperCase().charAt(0);
            switch (ch) {
                case 'A': {
                    obj.display();
                    break;
                }//A
                case 'B': {
                    obj.sort();
                    break;
                } //B

                case 'C': {
                    obj.display();
                    break;
                }//C

                case 'Q': {
                    System.exit(0);
                }//Q


            }//Switch
        }//while      


    }//main
}//class