package Java10Aug2024;

public class OopsInAutomation
{
    public static void main(String[] args)
    {
        BaseClass b=new TestCase1(); // Dynamic Dispatch i.e. Father reference for Child object
        b.openBrowser();
        b.closeBrowser();
    }
}
class TestCase1 extends BaseClass // Single Level Inheritance
{
  TestCase1()
  {
      super(); // Access constructor from Parent class
      this.setBrowser("Chrome",true); // Encapsulation concept and this keyword concept
  }
}
class BaseClass
{
    public BaseClass() // Default Constructor
    {
        System.out.println("Base Class Constructor");
    }

    private String Browser; // Encapsulation Concept
    public String getBrowser()
    {
        return Browser;
    }
    public void setBrowser(String browser , boolean isAuth)
    {
        if (isAuth)
        {
            Browser = browser;
        }
        else
        {
            System.out.println("Access Denied");
        }
    }

    void openBrowser()   // Method Overloading
    {
        System.out.println("Open Browser");
    }
    void openBrowser(String bName) // Method Overloading
    {
        System.out.println("Open Browser"+bName);
    }
    void closeBrowser()
    {
        System.out.println("Close Browser");
    }
}