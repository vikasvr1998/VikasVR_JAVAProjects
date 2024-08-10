package Java28July2024;

public class Oops3BuildingBP
{  // Here we have created 2 objects and each objects has different behaviours
    public static void main(String[] args)
    {
          BuildingBP dlf=new BuildingBP();
          // BuildingBP      : Here we are using the Blueprint of BuildingBP
        //       dlf         : reference for obj 1
        //     prestige      : reference for obj 2
        // new BuildingBP(); : obj
          dlf.name="DLF Pvt Limited";
          dlf.colour="Red";
          dlf.address="Bangalore";
          dlf.noOfRooms=10;
          System.out.println(dlf.name);
          System.out.println(dlf.colour);
          System.out.println(dlf.address);
          System.out.println(dlf.noOfRooms);
          dlf.useLift();
          dlf.activities();
          System.out.println();

          BuildingBP prestige=new BuildingBP();
          prestige.name="Prestige";
          prestige.colour="Blue";
          prestige.address="Mumbai";
          prestige.noOfRooms=5;
          System.out.println(prestige.name);
          System.out.println(prestige.colour);
          System.out.println(prestige.address);
          System.out.println(prestige.noOfRooms);
          prestige.useLift();
          prestige.activities();
    }
}