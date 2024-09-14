package Java17Aug2024;

public class Exceptions3
{
    public static void main(String[] args)
    {
        try
        {
            int a=10;
            int c=a/0;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println("Not defined when any number is divisible by zero");
        }
        System.out.println("End of the Code");
    }
}
