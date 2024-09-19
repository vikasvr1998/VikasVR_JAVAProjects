package Java18Aug2024.Collections;

import java.util.Vector;

public class VectorFunda
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add(1);
        v.add(3);
        v.add(7);
        System.out.println(v);
        /* Note :  This Vector works same like array list but the problem with Vectors are
        1. Thread safe / Synchronized - which results in slower performance due to line by line execution
        2. Older compared to Array List which is Un Synchronized  */
    }
}
