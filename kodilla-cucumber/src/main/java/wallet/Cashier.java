package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= wallet.getBalance()) {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
        else {
            cashSlot.dispense(wallet.getBalance());
            wallet.debit(wallet.getBalance());
        }
    }
}
