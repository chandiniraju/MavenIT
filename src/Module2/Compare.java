package Module2;

public class Compare {

    public static void main(String[] args) {


        twoNumbers(6,7);

        bigThreeNumbers(3,4,5);
        smallThreeNumbers(10,7,5);

    }
    public static void twoNumbers(int x,int y)
    {
        if(x>y)
            System.out.println("greatest is  "  +x);
        else
            System.out.println("greatest is  "  +y);
    }

    public static void bigThreeNumbers(int x,int y,int z)
    {

        if((x>y)&&(x>z))
        {
            System.out.println("x is bigger" +x);

        }
           else if(y>z)
        {
            System.out.println("y is bigger  "+y);

        }
           else
            System.out.println("z is bigger  "+z);

    }

    public static void smallThreeNumbers(int x,int y,int z)
    {
        if((x<y)&&(x<z))
        {
            System.out.println("x is smaller  "+x);

        }
        else if(y<z)
        {
            System.out.println("y is smaller "+y);

        }
        else
            System.out.println("z is smaller  "+z);


    }

}
