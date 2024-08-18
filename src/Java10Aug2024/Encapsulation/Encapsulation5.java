package Java10Aug2024.Encapsulation;

public class Encapsulation5
{
    public static void main(String[] args)
    {
        Encapsulation4icici e=new Encapsulation4icici("Vikas",200000);
        System.out.println(e.getAccountName());
        e.setBalance(20000,false);
        System.out.println(e.getBalance());
        e.setBalance(40000,true);
        System.out.println(e.getBalance());
    }
}