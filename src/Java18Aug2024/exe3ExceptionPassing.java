package Java18Aug2024;

public class exe3ExceptionPassing
{
    public static void main(String[] args)
    {
        execution();
    }
    static void execution()
    {
        execution1();
    }
    static void execution1()
    {
        try
        {
            Integer[] i=new Integer[2];
            System.out.println(i[3]); // Here we will add try catch methods
        }
        catch (Exception e)
        {
            System.out.println("Array Index out of bound exception");
        }
        finally
        {
            System.out.println("Close all the files ");
        }
    }
}