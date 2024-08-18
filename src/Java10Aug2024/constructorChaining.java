package Java10Aug2024;

public class constructorChaining
{
    public static void main(String[] args)
    {
        Son s=new Son();
    }
}
class GreatGrandFather
{
    public GreatGrandFather()
    {
        System.out.println("Great GrandFather Constructor ");
        System.out.println("|");
    }
}
class GrandFather extends GreatGrandFather
{
    public GrandFather()
    {
        System.out.println("GrandFather Constructor ");
        System.out.println("|");
    }
}
class Father extends GrandFather
{
    public Father()
    {
        System.out.println("Father Constructor");
        System.out.println("|");
    }
}
class Son extends Father
{
    public Son()
    {
        super();
        System.out.println("Sons Constructor");
    }
}