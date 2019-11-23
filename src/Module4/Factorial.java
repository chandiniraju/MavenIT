package Module4;

public class Factorial {

    public static void main(String[] args) {

        fact(10);
        sum(50);
        even(100);
       odd(100);
       five(100);
       prime(100);

    }

    public static void prime(int n)
    {
        for(int i=1;i<=n;i++)
        if(i%1==0 && i%i==0)
            System.out.print(i);
        System.out.print(" ");
    }


    public static void fact(int n) {
        int i, factorial = 1;
        for (i = 1; i <= n; i++) {
            factorial = factorial * i;

        }

        System.out.println(factorial);

    }

   public static void five(int n)
   {
       for(int i=1;i<=n;i++) {
           if (n % 5 == 0)

               System.out.print("numbers divisible by 5 are " + i);
                System.out.print(" ");
       }

   }

    public static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of  " + n + "   numbers is " + sum);

    }

    public static void even(int n) {
        int i;
        for (i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
                System.out.print(i);
            System.out.print(" ");


        }
    }

    public static void odd(int n)
    {
        int i;
        for (i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
                System.out.print(i);
            System.out.print(" ");

        }
    }
}
