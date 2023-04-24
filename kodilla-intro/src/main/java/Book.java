import java.util.Scanner;

public class Book {
    private String author;
    private String title;

    public static String getAuthor() {
        System.out.println("Podaj autora: ");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        return author;
    }
    public static String getTitle() {
        System.out.println("Podaj tytuł: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        return title;
    }
    public static Book of(String author, String title) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        return book;
        }

    public static void main(String[] args) {
        Book book = Book.of(getAuthor(), getTitle());
        Book book1 = Book.of(getAuthor(), getTitle());

        System.out.println("Title book: " + book.title);
        System.out.println("Author book: " + book.author);

        System.out.println("Author book1: " + book1.author);
        System.out.println("Title book1: " + book1.title);
    }
}
