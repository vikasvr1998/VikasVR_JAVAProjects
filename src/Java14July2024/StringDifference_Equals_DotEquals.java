package Java14July2024;

public class StringDifference_Equals_DotEquals
{
    public static void main(String[] args)
    {
        String s1="Hi";
        String s2="Hi";
        String n1=new String("Hi");
        String n2=new String("Hi");
        System.out.println(s1==s2);
        System.out.println(s1.equals(n1));
        System.out.println(s1==n1);
        /*
         Note : There is a difference b/w == and .equals  Here == compares the reference
          .equals compares the content Hence in the 3rd output we got it as false as it compared the references
         of s1 and n1 which are unique .
          Also, Here 'new' keyword creates the new memory in the Heap Area present in JVM
        */
    }
}
