public class Grades {                 //tworzymy klase
    private int[] grades;             //tablica
    private int size;       ///monitoruje liczbę elementów w tablicy

    public Grades() {                   //KONSTRUKTOR
        this.grades = new int[10];    //przypisanie nowej wartości do zmiennej przechowującej oceny
        this.size = 0;       // mówi ile jest elementów w tablicy ale może być zmieniana
    }

    // SZABLON METODY DODAJĄCEJ PRZEKAZANĄ W ARGUMENCIE OCENĘ DO TABLICY
    public void add(int value) {   //w argumencie jest liczba do wstawienia
        if (this.size == 10) {  //warunek pilnuje nieprzekroczenia wielkości tablicy
            return;     //w metodzie void return to przerwanie działania
        }
        this.grades[this.size] = value;  //jeśli jest miejsce to dodajemy element o konkretnym indeksie równym obecnemu rozmiarowi
        this.size++;   ///ilość elementów w tablicy zostaje zwiększona
    }

    //METODA ZWRACAJĄCA OSTATNIĄ OCENĘ
    int showLast() {
        int lastOne = grades[(this.size - 1)];
        return lastOne;
    }
    //METODA WYLICZAJĄCA ŚREDNIĄ OCEN
    double checkAverage() {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += grades[i];
        }
        return sum / size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(3);
        grades.add(6);
        grades.add(1);
        grades.add(4);
        grades.add(3);

        System.out.println("ostatnia dodana ocena to: " + grades.showLast());
        System.out.println("średnia wszystkich ocen to: " + grades.checkAverage());
    }
}