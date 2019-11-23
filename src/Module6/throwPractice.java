package Module6;

public class throwPractice {
    public static void main(String[] args) {
        throwPractice m= new throwPractice();
        m.p();
        System.out.println("exception handled");
    }

    public void p()
    {try {
        n();
    }catch(Exception e){
        System.out.println(e);
    }
    }

    void n()
    {

            int t = 4, s = 0;

            int d = t / s;

    }
    


}
