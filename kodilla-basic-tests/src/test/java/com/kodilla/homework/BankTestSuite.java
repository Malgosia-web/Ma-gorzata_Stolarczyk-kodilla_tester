package com.kodilla.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank();

    //CZY TABLICA BANKOMATÓW JEST PUSTA
    @Test
    public void ShouldHaveZeroLength() {
        CashMachine[] cash = bank.getCashMachines();
        assertEquals(0, cash.length);
    }
    //CZY DODAJE BANKOMATY
    @Test
    public void shouldAddTwoElementsToArray() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        CashMachine[] cash = bank.getCashMachines();
        assertEquals(2, cash.length);
    }
    //CZY POPRAWNIE LICZY WPŁATY
    @Test
    public void shouldCalculateDeposit() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        assertEquals(1100, bank.totalDeposit());
    }
    //CZY POPRAWNIE LICZY WYPŁATY
    @Test
    public void shouldCalculateWithdrawal() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        bank.cashMachines[1].add(-200);
        assertEquals(-300, bank.totalWithdrawal());
    }
    //CZY POPRAWNIE LICZY SALDO
    @Test
    public void shouldCalculateSum() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        assertEquals(1000, bank.totalSum());
    }
    //MA BYĆ ZEROWE SALDO GDY NIE BYŁO WPŁAT/WYPŁAT
    @Test
    public void shouldReturnSumEqualsZeroIfArrayIsEmpty() {
        assertEquals(0, bank.totalSum());
    }
    //LICZBA TRANSAKCJI SIĘ ZWIĘKSZA - wpłaty
    @Test
    public void shouldCalculateDepositTransaction() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        assertEquals(2, bank.totalDepositTransactions());
    }
    //LICZBA TRANSAKCJI SIĘ ZWIĘKSZA - wypłaty
    @Test
    public void shouldCalculateWithdrawalTransaction() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        assertEquals(1, bank.totalWithdrawalTransactions());
    }
    //LICZBA TRANSAKCJI SIĘ ZWIĘKSZA - wszystkie
    @Test
    public void shouldCalculateAllTransaction() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        assertEquals(3, bank.totalTransactions());
    }
    //MA BYĆ ZERO TRANSAKCJI GDY NIE BYŁO WPŁAT/WYPŁAT
    @Test
    public void shouldReturnTransactionEqualsZeroIfArrayIsEmpty() {
        assertEquals(0, bank.totalTransactions());
    }
    //CZY LICZY ŚREDNIĄ WPLATĘ
    @Test
    public void shouldCalculateDepositAverage() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        assertEquals(550, bank.getAverageDeposit());
    }
    //CZY LICZY ŚREDNIĄ WYPŁATĘ
    @Test
    public void shouldCalculateWithdrawalAverage() {
        bank.addCashMachines(new CashMachine());
        bank.addCashMachines(new CashMachine());
        bank.cashMachines[0].add(500);
        bank.cashMachines[0].add(-100);
        bank.cashMachines[1].add(600);
        bank.cashMachines[1].add(-200);
        assertEquals(-150, bank.getAverageWithdrawal());
    }
}
