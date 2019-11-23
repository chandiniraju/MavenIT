package Module2;

public class DefPara {

    public static void main(String[] args) {

        add();
        add(30, 30);
        callStri();

    }



    public static void add() {
        int x = 30, y = 40;
        int z = x + y;
        System.out.println(z);

    }

    public static void add(int m, int n) {

        int z = m + n;
        System.out.println(z);
    }

    public static void callStri()
    {
       String  str1="welcome  ";
       String  str2="to java";
        String str3=str1+str2;
        System.out.println(str3);
        System.out.println(str1.concat(str2));

    }
}