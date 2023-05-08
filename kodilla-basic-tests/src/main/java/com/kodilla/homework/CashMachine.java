package com.kodilla.homework;

public class CashMachine {
    private int[] cashDeposit;
    private int[] cashWithdrawal;
    private int sizeD;
    private int sizeW;

    public CashMachine() {
        this.sizeD = 0;
        this.sizeW = 0;
        this.cashDeposit = new int[0];
        this.cashWithdrawal = new int[0];
    }
    // DODAWANIE WPŁATY Z TWORZENIEM NOWEJ TABLICY
    public void add(int amount){
        if (amount > 0) {
            this.sizeD++;
            int[] newTabD = new int[this.sizeD];
            System.arraycopy(cashDeposit, 0, newTabD, 0, cashDeposit.length);
            newTabD[this.sizeD - 1] = amount;
            this.cashDeposit = newTabD;
        }
        else if (amount < 0) {
            this.sizeW++;
            int[] newTab = new int[this.sizeW];
            System.arraycopy(cashWithdrawal, 0, newTab, 0, cashWithdrawal.length);
            newTab[this.sizeW - 1] = amount;
            this.cashWithdrawal = newTab;
        }
        else return;
    }
    //WARTOŚĆ WPŁAT
    public int depositSum() {
        int deposit = 0;
        for (int i = 0; i < cashDeposit.length; i++) {
            deposit += cashDeposit[i];
        }
        return deposit;
    }
    //WARTOŚĆ WYPŁAT
    public int withdrawalSum() {
        int withdrawal = 0;
        for (int i = 0; i < cashWithdrawal.length; i++) {
            withdrawal += cashWithdrawal[i];
        }
        return withdrawal;
    }
    //SALDO KOŃCOWE BANKOMATU
    public int sumAll() {
        int sum = withdrawalSum() + depositSum();
        return sum;
    }
    //LICZBA WPŁAT
    public int depositTransaction() {
        int depositTransaction = cashDeposit.length;
        return depositTransaction;
    }
    //LICZBA WYPŁAT
    public int withdrawalTransaction() {
        int withdrawalTransaction = cashWithdrawal.length;
        return withdrawalTransaction;
    }
    //LICZBA WSZYSTKICH TRANSAKCJI
    public int allTransactions() {
        int allTransactions = depositTransaction() + withdrawalTransaction();
        System.out.println("Łączna ilość transakcji w bankomacie: " + allTransactions);
        return allTransactions;
    }
    public int[] getCashDeposit() {
        return cashDeposit;
    }
    public int[] getCashWithdrawal() {
        return cashWithdrawal;
    }
}
