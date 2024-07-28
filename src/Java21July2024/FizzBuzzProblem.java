package Java21July2024;
/* Here print the values from 1 to 100 and
    For Multiples of 3 --> Print FIZZ
    For Multiples of 5 --> Print BUZZ
    For Multiples of 3 & 5 --> Print FIZZBUZZ
  */
public class FizzBuzzProblem
{
    public static void main(String[] args)
    {
        for (int i=1; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FIZZBUZZ");
            }
            else if (i%3==0)
            {
                System.out.println("FIZZ");
            }
            else if (i%5==0)
            {
                System.out.println("BUZZ");
            }
            else
                System.out.println(i);
        }
    }
}