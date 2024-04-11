
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prvt
 */
public class IDnum {

    
    
String  ID = "";    
String year = "";
String month = "";
String day  = "";
String dob = "";
String gender = "";

public static void main(String []args)
{
 IDnum obj  = new IDnum();
 obj.Input();
 obj.Inicialize();
 
 
    
}
    
public void Input (){
    

ID = JOptionPane.showInputDialog("What is your ID number");    
ID = ID.replaceAll(" ","");


}    

public void Inicialize()
{
  year =  "19" + ID.substring(0,2);
  month =   ID.substring(2,4); 
  day =   ID.substring(4,6);
  int m = Integer.parseInt(month);
  switch(m)
  {
      case 1 : month = "January";
      break;    
      case 2 : month = "February";
      break;    
      case 3 : month = "March";
      break;    
      case 4 : month = "April";
      break;  
      case 6 : month = "June";
      break;    
      case 7 : month = "July";
      break;  
      case 8 : month = "August";
      break;    
      case 9 : month = "September";
      break;    
      case 10 : month = "October";
      break;
      case 11 : month = "November";
      break; 
      case 12 : month = "December";
      break;    
      case 5 : month = "May";
      break;        
  }
  String dob = day + "" +month+ "" +year;
  int numYear=Integer.parseInt(year);
  int age = 2013 - numYear;
  
  String gender = "";
  gender = ID.substring(6,10);
  int numGender = Integer.parseInt(gender);
 
  if(numGender <5000)
  {
      gender = "Female";
      
  }
  else 
  {
      gender = "Male";
  }
  
}

public String output()
{
    String output1 = ("Your ID number is:" + ID + "\n" + "Your date of birth : " + dob + "\n" + "Your Gender:" + gender);
    return output1;
    
}        



}