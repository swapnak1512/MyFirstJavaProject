package org.example;

public class StringDemo {
    public static void main(String args[])
    {
        String price ="$360 *includes tax";
        String[] splitPrice = price.split(" ",2);
        int priceInInt = Integer.parseInt(splitPrice[0].substring(1));
        System.out.println(priceInInt);
    }
}
