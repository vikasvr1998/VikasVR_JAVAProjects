package Java11Aug2024.Interface;

public interface interface3
{
    /*
  Note : Interface will permit only default methods and the static methods , it doesn't allow any other
  complete methods  */

    default void engine()
    {
        System.out.println("Engine starts ");
    }

    static void gear()
    {
        System.out.println("1 st Gear ");
    }

    void keys(); // Possible
 //   void clutch()
 //   {
 //                      NOT POSSIBLE !!!!
 //   }
    void clutch();  // Possible
}