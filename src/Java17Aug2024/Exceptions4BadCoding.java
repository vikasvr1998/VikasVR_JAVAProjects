package Java17Aug2024;

public class Exceptions4BadCoding
{
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip = null; // ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No Arguments present!!!");
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println("String cannot be converted to number !!!!");
        }
        int b = 0; // ArithmeticException
        try {
            b = 1000 / a;
        } catch (ArithmeticException e) {
            System.out.println("Not possible to divide with zero!!!");
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}