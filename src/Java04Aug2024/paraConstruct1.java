package Java04Aug2024;

public class paraConstruct1
{
    public static void main(String[] args)
    {
       PersonDetails p=new PersonDetails();
       new PersonDetails();
       new PersonDetails(); // Overall 4 times the default constructor will be called
       new PersonDetails();
       PersonDetails p1=null;
    }
}