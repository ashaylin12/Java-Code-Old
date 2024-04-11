//Type your examination number in ...
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestQuestion2 {

    public static void main(String[] args) throws Exception {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        char choice = ' ';
        do {
            System.out.println();
            System.out.println("    MENU");
            System.out.println();
            System.out.println("  Option A");
            System.out.println("  Option B");
            System.out.println("  Option C");
            System.out.println();
            System.out.println("  Q - QUIT");
            System.out.println("\n  Your choice?  ");
            choice = kb.readLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':

                    System.out.printf("%-25s%-15s%-10s%-10s\n", "Name", "Num", "Size", "Cat");
                    int counter = 0;
                    double total = 0;


                    try {

                        Scanner sc = new Scanner(new FileReader("DataQ2.txt"));
                        while (sc.hasNext()) {//next line
                            String line = sc.nextLine();//scans line
                            line = line.replaceAll(";", "#");//replace
                            Scanner d1 = new Scanner(line).useDelimiter("#");//delimiter
                            String[] part = line.split("#");//split
                            String name = part[0];//part[0]
                            int num = Integer.parseInt(part[1]);//par[1]
                            double size = Double.parseDouble(part[2]);//part[2]
                            char cat = part[3].charAt(0);//part[3
                            System.out.printf("%-25s%-15s%-10.2f%-10s\n", name, num, size, cat);
                            counter++;
                            total = total + size;


                        }
                        //System.out.println("The average is: "+ (total/counter));
                        //total = Math.round(total);
                        System.out.printf("Average is : %-6.2f", total);

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 'B':
                    //csc
                    Scanner kb1 = new Scanner(System.in);
                    try {
                        PrintWriter out = new PrintWriter(new FileWriter("Months.txt"));
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Enter month");
                            String month = kb1.next();
                            out.println(month);
                        }
                        out.close();
                    } catch (IOException e) {
                        System.out.println("Error:" + e.getMessage());
                    }
                    break;
                      case 'c':
                    //csc
                    Scanner kb2 = new Scanner(System.in);
                    try {
                        PrintWriter out = new PrintWriter(new FileWriter("Months.txt",true));
                        JOptionPane.showInputDialog("Input a month to add");
                        out.close();
                    } catch (IOException e) {
                        System.out.println("Error:" + e.getMessage());
                    }
                    break;
                case 'Q':
                    System.out.println("Quit");
            }
        } while (choice != 'Q');
    }
}       
