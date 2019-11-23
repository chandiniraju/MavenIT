package Module6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("abc");
        a.add("xyz");
        a.add("mno");
        a.add("qwer");

        for (String i : a)

            System.out.println(i);


        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        Iterator m = al.iterator();
        while (m.hasNext()) {
            System.out.println(m.next());
        }

        averageSix();
         oddNumber();
         highestNumber();


    }
    public static void highestNumber()
    {

        ArrayList<Integer> m= new ArrayList<>();
        m.add(23);
        m.add(6);
        m.add(47);
        m.add(35);
        m.add(2);
        m.add(14);
       System.out.println("biggest number in arraylist is   " + Collections.max(m));


    }

    public static void oddNumber()
    {
        ArrayList<Integer> x= new ArrayList<>();
        x.add(3);
        x.add(2);
        x.add(4);
        x.add(5);
        for (int m:x)
        {
            if(m%2!=0)
                System.out.println(m);
        }



    }

    public static void averageSix()
    {
     ArrayList<Integer> m= new ArrayList<>();
     m.add(23);
     m.add(6);
     m.add(47);
     m.add(35);
     m.add(2);
     m.add(14);
     int total=0;
        for (int x:m)
              {
            total=total+x;

        }
        System.out.println(total);
        float avg=total/m.size();
        System.out.println(avg);
        System.out.println(m);


    }

}
