package Java28July2024;

public class Oops4DogClass
{ // Here we have created 2 objects and each objects has different behaviours
    public static void main(String[] args)
    {
        DogClass d1=new DogClass();
        d1.name="German Shepherd";
        d1.colour="Black";
        d1.age=8;
        System.out.println(d1.name);
        System.out.println(d1.colour);
        System.out.println(d1.age+" years");
        d1.eat();
        d1.sleep();

        DogClass d2=new DogClass();
        d2.name="Pug";
        d2.colour="White";
        d2.age=5;
        System.out.println(d2.name);
        System.out.println(d2.colour);
        System.out.println(d2.age+" years");
        d2.eat();
        d2.sleep();
    }
}