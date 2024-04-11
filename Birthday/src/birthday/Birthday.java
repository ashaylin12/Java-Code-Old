/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package birthday;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author support
 */
public class Birthday
{
    private String Str = "Happy Birthday mnr. Gebreab! =D";


   public void writeFile() throws FileNotFoundException, IOException
    {
            FileWriter fileOut = new FileWriter("c:/HappyBirthday.txt",true);
            PrintWriter out = new PrintWriter(fileOut);
            out.println(Str);
            out.close();      

    }
}
