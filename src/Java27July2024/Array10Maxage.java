package Java27July2024;

public class Array10Maxage
{
    public static void main(String[] args)
    {
        int[] age={12,45,23,15,16,18,19,100};
        int max=1;
        for (int i=0; i<age.length; i++)
        {
            if (age[i]>max)
            {
                max=age[i];
            }
        }
        System.out.println("Max value in the array is "+max);
    }
}