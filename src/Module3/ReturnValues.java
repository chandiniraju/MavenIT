package Module3;

public class ReturnValues {

    public boolean  age(int a)
    {
        boolean status;

        if(a>18) {

            System.out.println("Eligible to vote");
            status=true;
        }

        else
        {
            System.out.println("Not eligible to vote");
            status=false;
        }

        return status;
    }

    public String text(String c)
    {
        System.out.println(c);
        return c;

    }

    public static void main(String[] args) {

        ReturnValues rv=new ReturnValues();
        boolean  eligibility= rv.age(45);
        System.out.println(eligibility);
         String v  =rv.text("This is example of returning values");
         System.out.println("value returned  " +v);

    }



}
