package Java04Aug2024;

public class PersonDetails
{
    String name;
    long phone;

    PersonDetails()
    {
        System.out.println("Object Created");
    }

    PersonDetails(String isName)
    {
        this.name=isName; // value present in isName container will be assigned to name container with the help of this keyword
        System.out.println(name);
    }

    PersonDetails(String isName, long isPhone)
    {
        this.name=isName;
        this.phone=isPhone;
        System.out.println(name+"\n"+ phone);
    }
}