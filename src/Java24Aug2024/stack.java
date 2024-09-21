package Java24Aug2024;

import java.util.Stack;
// This is a bit old hence rarely we will be using for our projects
public class stack
{
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push("Vikas");
        s.push("Aman");
        s.push("Amit");
        s.push("John");
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);

        /*    Working Principle of Stack
                                         __________
      ---->                             |___ 1_____| John (Peek/Last Element added)  ------> Pop (Removing an element)
      Push                              |___ 2_____| Amit
      (Adding an element)               |____3_____| Aman
                                        |___ 4_____| Vikas (Bottom/First element added)

           Always element will be removed from peak for stack


        */
    }
}
