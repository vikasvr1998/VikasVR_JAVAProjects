package Java10Aug2024.Encapsulation;

public class Encapsulation2
{
    public static void main(String[] args)
    {
        VwoLogin3 v = new VwoLogin3("admin", "123");
        System.out.println(v.getUserName());// Getter method is used to get the values of private data members
        v.setUserName("adminVikas");// Setter method is used to set the values of private data members
        System.out.println(v.getUserName());
        v.setPassword("@#$%^&**()!!!!!!!!!");
        System.out.println(v.getPassword());
    }
}
class VwoLogin3
{
    private String userName;
    private String password;

    public String getUserName() // This is what we call getter function which is public in nature
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setUserName(String userName)// This is what we call setter function where we can set the values of private data members
    {
        this.userName = userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public VwoLogin3(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}