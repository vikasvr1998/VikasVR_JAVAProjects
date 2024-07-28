package Java21July2024;

import java.util.Scanner;

/* Basic Leap Year Logic :
* If the year is exactly divisible by 4 , provided they are not Centurial years (That are divisible by 100)
is a leap year .
For Centurial years , year should be exactly divisible by 400 .
*/
public class LeapYear
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if (year%100==0) // Condition for Centurial Years
        {
            if (year%400==0)
            {
                System.out.println("LEAP YEAR");
            }
            else
                System.out.println("NOT A LEAP YEAR");
        }
        else if (year%4==0)
        {
            System.out.println("LEAP YEAR");
        }
        else
            System.out.println("NOT A LEAP YEAR");
    }
}