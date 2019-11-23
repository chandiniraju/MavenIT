package Module5;

public class TescoBank extends LloydsBank {
    @Override
    public void withDraw() {
        System.out.println(" Tesco bank withdraw");

    }

    public static void main(String[] args) {
        TescoBank tb= new TescoBank();
        tb.withDraw();
        tb.depositMoney();
        tb.transferMoney();
        LloydsBank lb=new TescoBank(); //Creating abstract class reference
        lb.withDraw();
        lb.transferMoney();
        lb.depositMoney();
        Bank1 b= new TescoBank(); // creating bank1 interface reference
        b.depositMoney();
        b.transferMoney();
        b.withDraw();

    }

}

