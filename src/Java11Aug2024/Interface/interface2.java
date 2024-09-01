package Java11Aug2024.Interface;

public class interface2 implements interface1
{

    // For class to take the methods from interface , we have to use implements keyword
    //   class --- > Interface  -- implements
    //   class ----> class      -- extends

   // Also we cannot create an object for interface (same like abstract class)
    // interface1 i=new interface1();  ----> Not possible X X X

    @Override
    public void engine()
    {
        // These are the methods that we need to complete
    }

    @Override
    public void gear()
    {
        // These are the methods that we need to complete
    }
}