package Inheritance;

public class Thing3 extends Thing2 {
    public static void main(String[] args) {


        Thing3 tg3= new Thing3();
        tg3.property();
        tg3.property1();

        System.out.println(tg3.name);
        System.out.println(tg3.height);
        System.out.println(tg3.size);
        System.out.println(tg3.weight);
        tg3.property2();

    }

    public void property2()
    {
        System.out.println("This is multi level inheritance");
    }


}
