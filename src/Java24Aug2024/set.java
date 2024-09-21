package Java24Aug2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set
{
    public static void main(String[] args)
    {
        // Set doesn't allow the duplicates unlike the List !!!
        Set s=new HashSet();
        s.add("Apple");
        s.add("Orange");
        s.add("Banana");
        s.add("WaterMelon");
        s.add(null); // No issues for Hash Set
        System.out.println();
        System.out.println("With Hash Set ");
        System.out.println(s);

        //Suppose if you want this in order then go for Linked Hash Set
        Set s1=new LinkedHashSet();
        s1.add("Apple");
        s1.add("Orange");
        s1.add("Banana");
        s1.add("WaterMelon"); // Note Set doesn't allow duplicates
        s1.add("WaterMelon");
        s1.add(null);//No issues for LinkedHashSet
        System.out.println();
        System.out.println("With Linked Hashset ");
        System.out.println(s1);

        //Suppose if you want to sort the data go for Tree Set

        Set s2=new TreeSet();
        s2.add("Apple");
        s2.add("Orange");
        s2.add("Banana");
        s2.add("WaterMelon");
       // s2.add(null); Cannot be used for Tree Set as it creates problem while sorting
        System.out.println();
        System.out.println("With Tree Set");
        System.out.println(s2);

    }
}
