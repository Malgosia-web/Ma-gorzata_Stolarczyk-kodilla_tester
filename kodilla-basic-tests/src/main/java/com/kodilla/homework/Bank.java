package com.kodilla.homework;

public class Bank {
    public CashMachine[] cashMachines;
    private int size;
    public Bank() {
        this.cashMachines = new CashMachine[size];
        this.size = 0;
    }
    //DODAWANIE BANKOMATÓW DO TABLICY
    public void addCashMachines() {
        CashMachine cashMachine = new CashMachine();
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }
    //SALDO Z WSZYSTKICH BANKOMATÓW
    public int totalSum() {
        int sum = 0;
        for (int i =0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].sumAll();
        }
        System.out.println("Saldo z wszystkich bankomatów: " + sum);
        return sum;
    }
    //SUMA WSZYSTKICH WPŁAT
    public int totalDeposit() {
        int totalD = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            totalD += this.cashMachines[i].depositSum();
        }
        System.out.println("Suma wpłat z wszystkich bankomatów: " + totalD);
        return totalD;
    }
    //SUMA WSZYSTKICH WYPŁAT
    public int totalWithdrawal() {
        int totalW = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            totalW += this.cashMachines[i].withdrawalSum();
        }
        System.out.println("Suma wypłat z wszystkich bankomatów: " + totalW);
        return totalW;
    }
    //ILOŚĆ WSZYSTKICH WPŁAT
    public int totalDepositTransactions() {
        int totalDT = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            totalDT += this.cashMachines[i].depositTransaction();
        }
        return totalDT;
    }
    //ILOŚĆ WSZYSTKICH WYPŁAT
    public int totalWithdrawalTransactions() {
        int totalWT = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            totalWT += this.cashMachines[i].withdrawalTransaction();
        }
        return totalWT;
    }
    //ILOŚĆ WSZYSTKICH TRANSAKCJI
    public int totalTransactions() {
        int totalT = totalDepositTransactions() + totalWithdrawalTransactions();
        return totalT;
    }
    //ŚREDNIA WPŁATA
    public double getAverageDeposit() {
        double averageD = totalDeposit() / totalDepositTransactions();
        System.out.println("Średnia wpłata: " + averageD);
        return averageD;
    }
    //ŚREDNIA WYPŁATA
    public double getAverageWithdrawal() {
        double averageW = totalWithdrawal() / totalWithdrawalTransactions();
        System.out.println("Średnia wypłata: " + averageW);
        return averageW;
    }
    public CashMachine[] getCashMachines() {
        return cashMachines;
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCashMachines();
        bank.addCashMachines();
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-200);
        bank.cashMachines[1].add(600);
        bank.addCashMachines();
        bank.cashMachines[2].add(400);
        bank.cashMachines[2].add(-150);
        bank.cashMachines[1].add(-100);
        bank.totalSum();
        bank.getAverageDeposit();
        bank.getAverageWithdrawal();
    }
}