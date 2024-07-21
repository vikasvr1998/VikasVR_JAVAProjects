package Java14July2024;

public class Increment_Decrement
{
    public static void main(String[] args)
    {
        int a=10;
      /* Note : Pre increment  increments and get updated instantly
                Post increment increments in next line of the code and note same thing applies to decrement  */
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        int b=12;
        System.out.println(a + b++ + ++b + a++ + ++a + --a + a-- + b-- + --b); // ?
        // Note : a +   b++      +   ++b        +  a++       +   ++a      +    --a      +    a--     + b--        + --b
        //       12 + 12 (12->13)+ [13->14] 14  + 12(12->13) + [13->14]14 + [14->13]13 + 13(13->12) + 14(14->13) +[13->12] 12
        // Ans :  116  ()->Exclude the updated value , [] -> Include the updated value
    }
}
