package Java04Aug2024;

import java.util.Scanner;

public class paraConstruct3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Have a Bank Account ? True / False ");
        boolean b=sc.nextBoolean();
        if (b)
        {
            System.out.println("Enter Bank Name");
            String isBankName = sc.next();
            System.out.println("Enter Balance");
            int isBalance = sc.nextInt();
            System.out.println("Enter Bank Code");
            String isBankCode = sc.next();
            Bank b1=new Bank(isBankName , isBalance , isBankCode);
        }
        else
        {
            Bank b2=new Bank();
        }
    }
}