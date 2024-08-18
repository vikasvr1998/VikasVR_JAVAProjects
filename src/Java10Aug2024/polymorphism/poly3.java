package Java10Aug2024.polymorphism;

public class poly3
{
    public static void main(String[] args)
    {
        poly2 p=new poly2();
        int res=p.add(2,4); //We are storing the result value inside one variable called res and its data type is int
        System.out.println(res);
        double res1=p.add(3.9,5);
        System.out.println(res1);
        String res3=p.add("Vikas", "VR");
        System.out.println(res3);
        // Now Why this is Compile time polymorphism ?
        // p.add("Vikas",2.0);
        // Here we have not added corresponding method for the above arguments Hence compiler before running
        // the program itself will throw an error hence the name Compile time polymorphism !!!
    }
}