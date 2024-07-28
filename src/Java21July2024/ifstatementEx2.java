package Java21July2024;

public class ifstatementEx2
{
    public static void main(String[] args)
    {
        boolean a=true;
        a=!a;// Here  Just note how the value assigns
        //  ((a)<--------false)<------------ !a (true------->false)
        System.out.println(a);//false
        if(2+2<4) // This is nothing to do with the 'a' variable (Question to confuse you)
        {
            System.out.println("YO!");
        }
    }
}
