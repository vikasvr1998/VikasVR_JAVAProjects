package Java28July2024;

public class Oops2BuildingBp
{
    public static void main(String[] args)
    {
        /* Note : Objects are the ones that consumes the memory
         Suppose If I take Construction has a class then
                            Construction (Class) (Just a Blueprint)
                  ______________________|___________________________________
                |                       |                                   |
            DLF                     Prestige                            Brigade
          (Object 1)                (Object 2)                         (Object 3)
       */
        Oops2BuildingBp dlf=new Oops2BuildingBp();
        // Oops2BuildingBp        : Class Name whose blueprint you are using
        //       dlf              : Reference Variable
        // new Oops2BuildingBp(); : Object
        // With the help of new keyword there is a memory created inside the heap area
        // All Objects will be having different Attributes and Behaviour
    }
}