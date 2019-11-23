package Module1;

public class Access2 {

    private static String place="London";

    public static void main(String[] args) {


        Access2 ac2 = new Access2();
        Access1 ac1=new Access1();
        System.out.println(ac1.name);
        place1();
        ac1.add();


        System.out.println(ac1.name);
       // ac1.sub();  error we cant private function in another class

    }
    public static void place1()
    {

        System.out.println(place);
    }


}
