package Java24Aug2024;

import java.util.LinkedList;

public class LinkedListBasic
{
    public static void main(String[] args)
    {
        /*
         The difference between the array List and Linked List is arrayList will be storing the data in the
         continuous memory fashion i.e. | | | | | | | | ......

         Whereas in case of Linked List suppose if you want to approach D say
              Node 1 A -------------------------> Node 2 B --------------> Node 3 C ----->    Node 4 D
         First approach A , it will know B     Then B , B knows C       Then C , C knows D    Thus you reach D

        This is not stored as Continuous Memory like Arrays !!!!!!

        This is How linked List works ...

        Here removing elements in Linked List is easy compared to Array List (Because Arrays are stored like continuous memory )

        */
        LinkedList l=new LinkedList();
        l.add("Vikas");
        l.add("Promo");
        l.add("Sneha");
        System.out.println(l);

    }
}