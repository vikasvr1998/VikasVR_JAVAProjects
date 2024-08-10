package Java28July2024;

/*  This is just class , No memories are consumed !!! , Whereas objects will take this blueprint and
 different objects will have different behaviours say different colour , name , noOfRooms , may or may not
 have Lifts */

public class BuildingBP
{
    //  These are Attributes of a BuildingBP class
    String name;
    String colour;
    String address;
    int noOfRooms;


 //  These are Behaviour of BuildingBP class
    void useLift()
    {
        System.out.println("Use Lift");
    }

    void activities()
    {
        System.out.println("Activities On");
    }
}