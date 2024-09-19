package Java18Aug2024.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List7
{
    public static void main(String[] args)
    {
        List a=new ArrayList();
        a.add("Vikas");
        a.add("Promo");
        a.add("Bunny");
        a.add("Kim");
        // Now we shall use iterator function
        /* Here what this will do is , See the elements are stored like Vikas , Promo , Bunny , Kim
         What this does is it will check the next element using hasNext() and if the next element is
         present , the current element is printed */
        Iterator<String> i=a.iterator(); // <String> has to be mentioned
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
