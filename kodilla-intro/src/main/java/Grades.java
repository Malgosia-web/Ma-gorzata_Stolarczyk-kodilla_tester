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
        System.out.println("dodana ocena to: " + value);
    }

    //METODA ZWRACAJĄCA OSTATNIĄ OCENĘ
    int showLast() {
        int lastOne = grades[(this.size - 1)];
        System.out.println("ostatnia ocena to: " + lastOne);
        return lastOne;
        //System.out.println("this.size to: " + this.size);
        //System.out.println("grades[this.size - 1] to: " + grades[this.size -1]);
    }

    //METODA ZWRACAJĄCA ŚREDNIĄ - nie wiem jak zrobić, żeby było po przecinku, zawsze zaokrągla do całości
    double checkAverage() {
        //double average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4] + grades[5] + grades[6] + grades[7] + grades[8] + grades[9]) / (this.size);
        //System.out.println("średnia ocen zaokrąglona do całości to: " + average);
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += grades[i];
        }
        System.out.println("średnia ocen to: " + sum / size);
        return sum / size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(3);
        grades.add(6);
        grades.checkAverage();
        grades.add(1);
        grades.showLast();
        grades.add(4);
        grades.add(3);
        grades.checkAverage();
        grades.showLast();

    }
}