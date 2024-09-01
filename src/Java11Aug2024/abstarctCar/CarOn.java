package Java11Aug2024.abstarctCar;

// This is concrete class which is not an abstract class i.e. if the class don't have an abstract method
// then we tell that class as a concrete class

 class CarOn extends engine //CarOn is the complete class
{
 void drive()
 {
  engineOn();
  GearChange();
  roadStatus();
 }
// Now why this is overridden methods ???
// As the methods are incomplete methods present in engine , gear and condition class & hence
// we have to override it !


 @Override
 void engineOn()
 {
    System.out.println("Engine ON");
 }

 @Override
 void GearChange()
 {
  System.out.println(" 1 st Gear - Steep Hills , 5th Gear - Plane Highways");
 }

 @Override
 void roadStatus()
 {
   System.out.println("For Highways go for higher gears and for busy roads go for Lower Gears ");
 }
}