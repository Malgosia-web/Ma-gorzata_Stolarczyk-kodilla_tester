package com.kodilla.school;

public class Grades {
    private int[] values;
    private int size;

    public Grades() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {                //gdy tablica jest za mała tworzymy nową tablicę i kopiujemy elementy ze starej
        this.size++;                            //zwiększamy o jeden wartość nowej tablicy
        int[] newTab = new int[this.size];      //tworzymy pustą tablicę z nowym rozmiarem
        System.arraycopy(values, 0, newTab, 0, values.length);  //kopiujemy tablicę źródłową do docelowej (jak pętla for); source array, starting position in source array, destination array, starting position in destination array, number of elements to be copied
        newTab[this.size - 1] = value;          //przypisujemy nową wartość do ostatniego elementu (-1 bo indeksy liczymy od 0)
        this.values = newTab;                   //przypisanie nowej tablicy do tablicy klasowej
    }

    public int[] getValues() {
        return values;
    }
    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}
