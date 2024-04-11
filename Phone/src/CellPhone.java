/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhiravRana
 */
public class CellPhone {

    private String brand;
    private String model;
    private String color;
    private double price;
    private int num_of_SMS;

    public CellPhone()
    {
        brand = "";
        model = "";
        color = "";
        price = 0.0;
        num_of_SMS = 0;
    }

    public CellPhone(String b, String m, String c, double p, int sms)
    {
        brand = b;
        model = m;
        color = c;
        price = p;
        num_of_SMS = sms;
    }

    public int recieveSMS() // this method returns the number of sms after increasing by 1
    {
       num_of_SMS = num_of_SMS + 1; //also can be written as num_of_SMS++;
       return num_of_SMS;
    }

    public void displayInfo()
    {
        System.out.println("The " + color + " " + brand + " " + model + " phone costs R" + price + " and has recieved " + num_of_SMS + " sms's.");
    }

    public void setColor(String nColor)
    {
        color = nColor;

    }


}
