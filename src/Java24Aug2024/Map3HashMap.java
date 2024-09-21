package Java24Aug2024;

import java.util.HashMap;
import java.util.Map;

public class Map3HashMap
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> m=new HashMap();
        m.put("Vikas",111); // Key - String            Value - Integer
        m.put("Vivek",112);
        m.put("Anand",99);
        m.put(null,1); // Note : Only 1 null key is allowed whereas multiple null values are permitted
        m.put("Sara",100);
        m.put("Sam",112);  // Note : Values can be duplicate , But never Keys !!!
        System.out.println(m);
        System.out.println(m.containsKey("Sara"));
        System.out.println(m.containsValue(112));
        System.out.println(m.size());
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.get("Vivek"));
        System.out.println("---------------------------------");
        // How to print all the key value pair ?
        for (Map.Entry<String,Integer> item : m.entrySet())
        {
            System.out.println(item.getKey() +"--> "+ item.getValue());
        }
    }
}
