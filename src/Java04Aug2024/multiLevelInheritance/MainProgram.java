package Java04Aug2024.multiLevelInheritance;

public class MainProgram
{
    public static void main(String[] args)
    {
        // Multi Level
        // GF -> F -> Child
        Son c1 = new Son();
        c1.home(); // If name is same C -> F -> GF
        c1.c();
        c1.homefather(); // Here we are accessing the GrandFather and Father class with the help of Child class reference
        c1.extra();
        c1.f();
        c1.homeGrandfather();
        c1.gf();
    }
}