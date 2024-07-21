package Java14July2024;

public class Implicit_Casting
{
    public static void main(String[] args)
    {
        /* Note : This concept is also called as Widening or Implicit Conversion, Here we increase the container size i.e.
        which just switches from lower container to larger container and the JVM does this automatically without any
        instructions */
        byte b=10;
        int i=(int)b;
        // Note : Here if you write int i = b; It is more than sufficient as JVM does it automatically
        System.out.println(i);
        /* Type Casting : When the source type is not as same as destination type , Hence We convert source type into
        the destination type */
    }
}