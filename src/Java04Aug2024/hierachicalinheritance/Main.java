package Java04Aug2024.hierachicalinheritance;

public class Main
{
    public static void main(String[] args)
    {
        Ramesh r=new Ramesh();
        Suresh s=new Suresh();
        Vignesh v=new Vignesh();
        r.home(); // All sons can access Father class : Hierarchical Inheritance
        r.home1();
        s.home(); // All sons can access Father class : Hierarchical Inheritance
        s.home2();
        v.home(); // All sons can access Father class : Hierarchical Inheritance
        v.home3();
    }
}