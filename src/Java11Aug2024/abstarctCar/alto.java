package Java11Aug2024.abstarctCar;

public class alto
{
    public static void main(String[] args)
    {
        CarOn c=new CarOn();
        c.drive();
        /*  as the drive() is only used by user but in reality do the user know that he is indirectly
         using the condition class , engine class , gear class as well as CarOn class ????
         No hence this is the concept of abstract i.e. hiding unnecessary methods !
        */
    }
}