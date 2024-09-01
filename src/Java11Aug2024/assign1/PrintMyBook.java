package Java11Aug2024.assign1;

public class PrintMyBook extends Book
{
    String Name;
    String Author;
    float Price;

    public PrintMyBook(String name , String author , float price)
    {
        this.Name=name;
        this.Author=author;
        this.Price=price;
    }

    @Override
    void getDetails()
    {
        System.out.println(this.Name);
        System.out.println(this.Author);
        System.out.println(this.Price);
    }
}