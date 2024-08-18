package Java10Aug2024.Encapsulation;

public class Encapsulation3
{
    // We will make password section more secured with the same program
    public static void main(String[] args)
    {
        VwoLogin4 v=new VwoLogin4("admin","123");
        v.setPassword("123$%^Tc",true);
        System.out.println(v.getPassword());
        v.setPassword("1234",false);
        System.out.println(v.getPassword()); //  Unable to set password as we made admin as false hence it will return previous password itself !!!
    }
}
class VwoLogin4
{
    private String username; // These data members are controlled by getter setter methods
    private String password;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password,boolean admin)
    {
        if (admin)
        {
            this.password = password;
        }
        else
        {
            System.out.println("Sorry Unable to set Password !!!");
        }
    }

    public VwoLogin4(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}