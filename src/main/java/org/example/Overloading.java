package org.example;

class Calculator
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
}
public class Overloading {
    public static void main(String args[])
    {
        Calculator c = new Calculator();
        System.out.println(c.add(3,5));
        System.out.println(c.add(3.4,8.9));
    }
}
