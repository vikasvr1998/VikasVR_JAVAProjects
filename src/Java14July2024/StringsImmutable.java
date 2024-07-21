package Java14July2024;

public class StringsImmutable
{
    public static void main(String[] args)
    {
       /* Note : We can store Strings in 2 ways either by normal = operator or by 'new' keyword
       Strings are immutable meaning cannot be changed suppose */
        String s1="Vikas";
        String s2="VR";
        System.out.println(s1);
        s1 ="Amit";
        System.out.println(s1);
       /*
         Note : Earlier s1 was pointing at Vikas which was present in String Constant Pool (Present in JVM) , Now
         We have assigned Amit for s1 , But Vikas will still be present inside Sting Constant Pool
        */
    }
}