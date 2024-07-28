package Java21July2024;

public class nestedifEx2
{
    public static void main(String[] args)
    {
        if (!true)
        {
            System.out.println("3");
            if (true)
            {
                System.out.println("2");
                if (true)
                {
                    System.out.println("1");
                }
            }
        }
    }
}
