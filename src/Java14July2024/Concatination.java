package Java14July2024;

public class Concatination
{
    public static void main(String[] args)
    {
        String s1="vikas";
        String s2="VR";
        int a=12;
        long l=22;
        System.out.println(s1+s2+a+l);//Here just concatenation will happen
        System.out.println(s1+s2+(a+l));
        /* Note : In 2nd case BODMAS rule is going to get applied  hence 12+22 is going to get computed first
        Whenever you use a + operator with String it will always be concatination but as soon as you include the
        brackets then only it becomes integers  */
    }
}