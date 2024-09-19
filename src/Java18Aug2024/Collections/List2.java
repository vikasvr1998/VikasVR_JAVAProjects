package Java18Aug2024.Collections;

import java.util.ArrayList;
import java.util.List;

public class List2
{
    public static void main(String[] args)
    {
        int[] i=new int[3];
        i[0]=2;
        i[1]=4;
        i[2]=9;

        // Now to find whether 4 is present or not we will go with traditional approach first i.e.

        for (int j=0; j<i.length; j++)
        {
            if(i[j]==4)
            {
                System.out.println("true");
            }
        }

        // Instead of this shall we implement the collection logic ???
        List arr=new ArrayList();
        arr.add(3);
        arr.add(6);
        arr.add(9);
        System.out.println(arr.contains(6));
        
    }
}