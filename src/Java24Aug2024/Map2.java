package Java24Aug2024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map2
{
    public static void main(String[] args)
    {
        HashMap m=new HashMap();
        m.put("Vikas ",116); // Always represented with key value pair
        m.put("Anand",101);
        m.put("Aman",100);
        System.out.println(m);

        // If you want in order go for Linked Hash Map
        HashMap m1=new LinkedHashMap();
        m1.put("Vikas",116);
        m1.put("Anand",101);
        m1.put("Aman",100);
        System.out.println(m1);

        // If you want in sorting order go for tree Map
        Map m2=new TreeMap();
        m2.put("Vikas",116);
        m2.put("Anand",101);
        m2.put("Aman",100);
        System.out.println(m2);
    }
}