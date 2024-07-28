package Java21July2024;

import java.util.Scanner;

public class Switch3VowelsConsonents
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet...");
        char ch=sc.next().charAt(0);
     /*   switch (ch)  NOT A CLEAN CODE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        {
            case 'a' :
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case'o':
                System.out.println("Vowel");
                break;
            case'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent");
                break;
        }*/
        switch (ch) // CLEAN CODE !!!!!!
        {
            case 'a','e','i','o','u':
                System.out.println("Vowels");
                break;
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
                System.out.println("Consonants");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
