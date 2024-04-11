/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class QUADLauncher {

    String dir = "iw5mp.exe";
    boolean skip = false;
    int count = 0;
    String arr[] = new String[70];

    public void read() {

        try {

            Scanner kb = new Scanner(new FileReader("config.cfg"));


            while (kb.hasNextLine()) {

                String line = kb.nextLine();

                arr[count] = line;
                count++;

            }

            if (count > 1) {

                String part[] = arr[1].split("=");
                dir = part[1];

            }


           

        } catch (Exception ex) {
            System.out.println("File Read Error : " + ex.getMessage());
            settings();

        }



    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        QUADLauncher usd = new QUADLauncher();
        usd.read();
        usd.Interface();
        System.exit(0);



    }

    public void Interface() {



        boolean stop = false;
        String answer = "";

        while (stop == false) {

            answer = JOptionPane.showInputDialog(null, "Pick one of the following letters : \na - Start the exe\n b - inject the exe\nc - Generate new config file\nd - View Config file\n q - quit");



            if (answer.equalsIgnoreCase("q")) {
                stop = true;
                System.exit(0);
            }



            if (answer.equalsIgnoreCase("a")) {
                run();

            }

            if (answer.equalsIgnoreCase("c")) {
                settings();


            }

            if (answer.equalsIgnoreCase("d")) {

                if(count <1){
                    
                     read();
                     
                }
                 String temp = "Configuration File\n";
                    temp = temp + "===========================================";
                
                    for(int i =0 ; i<count;i++){
                    temp  = temp + "\n" +arr[i];
                }
                JOptionPane.showMessageDialog(null, temp);
                
            }
        }


    }

    public String directory() {

        String temp = "";

        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);


        if (fc.showOpenDialog(fc) == JFileChooser.APPROVE_OPTION) {
            temp = "" + (fc.getSelectedFile().getAbsolutePath());
        }

        try {

            PrintWriter asdf = new PrintWriter(new FileWriter("config.cfg"));

            read();
            
            arr[1] = "Game dir = " + temp;         

            for (int i = 0; i < count ; i++) {
                asdf.println(arr[i]);
               
            }

            asdf.close();


        } catch (Exception r) {
            JOptionPane.showMessageDialog(null, "Directory Error : " + r.getMessage());
        }



        return temp;

    }

    public void run() {

        boolean found = false;


        while (found == false) {


            try {

                Runtime rt = Runtime.getRuntime();
                Process execute = rt.exec(dir);
                InputStream in = execute.getInputStream();
                OutputStream out = execute.getOutputStream();
                found = true;



            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Please select the location of iw5mp.exe");

                dir = directory();


            }


        }


    }

    public String id() {

        String id = "";

        for (int i = 0; i < 8; i++) {

            int tempLetterNum = (int) (Math.random() * 25/*high val - low val*/ + 65/* low val*/);
            int tempNumNum = (int) (Math.random() * 9/*high val - low val*/ + 48/* low val*/);
            int or = (int) (Math.random() * 2/*high val - low val*/ + 1/* low val*/);


            if (or == 1) {

                id = id + (char) tempLetterNum;

            } else {

                id = id + (char) tempNumNum;

            }





        }

        id = id.toUpperCase();
        return id;

    }

    public String ipAddress() throws SocketException, UnknownHostException {

        String ipAddress = "0.0.0.0";

        InetAddress IP = InetAddress.getLocalHost();

        return "" + IP.getHostAddress();

    }

    public void settings() {


        try {

            PrintWriter asdf = new PrintWriter(new FileWriter("config.cfg"));


            asdf.println("[Launcher] ");
            asdf.println("Game dir = " + dir);
            asdf.println("[Launcher] ");
            asdf.println("Language = English");
            asdf.println("AutoInject = true");
            asdf.println("");
            asdf.println("[ClientInfo]");
            asdf.println("FOV = 70");
            asdf.println("Name = Player");
            asdf.println("ID = " + id());
            asdf.println("");
            asdf.println("[Network]");
            asdf.println("NetworkInterface = 255");
            asdf.println("NetworkInterfaceList = [0 = " + ipAddress() + "; 255 (default) = ANY IP]");

           
            asdf.close();
            JOptionPane.showMessageDialog(null, "Configuration File Successfully Generated");


        } catch (Exception a) {

            JOptionPane.showMessageDialog(null, "Settings Error : " + a.getMessage());

        }

    }
}