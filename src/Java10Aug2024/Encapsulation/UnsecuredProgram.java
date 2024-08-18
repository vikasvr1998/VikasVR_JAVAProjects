package Java10Aug2024.Encapsulation;

public class UnsecuredProgram // Note : we can have only 1 public class
{
    public static void main(String[] args)
    {
        VwoLogin v=new VwoLogin("Vikas123","Vik@12345&*");
        v.username="Chi@12345";
        System.out.println(v.password);
        v.password="@%&^%$&^&*$^*&**(*(";// Here There is no security !!! Anyone can change the password!!!
        System.out.println(v.password);
    }
}
class VwoLogin // We can any number of classes i.e. We can have unlimited number of classes
{
   public  String username;
   public  String password;

   //Let's Create a Parameterized constructor now


    public VwoLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}