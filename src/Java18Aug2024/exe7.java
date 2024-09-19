package Java18Aug2024;

public class exe7
{
    public static void main(String[] args) throws Exception
    {
        exe6Bank sbi=new exe6Bank("INR",100);
        exe6Bank icici=new exe6Bank("INR",200);
        Integer total=sbi.add(icici);
        System.out.println(total);

        exe6Bank dutchBank=new exe6Bank("USD",400);// Vulnerable code
        Integer totalNew= sbi.add(dutchBank);
        System.out.println(totalNew);// Here we cant add $ with Rupee !! Hence, exception is thrown
    }
}