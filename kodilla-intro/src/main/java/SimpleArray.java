public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Krystyna";
        names[1] = "Anna";
        names[2] = "Maria";
        names[3] = "Zuzanna";
        names[4] = "Agata";

        String name = names[1];

        System.out.println(name);

        int numberOfElements = names.length;

        System.out.println("Moja tablica ma " + numberOfElements + " elementów");

    }
}
