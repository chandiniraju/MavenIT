package Module2;

public class Result {

    public static void main(String[] args) {

        marks(67);
         grade(35);
    }

    public static void marks(int m)
    {

        if(m>36)
            System.out.println("Result is pass " );
        else
            System.out.println("Result is fail");
    }

    public static void grade(int m)
    {

        if(m>=90&&m<=100)
            System.out.println("Grade A" );
        else if(m>=70&&m<=89)
            System.out.println("Grade B ");
        else if(m>=37&&m<=69)
            System.out.println("Grade C");
        else if(m==36)

            System.out.println("Just pass");
        else
            System.out.println("Fail");
    }
}
