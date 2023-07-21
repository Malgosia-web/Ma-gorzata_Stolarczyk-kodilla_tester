package homework;

public class Wallet {
    private int balance = 0;
    public Wallet() {
    }
    public void deposit(int money) {
        this.balance += money;
    }
    public String debit(int money) {
        if (money <= this.balance) {
            this.balance -= money;
            return "Successful withdrawal from a wallet";
        } else return "You don't have enough money in Your wallet";
    }
    public int getBalance() {
        return balance;
    }
    public String showBalance() {
        return "Your balance is: $" + balance;
    }
}
