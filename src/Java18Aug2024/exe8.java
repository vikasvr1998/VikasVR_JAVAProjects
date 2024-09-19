package Java18Aug2024;

import java.util.Scanner;

public class exe8
{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String s=sc.next();
        if(s.equalsIgnoreCase("vikas"))
        {
            try {
                throw new Exception("VIP Treatment"); // Custom Exceptions
            }
            catch (Exception e)
            {
                System.out.println("Exceptions");
            }
        }
        else
            System.out.println("Allowed");
    }
}