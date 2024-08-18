package Java10Aug2024.polymorphism;

public class poly6Son extends poly5Father
{
    @Override
    void home()
    {
        System.out.println("Overrides..... ");
    }

    void bike()
    {
        System.out.println("Bike");
    }
}