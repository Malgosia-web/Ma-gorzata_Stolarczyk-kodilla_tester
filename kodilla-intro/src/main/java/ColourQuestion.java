import java.util.Scanner;

public class ColourQuestion {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz pierwszą literę koloru:");
            String letter = scanner.nextLine();
            if (letter.length() == 1) {
                switch (letter) {
                    case "a":
                        System.out.println("ale czerwony");
                        break;
                    case "b":
                        System.out.println("bardzo czerwony");
                        break;
                    case "c":
                        System.out.println("czerwony");
                        break;
                    default:
                        System.out.println("nie znam do tego koloru");
                }
                break;
            } else
                System.out.println("Ma być jedna litera");
        }
        return "koniec";
    }
    public static void main(String[] args){
        getLetter();
    }
}
