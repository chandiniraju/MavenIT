package Module5;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int x,y;
        AddTwoNumbers a=new AddTwoNumbers();
      x=  a.add(4,5);
        System.out.println(x);
        if(x>5)
            System.out.println("sum is greater than 5");
        else

            System.out.println("sum is less than 5");

    }
    public  int add(int a,int b)
    {
        int c=a+b;
        return c;
    }


}
