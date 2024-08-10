
package Java27July2024;

public class Array11Min
{
    public static void main(String[] args)
    {
        int[] age={100,87,34,56,78,99,25};
        int min=age[0];
        for (int i = 0; i <age.length ; i++)
        {
           if (min>age[i])
           {
               min=age[i];
           }
        }
        System.out.println("Min Value is "+min);
    }
}