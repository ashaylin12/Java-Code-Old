
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class TestQuestion2 {

    Event arrEvents[] = new Event[20];
    int count = 0;

    public void optionA() {
          System.out.println();
        System.out.printf("%-30s%-35s%-20s%-15s%-14s\n", "Title", "Organiser", "Date of event", "Income", "Expenses");
        for (int k = 0; k < count; k++) {
            
            System.out.println(arrEvents[k].toString());
          
        }
        
          System.out.println();
          
            System.out.println();

    }//OptionA

    public void optionB() {
        System.out.println();
        
        System.out.printf("%-20s%-15s","Organiser","Profit");
        System.out.println();
        
        for(int i=0; i<count; i++){
        
        System.out.printf("%-20sR%-13.2f",arrEvents[i].constructNameString(),arrEvents[i].calculateProfit());
        System.out.println();
        
        }//for
        
        
    }//OptionB

    public void optionC() {
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        System.out.println(" ");
        System.out.printf("%30s\n\n", "Profit per term");
        System.out.printf("%9s%17s%17s\n", "Term 1", "Term 2", "Term 3");
    }//OptionC

    public TestQuestion2() {


        try {

            Scanner sc = new Scanner(new FileReader("data2011.txt"));
            while (sc.hasNext()) {
                String line1 = sc.nextLine();
                String line2 = sc.nextLine();
                String line3 = sc.nextLine();

                int psnCollon = line1.indexOf(":");
                int psnComma = line1.indexOf(",");
                int psnOn = line1.indexOf(" on");

                int len = line1.length();

                String name = line1.substring(0, psnCollon);
                String person = line1.substring(psnCollon + 1, psnOn);
                String date = line1.substring(len - 10);
                double income = Double.parseDouble(line2);
                double expense = Double.parseDouble(line3);
                
                arrEvents[count] = new Event(name,person,date,income,expense);
                count++;
            


            }//while
            
            sc.close();



        }//try
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());



        }//catch


    }

    public static void main(String[] args) throws IOException {
        TestQuestion2 obj = new TestQuestion2();
        System.out.println("\f");
        BufferedReader inKb = new BufferedReader(new InputStreamReader(System.in));
        char ch = ' ';
        while (ch != 'Q') {
            System.out.println("        Menu ");
            System.out.println(" ");
            System.out.println("    A - Option A");
            System.out.println("    B - Option B");
            System.out.println("    C - Option C");
            System.out.println("    Q - QUIT");
            System.out.println(" ");
            System.out.print("    Your choice? :");
            ch = inKb.readLine().toUpperCase().charAt(0);
            switch (ch) {
                case 'A': {
                    obj.optionA();
                    break;
                }
                case 'B': {
                    obj.optionB();
                    break;
                }

                case 'C': {
                    obj.optionC();
                    break;
                }

                case 'Q': {
                    System.exit(0);
                }

            }

        }

    }
}
