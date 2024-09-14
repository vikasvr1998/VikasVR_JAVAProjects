package Java17Aug2024;

public class Exceptions1
{
    /* An Exception is an event that occurs during the execution of a program that disrupts the normal
    flow of programs  */
    public static void main(String[] args)
    {
        String num=args[0];
        System.out.println(num);
        // Let us Convert this String into Integer how ? Wrapper Class
        // String -> Integer - > int
        int n=Integer.parseInt(num);
        // num(String)-------> Integer(Wrapper)---------> int (n)
        int b=100/n;
        System.out.println(b);
    }
}
/* Now do you think this piece of code is correct or error free ?????
  Absolutely NO !!!!!!!!!!!!
  What if
  Case 1 : user don't provide the arguments
  Case 2 : user provides arguments like Vikas
  Case 3 : user provides arguments like 0

  Case 1: We get Array Index out of Bound Exception
  Case 2: We get Number Format Exception
  Case 3: We get Arithmetic Exception

  We have this many exceptions with the above piece of code !!!! Then on what confidence will you release
  this code to end user ??????????????????????????????????

 */