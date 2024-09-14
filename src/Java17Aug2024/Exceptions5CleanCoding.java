package Java17Aug2024;

public class Exceptions5CleanCoding
{
    public static void main(String[] args)
    {
        System.out.println("Start of the program");
        int b=0; // Here we have to initialize the b
        try
        {
            String ip=args[0];
            int a=Integer.parseInt(ip); // Conversion from String ------> int
            b=1000/a;
        }
        catch (ArithmeticException |NumberFormatException |ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Oops there is some problem !!!!!!!!!!");
            System.out.println(e.getMessage());
        }
    }
}