package Java28July2024;

public class Oops5BankClass // Here we have created 3 objects and each objects has different behaviours
{
    public static void main(String[] args)
    {
        BankClass b1=new BankClass();
        b1.name="ICICI";
        b1.branch="Bangalore";
        System.out.println(b1.name);
        System.out.println(b1.branch);
        b1.OnlineTransaction();
        b1.giveLoan();
        System.out.println();

        BankClass b2=new BankClass();
        b2.name="SBI";
        b2.branch="Bangalore";
        System.out.println(b2.name);
        System.out.println(b2.branch);
        b2.NoOnlineTransaction();
        b2.giveLoan2();
        System.out.println();

        BankClass b3=new BankClass();
        b3.name="HDFC";
        b3.branch="Mumbai";
        System.out.println(b3.name);
        System.out.println(b3.branch);
        b3.OnlineTransaction();
        b3.giveLoan();
    }
}