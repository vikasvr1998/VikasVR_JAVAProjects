package Java11Aug2024;

public class static1
{
    /*
    To Access the static variable we don't need to create any object ! Why ?
    Because these are present in the class loaders of JVM and can be directly accessed using the class name
  */
    public static void main(String[] args)
    {
        ATB a=new ATB("Vikas");
        System.out.println(a.getName());
        System.out.println(ATB.batch);// Accessing the static variable using class name ATB
        ATB.homework();//Accessing the static methods directly through class name ATB
    }
}
/* There is a 5-step process When you create ATB a=new ATB();
      1. Class will loaded and methods present inside the static block is executed
      2. "I will be called if you create an object " statement is executed
      3. Parameterized constructors are called
      4. reference of a is created
      5. Object is created
      */
class ATB
{
    {
        System.out.println("I will be called if you create an object");
    }
    // As soon as you complete the object code , This will be called (Above)

    static
    {
        System.out.println("I will be called when the class is loaded");
    }
   // As soon as you type ATB , This will be called (Above)


    private String name;
    static String batch="Batch12"; // Common for everyone

    public ATB(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    static void homework() // Common for everyone whether it is Vikas or Amit everyone should complete
    {                      //  their assignments . Hence, we kept this method as static
        System.out.println("Please submit your Assignments");
    }
}