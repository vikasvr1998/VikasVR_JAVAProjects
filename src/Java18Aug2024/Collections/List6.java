package Java18Aug2024.Collections;

import java.util.ArrayList;
import java.util.List;

public class List6
{
    public static void main(String[] args)
    {
        List<Integer> a=new ArrayList();
          a.add(100);
          a.add(200);
      //  a.add("Vikas ") This will throw an error as it is restricted to only Integer , also we can't use int in the place of Integer
        List<Boolean> b=new ArrayList();
        b.add(true);
        b.add(false);
       // b.add(12); Now this turns to be invalid
    }
}
