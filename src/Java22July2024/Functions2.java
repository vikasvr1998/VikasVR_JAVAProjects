package Java22July2024;

public class Functions2
{
    public static void main(String[] args) // Main Method is the best Example for Type 3
    {
        /* In Functions, we have 4 Types
         1. Without Arguments Without Return Type
         2. Without Arguments With Return Type
         3. With Arguments Without Return Type
         4. With Arguments With Return Type
         */
        function_type3("HI GOOD EVENING"); // Calling Function Type 3
        System.out.println(function_type2());// Calling the Function Type 2
        //function_type4(2,6); Calling the Function Type 4
        // Here We are not going to get the sum , As you have not stored its resultant value Hence
        System.out.println("________________________________________________________________________");
        System.out.println(function_type4(2,6));
    }

    static void function_type1()
    {
        System.out.println("Without Arguments Without Return Type");
    }

    static String function_type2()
    {
        System.out.println("Without Arguments With Return Type");
        return "VikasVR";
    }

    static void function_type3(String name)
    {
        System.out.println("With Arguments Without Return Type");
        System.out.println("__________________________________________________________________");
    }

    static int function_type4(int a , int b)
    {
        System.out.println("With Arguments With Return Type");
        return a+b;
    }
}