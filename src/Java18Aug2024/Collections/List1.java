package Java18Aug2024.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List1  // List - Interface           ArrayList --> Class
{
    public static void main(String[] args)
    {
        // Array List(C) -- > Gets Everything from --> List(I) -- > Gets Everything from --> Collection(I)
        // Note : We cannot create object for Interface
        Collection myList1= new ArrayList();
        // GrandFather  reference(myList1)  with the child object
        List myList=new ArrayList();//This doesn't specify any size hence I can add any number of data's
        // Father reference(myList) with the child object : Dynamic Dispatch
        myList.add("David");
        myList.add("Vikas");
        myList.add("Sima");
        myList.add("Sanjay");
        myList.add(12345);// Heterogeneous we can add different data type unlike array who is restricted to same data type !!
        myList.add(true);// Heterogeneous
        System.out.println(myList);
        System.out.println(myList.size());//To print the Size
        System.out.println(myList1.contains("David"));//Checks the value present or not ???
        System.out.println(myList.contains("Vikas"));
        System.out.println(myList1.contains("Hema"));
        String s1=(String) myList.get(1);
        System.out.println(s1);
    }
}
// Collections Framework are all about using the inbuilt functions of these(above) so that you can focus on Logic !!!