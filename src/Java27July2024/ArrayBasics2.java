package Java27July2024;

import java.util.Scanner;

public class ArrayBasics2
{
    public static void main(String[] args)
    {
        String[] names=new String[4];
        Scanner sc=new Scanner(System.in);
        names[0]=sc.next();
        names[1]=sc.next();
        names[2]=sc.next();
        names[3]=sc.next();
        System.out.println("Names are ");
        for (int i=0; i< names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}