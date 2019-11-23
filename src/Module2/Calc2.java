package Module2;

public class Calc2 extends Calc1{

    public static void main(String[] args) {

        Calc2 c2=new Calc2();
        c2.add(20,10);
        c2.sub(30,10);

        mul(30,40);
        div(50,10);

    }

    public static void mul(int m,int n)
    {
        int d=m*n;
        System.out.println(d);
    }
    public static void  div(int m,int n)
    {
       int h= m/n;
        System.out.println(h);
    }
}
