package Java04Aug2024.Relationships.hasA;

public class Car
{
    public void startCar()
    {
        new Engine().engine(); // This is what we call Aggregation or Has a relationship
        new Wheels().wheel();
    }
}