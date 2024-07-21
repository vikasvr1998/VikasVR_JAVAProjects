package Java14July2024;

public class StringMethods
{
    public static void main(String[] args)
    {
        String s1="Vikas";
        String s2="Aman";
        String s3="vikas";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.substring(0,2));//start at index 0 end within 2(But don't include its value)
        System.out.println(s1.indexOf('i'));
        System.out.println(s1.length());
    }
}
