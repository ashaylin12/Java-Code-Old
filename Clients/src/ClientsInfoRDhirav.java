
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rana
 */
public class ClientsInfoRDhirav {

    private int ClientID;
    private String ClientName;
    private double HoursUsed;
    private double discount;

    public ClientsInfoRDhirav(int ID, String cname, double hours) {

        ClientID = ID;
        ClientName = cname;
        HoursUsed = hours;

    }//CLientsInfoRDhirav

    @Override
    public String toString() {

        String mGK = String.format("%-25s%-25s%-10s%-20sR%-15.2f%-10sR%-10.2f", "ClientID" + ClientID, ClientName, HoursUsed, "Discount: ", Discount(), "Cost: ", CalculateCost() - Discount());

        //String mGK = ( "ClientID :" + ClientID +"         "+  ClientName + "         "+ HoursUsed + "         "+ "Discount: R" +Discount() + "         "+ "Cost: R" +( CalculateCost()-Discount()));


        return mGK;
    }//toString

    public double CalculateCost() {

        String tempcost = "" + HoursUsed;
        double cost = 0.00;

        int hours = (int) (HoursUsed);
        double minutes = (HoursUsed - hours) * 100;
        cost = (hours * 30);


        if (minutes <= 15) {
            cost = cost + 10;
        } else if (minutes > 15 && minutes <= 30) {
            cost = cost + 18;
        } else if (minutes > 30 && minutes <= 45) {
            cost = cost + 25;
        } else if (minutes > 45 && minutes < 60) {
            cost = cost + 30;
        }
        return cost;
    }//CalculateCost

    public double Discount() {

        double CostTemp = CalculateCost();

        double discount = 0.00;
        if (ClientID != 999) {
            discount = CostTemp * 0.05;

        }

        return discount;
    }//Discount

    public String getClientName() {

        return ClientName;
    }//getClientName

    public int getClientID() {

        return ClientID;
    }//getClientID
}//class

