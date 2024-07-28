package Java21July2024;

import java.util.Scanner;

/* Task : Here you need to give the Grades for the marks obtained by the students . Grade Criteria for marks obtained
  100 - 90  : S - Outstanding
  89  - 80  : A - Excellent
  79  - 70  : B - Very Good
  69  - 60  : C - Good
  59  - 50  : D - Average
  49  - 40  : E - Pass
  39 -   0  : F - Fail
  */
public class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks of a Student in Numbers (Out of 100)");
        int n=sc.nextInt();
        if (n<=100 && n>=90)
        {
            System.out.println("S : Outstanding");
        }
        else if (n<90 && n>=80)
        {
            System.out.println("A : Excellent");
        }
        else if (n<80 && n>=70)
        {
            System.out.println("B : Very Good");
        }
        else if (n<70 && n>=60)
        {
            System.out.println("C : Good");
        }
        else if (n<60 && n>=50)
        {
            System.out.println("D : Average");
        }
        else if (n<50 && n>=40)
        {
            System.out.println("E : Pass");
        }
        else
            System.out.println("F : Fail");
    }
}