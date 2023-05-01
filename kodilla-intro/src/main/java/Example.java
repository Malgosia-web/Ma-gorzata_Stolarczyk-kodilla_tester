public class Example {
    private String text;

    public Example(String text) {
        this.text = text;
    }
    public void displayText(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Example example = new Example("test1");
        example.displayText("test2");
    }
}
