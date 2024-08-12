package Java04Aug2024.AccessModifiers.Police;

public class Cop1
{
    private String pistolName;
    private int bulletNo;
    private boolean firing_order;

 /*  private Cop1(String pn,int bn , boolean fo)
    {
        this.pistolName=pn;
        this.bulletNo=bn;
        this.firing_order=fo;
    }
    private void onYourPosition()
    {
        System.out.println(pistolName);
        System.out.println(bulletNo);
        System.out.println(firing_order);
    }

    With the private access , only Cop1 are able to access the facilities , Junior Cop will be having no power
    at all to access the tool hence we shall make use of protected keyword so that Junior Cop can access but
    Thief is never able to access it !!!!!!!!!!!!!!


    */
    protected Cop1(String pn,int bn , boolean fo)
    {
     this.pistolName=pn;
     this.bulletNo=bn;
     this.firing_order=fo; // Now Junior Cop is very happy
    }
     protected void onYourPosition()
    {
        System.out.println(pistolName);
        System.out.println(bulletNo);
        System.out.println(firing_order);
    }
}