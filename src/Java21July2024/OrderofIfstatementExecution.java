package Java21July2024;

public class OrderofIfstatementExecution
{
    public static void main(String[] args)
    {
        if (true)
        {
            if (true)
            {
                if (!true)
                {
                    System.out.println("Inner loop");
                }
                System.out.println("Middle loop");
            }
            System.out.println("Outer Loop");
        }
    }
}
