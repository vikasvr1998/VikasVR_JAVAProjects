package Java18Aug2024;

public class exe6Bank
{

    private String currency;
    private Integer amt;

    public exe6Bank(String currency, Integer amt)
    {
        this.currency = currency;
        this.amt = amt;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public Integer getAmt()
    {
        return amt;
    }

    public void setAmt(Integer amt)
    {
        this.amt = amt;
    }

    public Integer add(exe6Bank bankName) throws Exception
    {
        if(!bankName.currency.equalsIgnoreCase("INR"))
        {
            try
            {
                throw new Exception("Currency is not matching");
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        Integer sum=this.amt + bankName.amt;
        return sum;
    }
}