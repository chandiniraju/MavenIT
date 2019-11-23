package Module3;

import java.sql.SQLOutput;

public class PolyCalc {

   static  int m=25;

    public static void add(int a,int b)
    {
       int c=a+b;
        System.out.println(c);
    }

    public static void add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {

        PolyCalc pc=new PolyCalc();
        pc.add(20,30);
        pc.add(20,30,40);
        System.out.println(PolyCalc.m);

    }

}
