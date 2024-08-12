package Java04Aug2024;

public class paraConstruct2
{
    public static void main(String[] args)
    {
        PersonDetails p0=new PersonDetails(); // Default Constructor  is called
        // Note : Here constructors are compared with object created and based on the object natures , respective constructors are invoked
        PersonDetails p=new PersonDetails("Amit"); // Parametrized constructor with only 1 argument assigned is invoked
        PersonDetails p1=null;
        PersonDetails p2=new PersonDetails("Vikas", 123456);// Parametrized constructor with 2 arguments assigned is invoked
        System.out.println(p2.name);
    }
}