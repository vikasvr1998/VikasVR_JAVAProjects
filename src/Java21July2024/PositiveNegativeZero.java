package Java21July2024;

import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        float f=sc.nextFloat();
        if (f==0)
        {
            System.out.println("Zero");
        }
        else if (f<0)
        {
            System.out.println("Negative");
        }
        else
            System.out.println("Positive");
    }
}