package Java10Aug2024.Encapsulation;

public class SecuredProgram // 1 public class only
{
    public static void main(String[] args)
    {
         VwoLogin2 vw=new VwoLogin2("Vik123","!@#$%^TYnmj");
         // vw.password="WJH%^&^&&^&*&*";
        // System.out.println(vw.password);
    }
}
class VwoLogin2 // Just class
{
    private String userName; // Here we changed the data members to private now vw reference cannot access the password hence providing more security !!!
    private String password;

    public VwoLogin2(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }
}