public class BankCard implements  Debit, Credit {

    @Override
    public void creditMethod() {
        System.out.println("Add money to account");
    }

    @Override
    public void debitMethod() {
        System.out.println("Take money from account");
    }
}
