package Module5;

import java.util.Scanner;
public class ScannerPractice {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();
        System.out.println("entered number is "+n);
        System.out.println("Enter your name");
        String s= sc.next();
        System.out.println("Entered name is "+s);
        System.out.println("Enter your gender");
        char gender=sc.next().charAt(0);
        System.out.println("Entered gender is  "+gender);
        System.out.println(s);
    }


}

