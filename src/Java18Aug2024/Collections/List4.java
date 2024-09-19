package Java18Aug2024.Collections;

import java.util.ArrayList;
import java.util.List;

public class List4
{
    public static void main(String[] args)
    {
        List a=new ArrayList();
        a.add("Vikas");
        a.add("Aman");
        a.add("Amit");
        a.add("Tim");
        a.add("lol");
        System.out.println(a);
        System.out.println(a.size());
        a.remove(1);
        a.set(1, "AmitT");
        System.out.println(a);
        System.out.println(a.size());
       // a.clear();
        System.out.println(a);
        for(Object o : a ) // The reason why we use Object is as the for array list , it is of Heterogeneous datatype
        {                 // Hence we will use Object class which is the most superior type
            System.out.println(o); // Advance for loop
        }
    }
}
