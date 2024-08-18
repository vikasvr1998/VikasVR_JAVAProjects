package Java10Aug2024.polymorphism;

public class poly2
{

    /*
     One or more methods with the same name but different arguments hence we call this has method
    overloading   */

    int add(int a , int b) // Same method name but different arguments
    {
        return a+b;
    }

    // Here Polymorphism says keep the method name same i have no problem !  But based on the arguments
    // that you provide I will decide which method to be implemented !!! i.e. for int types I will use 1st
    // method , for double type I will use 2 nd method like wise this continues .

    double add(double a , double b)
    {
        return a+b;
    }

    String add(String a, String b)
    {
        return a+b;
    }

}