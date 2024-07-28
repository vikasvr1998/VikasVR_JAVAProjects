package Java21July2024;

public class Switch4
{
    public static void main(String[] args)
    {
        int itemCode=003;
        switch (itemCode)
        {
                case 001,002,003:
                System.out.println("Electronic item");
                break;
                case 004,005:
                System.out.println("Mechanical item");
                break;
                default:
                    System.out.println("Invalid");
                    break;
        }
    }
}
