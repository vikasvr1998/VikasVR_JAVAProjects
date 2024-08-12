package Java04Aug2024;

public class ConstructorBasics
{
    public static void main(String[] args)
    {
       Car c=new Car(); // Here the default constructor will be invoked based on new keywords counts
       new Car();// Here 2 times default constructor will be executed
        // Car - ClassName
        // c - Reference Variable
        // new Car() - Object 1
        // new Car() - Object 2 (Here we don't have reference variable pointing at it )
    }
}