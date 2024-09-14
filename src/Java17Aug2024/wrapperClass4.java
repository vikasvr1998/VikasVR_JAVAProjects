package Java17Aug2024;

// Converting primitive data types to Wrapper Class
public class wrapperClass4
{
    public static void main(String[] args)
    {
        int a=10;
        Integer b=a;  // Conversion of a to wrapper type
        System.out.println(a);
        // Here a will not any other utilities
        // Further Extra utilities are added to b let us just look at it
        System.out.println(b.byteValue());
        System.out.println(b.getClass());
        System.out.println(b.shortValue());
        System.out.println(b.describeConstable());
        System.out.println(b.doubleValue());
        System.out.println(b.floatValue());
        System.out.println(b.longValue());
        // And Many More ...
    }
}