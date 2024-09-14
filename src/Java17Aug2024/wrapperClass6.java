package Java17Aug2024;

public class wrapperClass6
{
    public static void main(String[] args)
    {
          String num="100";
            //   int b=(int)num; Typecasting not Allowed
          Integer b=Integer.valueOf(num);
          System.out.println(b);// Converting String into Integer
           // Conversion back to primitive
          int a2=Integer.parseInt(num);
          // With the help of parseInt(getting the integer value from num) --> We convert num to Integer --> Then back to primitive data type (int)

        // In Automation when the case arises where we have to convert String to value , then we use wrapper class
    }
}