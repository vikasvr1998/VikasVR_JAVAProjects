package Java04Aug2024;

public class LocalsInstance {
    int a = 10;

    public static void main(String[] args)
    {
       LocalsInstance l=new LocalsInstance();
       l.fn();
       l.fn1();
    }
    void fn()
    {
        int a = 5;
        System.out.println(a);// Here Local Variables will be accessed and its scope is only within fn() block
    }
    void fn1()
    {
    System.out.println(a);// Instance Variables will be accessed
    }
}