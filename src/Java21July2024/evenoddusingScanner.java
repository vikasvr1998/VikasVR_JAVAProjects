package Java21July2024;

import java.util.Scanner;//Importing the scanner from util package

public class evenoddusingScanner
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int s1=sc.nextInt();
        if (s1%2==0)
        {
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}