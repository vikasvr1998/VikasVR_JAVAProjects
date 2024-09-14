package Java17Aug2024;

public class Ques
{
    public static void main(String[] args)
    {
        //Here class is however loaded at first and hence further it will not execute another time as soon as you create 1 more object
        A a=new A();
        A a2=new A();// Here we have created one more object hence , As soon as Object..... will be executed one more time
        A.m1();// Static methods can be called directly by class Name , Here we don't create objects
        a.m2();//Non-Static methods should be called through object reference
    }
}
class  A
{
    int num=10;
    static
    { // This will be executed only once as soon as the class is loaded , Any number of objects you create this will execute only once
        System.out.println("As Soon as class is loaded i am executed ..");
    }
    {
        System.out.println("As soon as Object is created i am executed ...");
    }
    static void m1()
    {
        System.out.println("I am mandatory for all ..");
    }
    void m2()
    {
        System.out.println("I am non static method..For me to execute object has to be created ...");
    }
}