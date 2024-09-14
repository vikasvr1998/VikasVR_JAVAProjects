package Java17Aug2024;

public class wrapperClass5
{
    public static void main(String[] args)
    {
        // Let us convert Wrapper type to primitive type
        Integer b=10; // Wrapper Class Also we call this as AutoBoxing
        int a=b; // Primitive Also we call this as Unboxing
        System.out.println(b.shortValue());
        System.out.println(b.longValue());
        // Many more we have for b
        // Now let us try with a
        System.out.println(a); // Nothing else except a !!!
    }
}