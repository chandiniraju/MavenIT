package Module3;

public class Construct {

    String name;
    int age;

    public Construct()
    {
        System.out.println("This is default constructor");
    }

    public Construct(int x,int y)
    {
        int h= x+y;
        System.out.println("Parameterised constructor");
        System.out.println(h);

    }

    public Construct(String n,int a)

    {
        name=n;
        age=a;
        System.out.println(name+ "  " + age);


    }

    public static void main(String[] args) {


        Construct c= new Construct();
         Construct v= new Construct(10,20);
         Construct m=new Construct("leks", 8);


    }




}
