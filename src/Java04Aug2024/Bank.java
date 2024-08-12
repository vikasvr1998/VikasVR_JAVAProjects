package Java04Aug2024;

public class Bank
{
  String bankName;
  int balance;
  String bankCode;
 // Default Constructor
  Bank()
  {
      bankName="SBI";
      balance=0;
      bankCode="SBI001";
      System.out.println("Bank Name : "+bankName);
      System.out.println("Bank Balance : "+balance);
      System.out.println("IFSC CODE : "+bankCode);
  }
 // Parameterized Constructor
  Bank(String isBankName , int isBalance , String isBankCode)
  {
       this.bankName=isBankName;
       this.balance=isBalance;
       this.bankCode=isBankCode;
       System.out.println("Bank Name : "+bankName+"\n"+"Bank Balance : "+balance+"\n"+"IFSC CODE : "+bankCode);
  }
}