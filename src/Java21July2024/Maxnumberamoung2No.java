package Java21July2024;

import java.util.Scanner;

public class Maxnumberamoung2No
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();
        if (n1>=n2)
        {
            if(n1==n2)
            {
            System.out.println("Both are equal");
            }
            else
                System.out.println(n1+" is Greater");
        }
        else
        {
            System.out.println(n2+" is Greater");
        }
    }
}