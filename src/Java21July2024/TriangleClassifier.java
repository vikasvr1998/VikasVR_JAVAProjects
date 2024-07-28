package Java21July2024;

import java.util.Scanner;

public class TriangleClassifier
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s1");
        int s1=sc.nextInt();
        System.out.println("Enter s2");
        int s2=sc.nextInt();
        System.out.println("Enter s3");
        int s3=sc.nextInt();
        if (s1==s2 && s1==s3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (s1==s2 || s1==s3 || s2==s3)
        {
            System.out.println("Isosceles Triangle");
        }
        else
            System.out.println("Scalene");
    }
}