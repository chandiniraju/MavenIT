package Module5;

public class StrPractice {

    public static void main(String[] args) {


        String str1 = "This ia java";
        String str2 = "This is testing";
        char res = str1.charAt(8);
        System.out.println("character at  "+res);
        String str3=str1+" " +str2;
        System.out.println(str3);
        String str4=str3.concat("  concating");
        System.out.println(str4);
        strLCase();
        strUCase(new String("this is java"));
        strUCase("this is testing");
        strCharReplace("dddddddd");
        strLen("This is london");
        strCompare("this is london","THIS IS LONDON");
        getSubString("learning automation");
        strSubString("This is Java","has");
        strSubString("This is Java","is");
        strEndsSubString("This is Java","Java");
        strEndsSubString("This is Java","is");

    }

    public static void strEndsSubString(String s1,String s2)
    {
        if(s1.endsWith(s2))
        {
            System.out.println("s2 ends with s1");
        }else
            System.out.println("s2 does not ends with s1");
    }




    public static void strSubString(String s1,String s2)
    {
        if(s1.contains(s2))
        {
            System.out.println("s2 is substring of s1");
        }else
            System.out.println("s2 is not substring of s1");
    }


    public static void getSubString(String s1){

        System.out.println(s1.substring(3,7));

    }



    public static void strCompare(String s1,String s2)
    {
        boolean b= s1.equals(s2);
        System.out.println(b);
        boolean b1=s1.equalsIgnoreCase(s2);
        System.out.println(b1);
    }



    public static void strLen(String s){
        System.out.println("length of string is  " +s.length());
    }

    public static void strCharReplace(String str){

        System.out.println(str.replace('d','f'));
    }



    public static void strUCase(String str)
    {
        System.out.println(str.toUpperCase());
    }




    public static void strLCase()
    {
        String str= new String("THIS IS JAVA");
        String str1="THIS IS TESTING";
        System.out.println(str1.toLowerCase());
        System.out.println(str.toLowerCase());


    }
}