package Java10Aug2024.Encapsulation;

public class Encapsulation4icici
{
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String accountName;
    private long balance;

    public Encapsulation4icici(String accountName, long balance)
    {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance ,boolean isAdmin)
    {
        if (isAdmin==false)
        {
            System.out.println("Access Denied");
          //  this.balance = balance;
        }
        else
        {
            this.balance = balance;
        }
    }
}