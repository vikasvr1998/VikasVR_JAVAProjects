package Java10Aug2024;

public class thisVsSuper2 // Now let us also play with constructors
{
    public static void main(String[] args)
    {
        santro c=new santro();

    }
}
class santro extends car1
{
    santro()
    {
        super(); // We can call Parent constructor in the child constructor using super() method
        System.out.println("Child constructor");
    }
}

class car1
{
    car1()
     {
        System.out.println("Parent constructor");
     }

}