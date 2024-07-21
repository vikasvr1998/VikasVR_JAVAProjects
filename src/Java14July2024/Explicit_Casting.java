package Java14July2024;

public class Explicit_Casting
{
    public static void main(String[] args)
    {
        /*  This is Narrowing i.e. Here we are shrinking the container size from larger to smaller , We are doing this
        forcefully and in this case there is high chance of data loss , We will demonstrate with an example */
        int a=150;
        byte b=(byte)a;
        System.out.println(b);
        /* Note : Binary Value of 150 is 0000000010010110
        Capacity of int is 32bits | | | | | | | | | | | | | | | |0|0|0|0|0|0|0|0|1|0|0|1|0|1|1|0|
        Capacity of byte is 8bits | | | | | | | | |
        Now Since byte variable can hold up to only 8 bits hence it will hold only last 8 values i.e
        |1|0|0|1|0|1|1|0|
        Now this we convert the above binary into decimal i.e. Decimal value for the above binary value is -106
        Hence -106 is printed at output , The Remaining / extra binary digits are overflowed into garbage collector
        */
    }
}