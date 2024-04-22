package org.example;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }
}

public class Overriding
{

    public static void main(String args[])
    {
        Animal animal = new Dog();
        animal.sound();
    }
}
