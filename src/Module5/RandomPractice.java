package Module5;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {

        Random r= new Random();
        int n=r.nextInt();
        System.out.println(n);
        int x=r.nextInt(300);
        System.out.println(x);

        createRandom("abc","abc");
        createRandom("xyz","xyz");
    }

    public static void createRandom(String uName,String mailId)
    {
        Random r1=new Random();
        int num=r1.nextInt(20);
        String rvalues= uName+num+mailId+"@testmail.com";
        System.out.println(rvalues);

    }
}
