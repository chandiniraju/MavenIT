package Module5;

public class SwitchPractice {

    public static void main(String[] args) {

        operation("add");
        grade('A');
        operation("");
       // grade(''); //or grade();
    }
     public static void grade(char c)
     {
         switch(c)
         {
             case 'A':
                 System.out.println("First class");
                 break;
             case 'B':
                 System.out.println("Second class");
                 break;
             default :
                 System.out.println("Third class");
         }
     }



    public static void operation(String s)
{
    switch(s){

        case "add":
            System.out.println("Adding");
            break;

        case "sub":
            System.out.println("Subtracting");
            break;
        default:
            System.out.println("No operation");
    }
}

}




