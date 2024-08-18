package Java10Aug2024.polymorphism;

public class poly7main
{
    public static void main(String[] args)
    {
        // See now let us understand what is this overriding part !
        poly5Father f=new poly5Father();
        f.home();
        // Here we have no problem as JVM knows from which class to take the home() method
        poly6Son s=new poly6Son();
        s.home();
        // Here also there is no problem as JVM knows from which class to take home() method
        poly5Father sf=new poly6Son();
        // Now see home() is common in both parent and child class here we are creating son object and
        // giving the reference of Parent class to it . Now for this case what we will do is
        // We will create an @Override in a child class and thus during runtime JVM decides which
        // method to be implemented i.e. method from child class will be implemented Hence Overriding
        // concept comes into picture for this type of case
        sf.home();
        // Now what if
        // sf.bike(); // Throws an error
        // As bike method is not common method and also not found in the parent class
    }
}
