package Java14July2024;

public class Variable_Size
{
    public static void main(String[] args)
    {
     /*   Note:             Operand 1            Operand 2            Result
                             byte                 byte                  int
                             char                 char                  int
                             short                byte                  int
                             int                  int                   int
                             int                  long                  long
                             byte                 double                double
                             char                 int                   int
                             float                long                  float  */
        byte a = 10 ;
        byte b = 25;
       /*
         byte c = a+b; Note : Here When you add up the values in byte variable , size is not sufficient to store
         the resultant variable , Hence container(Variable) has to be enlarged ! therefore by using int we can sort out
         the issue !
        */
        int c= a+b;
        System.out.println(c);
    }
}
