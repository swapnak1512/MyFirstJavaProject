package org.example;

class Car
{
    public void drive()
    {
        System.out.println("Car is driving");
    }
}
class SUV extends Car
{
    @Override
    public void drive() {
        System.out.println("SUV is driving");
    }

    public void offRoadMode()
    {
        System.out.println("SUV is in off-road mode");
    }
}

class Sedan extends Car
{
    @Override
    public void drive()
    {
        System.out.println("Sedan is driving");

    }

    public void cruiseControl()
    {
        System.out.println("Sedan has cruise control");

    }

}
public class CarDemo {
    public static void main(String args[])
    {


    Car car = new Car();
    Car suv = new SUV();
    Car sedan = new Sedan();
    car.drive();
    suv.drive();
    sedan.drive();
        ((SUV) suv).offRoadMode();
        ((Sedan) sedan).cruiseControl();

    }
}