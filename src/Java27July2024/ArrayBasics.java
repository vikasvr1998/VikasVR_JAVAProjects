package Java27July2024;

import java.util.Scanner;

public class ArrayBasics
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[4];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        System.out.println("Marks of the students as follows ");
        for (int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}