package Java10Aug2024;

public class thisVsSuper
{
    public static void main(String[] args)
    {
        Alto c=new Alto();
        c.Speed();
    }
}
class Alto extends Car
{
    int speed=120; // Child Data
    public void Speed()
    {// this keyword is used to access the data from the subclass or child class
        System.out.println("Speed of a Child  :"+this.speed);
        System.out.println("Speed of a Parent :"+super.speed);
        super.message(); // This is directly going to access the parent class due to super keyword
        this.message();// This is directly going to access the child class due to this keyword
    }// super keyword is used to access the data from Parent class

    void message()
    {
        System.out.println("This is Child");
    }
}

class Car
{
    int speed=250;//Parent Data
    void message()
    {
        System.out.println("This is Parent");
    }
}