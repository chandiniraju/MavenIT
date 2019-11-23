package Inheritance;

public class Thing2 extends Thing {

    int weight=30;
    public static void main(String[] args) {


        String name="chair";
        Thing2 th= new Thing2();
        System.out.println(th.size);
        System.out.println(th.height);
        th.property();
        th.property1();

        System.out.println(th.weight);
        System.out.println(name);
    }

    public void property1()
    {
        System.out.println("Accessed from child class");
    }

}
