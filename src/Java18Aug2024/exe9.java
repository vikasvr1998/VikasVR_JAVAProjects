package Java18Aug2024;

import java.util.Scanner;

public class exe9
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        try
        {
            if(n==0)
            {
                throw new Exception("Please Enter Non Zero Number");
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException("Number is not divisible by Zero");
        }
        int b=100/n;
        System.out.println(b);
    }
}