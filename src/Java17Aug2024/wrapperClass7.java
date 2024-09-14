package Java17Aug2024;

public class wrapperClass7
{
    public static void main(String[] args)
    {
        Double d=3.14;
        double val=d.doubleValue();
        // Any Difference ??? b/w both ???
        // Value wise both are same , but d has more utilities than val as it is wrapper class
        /*
              ______________________________________
             |    (d)                 Class Loader |          C - Continues
             |  Heap Area          (val)           |
             |            C.Memory(primitive types)|
             |_____________________________________|
         */
    }
}
