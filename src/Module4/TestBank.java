package Module4;

public class TestBank {
    public static void main(String[] args) {


        BarclaysBank bb = new BarclaysBank();
        TescoBank tb = new TescoBank();
        LloydsBank lb = new LloydsBank();
        bb.withDraw();
        bb.depositMoney();
        bb.transferMoney();
        tb.withDraw();
        tb.transferMoney();
        tb.depositMoney();
        lb.withDraw();
        lb.transferMoney();
        lb.depositMoney();


    }
}