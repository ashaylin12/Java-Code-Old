/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reprecords;

/**
 *
 * @author exam
 */
public class RepRecords {

    private int age;
    private double weight;
    private String name;

    public RepRecords() {

        age = 0;
        weight = 0.0;
        name = null;

    }

    public RepRecords(String theName) {

        name = theName;

    }

    public String getName() {


        return name;
    }

    public void setName(String nName){
    
        
        name = nName;
    
    }
    
    
    
    public int getAge() {


        return age;
    }
    /*public RepRecords(String theName, int theAge, double theWeight){

     name = theName;
     age = theAge;
     weight = theWeight;
    
     }*/

    public void setDetails(String n, int a, double w) {


        name = n;
        age = a;
        weight = w;

    }

    @Override
    public String toString() {

        String Str = name + " is " + age + " years old and weight  " + weight;

        return Str;

    }
}
