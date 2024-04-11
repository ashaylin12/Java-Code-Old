
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 * @author Rajesh
 */
public class testClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       try{
           String a = "H:/Modern Warfare 3 2.7.0.1 server/TeknoMW3_dedicated.exe";
           String b = " +set dedicated 2 +set net_ip quadclanza.dlnikddns.com +set net_authPort 8766 +set net_queryPort 27016 +set net_port 27018 +set net_masterServerPort 27017 +set sv_config ";
           String c ="server.cfg" ;
            String d= " +set maprotation default +start_map_rotate /c start cmd";
            System.out.println("\"" + a + "\"" + b +"\"" +c +"\"" +d);
        Runtime.getRuntime().exec("\"" + a + "\"" + b +"\"" +c +"\"" +d);
           
    }
       catch(IOException e){
           System.out.println("Error : " +e.getMessage());
       }
       
    }
}
