public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if (this.price >=600 && this.price <=1500) {
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        }
        else if (this.weight >=1000 && this.weight <=1500) {
            System.out.println("This notebook is quite heavy.");
        }
        else {
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkRecommendation() {
        if (this.year > 2022 && this.price <= 2000) {
            System.out.println("It's a good price and year.");
        }
        else if (this.year <= 2022 && this.year >=2016 && this.price <=1000) {
            System.out.println("Buy it if You don't need new one.");
        }
        else if (this.year < 2015 && this.price <=100) {
            System.out.println("You can buy it for kids to play.");
        }
        else {
            System.out.println("Don't buy it.");
        }
    }
}