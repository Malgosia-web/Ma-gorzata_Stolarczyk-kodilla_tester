public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2021);
        System.out.println("Notebook 1:");
        System.out.println("   weight: " + notebook.weight + "g");
        System.out.println("   price: " + notebook.price + "zł");
        System.out.println("   year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkRecommendation();

        Notebook heavyNotebook = new Notebook(2500, 7000, 2022);
        System.out.println("Notebook 2:");
        System.out.println("   weight: " + heavyNotebook.weight + "g");
        System.out.println("   price: " + heavyNotebook.price + "zł");
        System.out.println("   year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkRecommendation();

        Notebook oldNotebook = new Notebook(1250, 50, 2010);
        System.out.println("Notebook 3:");
        System.out.println("   weight: " + oldNotebook.weight + "g");
        System.out.println("   price: " + oldNotebook.price + "zł");
        System.out.println("   year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkRecommendation();

        Notebook newNotebook = new Notebook(600, 1700, 2023);
        System.out.println("Notebook 4:");
        System.out.println("   weight: " + newNotebook.weight + "g");
        System.out.println("   price: " + newNotebook.price + "zł");
        System.out.println("   year: " + newNotebook.year);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkRecommendation();
    }
}
