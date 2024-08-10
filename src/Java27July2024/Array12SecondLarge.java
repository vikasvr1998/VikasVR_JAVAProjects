package Java27July2024;

public class Array12SecondLarge
{
    public static void main(String[] args)
    {
       int[] age={2,4,5,89,79,100};
        for (int i = 0; i < age.length-1 ; i++)
        {
           for (int j=0; j<age.length-i-1; j++)
           {
                 if (age[j]<age[j+1])
                 {
                     int temp=age[j];
                     age[j]=age[j+1];
                     age[j+1]=temp;
                 }
           }
        }
        for (int i=0; i< age.length; i++)
        {
            System.out.println(age[i]);
        }
        System.out.println("2nd Highest age is "+age[1]);
    }
}