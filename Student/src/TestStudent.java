
   import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DhiravRana
 */
   public class TestStudent
   {
   
      public static void main(String[] args)
      {
         Student Dhirav = new Student();
         Dhirav.setValues();
         Dhirav.checkTotal();
	 System.out.println("The Highest Mark Achieved was In Subject: " + Dhirav.DetermineHighestMark());
	 System.out.println("The Lowest Mark Achieved was In Subject: " + Dhirav.DetermineLowestMark());
      }
   }
