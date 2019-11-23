package Module5;

public class StringReverse {

    public static void main(String[] args) {

        String s="This is Java";
        System.out.println(s.length());
        String x=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            x=x+s.charAt(i);

        }
        System.out.println(x);

    }

}