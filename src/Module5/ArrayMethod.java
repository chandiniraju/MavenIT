package Module5;

public class ArrayMethod {

    public static void main(String[] args) {
        int[] x= get();
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }



    public static int[] get()
 {

     return new int[]{10,20,30};
 }

}


