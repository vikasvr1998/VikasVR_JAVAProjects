package Java18Aug2024;

public class exe2ExceptionPassing
{
    public static void main(String[] args)
    {
        execution();
    }
    static void execution()
    {
        execution1();
    }
    static void execution1()
    {
        Integer[] i=new Integer[2];
        System.out.println(i[3]);
    }
}
/*  This is the clear-cut example for array index out of bound exception , but here the exceptions just
passes from one method to another method i.e. exceptions passes from execution1()-->execution()-->main()
 and gives us the idea where the error present in the code i.e. in this case error is present / vulnerable
 code lies in the Line 16 !!!!!!!!!!
 */