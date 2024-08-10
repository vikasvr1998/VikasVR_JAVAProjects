package Java27July2024;

import java.util.Scanner;

public class Array9Avg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 5 students");
        float[] marks=new float[5];
        marks[0]=sc.nextFloat();
        marks[1]=sc.nextFloat();
        marks[2]=sc.nextFloat();
        marks[3]=sc.nextFloat();
        marks[4]=sc.nextFloat();
        float sum=0f;
        for (int i=0; i< marks.length; i++)
        {
            sum=sum+marks[i];
        }
        System.out.println("Average : "+sum/5);
    }
}