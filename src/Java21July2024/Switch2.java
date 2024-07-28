package Java21July2024;

import java.util.Scanner;

public class Switch2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Browser name where you want to run the test ...");
        String browser_name=sc.next();// .next() is used to represent the String input
        browser_name=browser_name.toLowerCase();
        switch (browser_name)
        {
            case "googlechrome":
                System.out.println("Starting the Chrome Browser");
                break;
            case "firefox":
                System.out.println("Starting the Firefox Browser");
                break;
            case "edge":
                System.out.println("Starting the Edge Browser");
                break;
            default:
                System.out.println("Sorry Man ...");
                break;
        }
    }
}
