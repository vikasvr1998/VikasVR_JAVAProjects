package Java04Aug2024.inheritance;

public class MainProgram
{
    public static void main(String[] args)
    {
       Son s=new Son();
       System.out.println("Sons Property");
       s.ThreeBhk(); // Here Son can access both his and Fathers class
       s.twoBhk();
       System.out.println();
       System.out.println("Fathers Property");
       Father f=new Father();
       f.twoBhk();
       //f.ThreeBhk(); ERROR !!!!!   Here father cannot access Sons class
    }
}