package Java22July2024;

public class forLoop5
{
    public static void main(String[] args)
    {
        for (char ch='A'; ch<'Z'; ch++)
        {
            int i=(int)ch; // TypeCasting
            System.out.println(i);
        }
    }// Output : Prints A to Z if Typecasting is not done
}   // Output : Prints ASCII Values i.e 65 to 89 if Typecasting is done