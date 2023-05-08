package com.kodilla.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    //CZY TABLICA WPŁAT JEST PUSTA
    @Test
    public void shouldHaveZeroLengthD() {
        int[] cash = cashMachine.getCashDeposit();
        assertEquals(0, cash.length);
    }
    //CZY TABLICA WYPŁAT JEST PUSTA
    @Test
    public void shouldHaveZeroLengthW() {
        int[] cash = cashMachine.getCashWithdrawal();
        assertEquals(0, cash.length);
    }
    //CZY DODAJE DO TABLICY WPŁATY I WYPŁATY
    @Test
    public void shouldAddTwoElementsToArray() {
        cashMachine.add(500);
        cashMachine.add(-300);
        cashMachine.add(0);

        int[] cashD = cashMachine.getCashDeposit();
        int[] cashW = cashMachine.getCashWithdrawal();
        assertEquals(1, cashD.length);
        assertEquals(1, cashW.length);
        assertEquals(500, cashD[0]);
        assertEquals(-300, cashW[0]);
    }
    //CZY SUMUJE WPŁATY I WYPŁATY
    @Test
    public void shouldCalculateSum() {
        cashMachine.add(500);
        cashMachine.add(-300);
        cashMachine.add(0);
        assertEquals(200, cashMachine.sumAll());

        //UJEMNE SALDO
        cashMachine.add(-300);
        assertEquals(-100, cashMachine.sumAll());
    }
    //MA BYĆ ZEROWE SALDO GDY NIE BYŁO WPŁAT/WYPŁAT
    @Test
    public void shouldReturnSumEqualsZeroIfArrayIsEmpty() {
        assertEquals(0, cashMachine.sumAll());
    }
    //LICZBA TRANSAKCJI SIĘ ZWIĘKSZA - wpłaty
    @Test
    public void shouldCalculateDepositTransaction() {
        cashMachine.add(500);
        cashMachine.add(-300);
        cashMachine.add(0);
        assertEquals(1, cashMachine.depositTransaction());
    }
    //LICZBA TRANSAKCJI SIĘ ZWIĘKSZA - wypłaty
    @Test
    public void shouldCalculateWithdrawalTransaction() {
        cashMachine.add(500);
        cashMachine.add(-300);
        cashMachine.add(0);
        assertEquals(1, cashMachine.withdrawalTransaction());
    }
    //LICZBA TRANSAKCJI SIĘ ZWIĘKSZA - wszystkie
    @Test
    public void shouldCalculateTransaction() {
        cashMachine.add(500);
        cashMachine.add(-300);
        cashMachine.add(0);
        assertEquals(2, cashMachine.allTransactions());
    }
    //MA BYĆ ZERO TRANSAKCJI GDY NIE BYŁO WPŁAT/WYPŁAT
    @Test
    public void shouldReturnTransactionEqualsZeroIfArrayIsEmpty() {
        assertEquals(0, cashMachine.allTransactions());
    }
}
