package Java18Aug2024;

import java.util.Scanner;

public class exe10
{
    public static void main(String[] args) throws Exception
    {
        // Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter the String..");
        String s=null;
       // String s=sc.next();
        try
        {
            if(s==null)
            {
                throw new Exception("Hey Please enter the String man...");
            }
            s.trim();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}