package Java21July2024;

import java.util.Scanner;

public class Continue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                continue; // continue is used to skip the flow based on the condition mentioned
            }// Whereas break is used to break the further flow
            else
                System.out.println(i);
        }
    }
}