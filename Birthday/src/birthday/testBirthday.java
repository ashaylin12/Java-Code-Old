/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package birthday;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author support
 */
public class testBirthday
{
   public static void main (String [] args) throws FileNotFoundException, IOException
   {
      Birthday jacob = new Birthday();
      for(int i = 0; i < 101; i++)
      {
        jacob.writeFile();     
      }


   }
}
