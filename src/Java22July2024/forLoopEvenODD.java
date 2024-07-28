package Java22July2024;

import java.util.Scanner;

public class forLoopEvenODD//Here We are separating the even and odd numbers from the given range
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        int n=sc.nextInt();
        System.out.println();
        System.out.println("Even Numbers");
        for (int i=1; i<=n; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Odd Numbers");
        for (int i=1; i<=n; i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}