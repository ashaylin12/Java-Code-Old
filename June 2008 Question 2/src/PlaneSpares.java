/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prvt
 */
public class PlaneSpares {

    private String code;
    private String description;
    private double costPrice;
    private int noInStock;

    public PlaneSpares(String code1, String description1, double costPrice1, int noInStock1) {

        code = code1;
        description = description1;
        costPrice = costPrice1;
        noInStock = noInStock1;

    }

    public String toString() {

        String objStr = String.format("%-10s%-30s%-14.2f%-10s", code, description, costPrice, noInStock);

        return objStr;
    }

    public double calcSellingPrice() {

        double sp = costPrice * 1.1;



        return sp;

    }

    public String getCode() {

        return code;
    }

    public int getStock() {

        return noInStock;
    }

    public void setQuantity(int value) {

        noInStock = noInStock - value;

    }
}