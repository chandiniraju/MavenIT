package Module6;

public class ExcepHandPrac {

    public static void main(String[] args) {

        int a=20,b=0;
        try {
            int c = a / b;
            System.out.println(c);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        int d=a-b;
        System.out.println(d);

       try {
           int x[] = {10, 20, 30, 40};
           x[5] = 70;
       }catch (Exception n)
       {
           System.out.println(n);
       }

      try {
          int s[] = {10, 20};
          s[3] = 40 / 0;
      }catch (ArithmeticException e)
      {
          System.out.println(e);
      }catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println(e);
      }

      finally {
          System.out.println("finally will be executed");
      }


    }



}
