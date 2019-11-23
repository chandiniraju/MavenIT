package Module3;

public class PolyMyBank extends PolyBank
{
    public void openAccount()
    {
        System.out.println("Opening account from Child class");
    }
    public void depositMoney()
    {
        System.out.println("Deposit money from Child class");
    }
    public void transferMoney()
    {
        System.out.println("Transfer money  from child class");

    }

    public static void main(String[] args) {

        PolyMyBank pmb= new PolyMyBank();
        pmb.openAccount();
        pmb.depositMoney();
        pmb.transferMoney();
        pmb.withDrawMoney();


    }

}
