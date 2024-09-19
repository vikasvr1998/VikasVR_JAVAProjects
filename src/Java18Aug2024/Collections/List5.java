package Java18Aug2024.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List5
{
    public static void main(String[] args)
    {
        List m=new ArrayList();
        m.add(100);
        m.add(23);
        m.add(67);
        m.add(38);
        m.add(97); // Collections --> Class
        System.out.println(m);// Before sorting
        Collections.sort(m);//This will help to sort out the marks
        System.out.println(m);// After Sorting
    }
}
