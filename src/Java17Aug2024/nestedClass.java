package Java17Aug2024;

public class nestedClass
{
}
    class Outer
    {
        Integer a=10;
        class Inner
        {
            void m2()
            {
                System.out.println(a); // See the inner class can have access on outer class data but vice versa is not possible
            }
        }
    }