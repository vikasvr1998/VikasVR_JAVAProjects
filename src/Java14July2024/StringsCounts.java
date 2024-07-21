package Java14July2024;

public class StringsCounts
{
    public static void main(String[] args)
    {
      /*  String s="Hi";
        String s1="GM";
        String s2=s.concat(s1);
        System.out.println(s2); How many Strings are present ? Ans : Hi , GM , HiGM => 3    */

 /*     String s1="Vikas";
        String s2=s1;
        String s3=s2.toLowerCase();
        System.out.println(s3); How many Strings ? Ans : Vikas ,vikas => 2
*/
    /*     String s1="Hello";
        String s2=" Guys";
        String s3="Hello Guys";
        String s4=s1.concat(s2);
        System.out.println(s4); How many Strings ? Ans : Hello , Guys , Hello Guys , Hello Guys => 4
        Although s3 and s4 values look similar but still we are having 4 strings
     */
        String s="Vikas";
        String s1="Vikas";
        System.out.println(s);// How many Strings ? Ans : Vikas => 1 itself as s and s1 both having same value
        System.out.println(s1); // String Constant Pool tend to keep unique value
    }
}
