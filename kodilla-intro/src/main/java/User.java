public class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        User a = new User("Stefan", 13);
        User b = new User("Ania", 33);
        User c = new User("Adam", 53);
        User d = new User("Zbyszek", 3);
        User e = new User("Basia", 23);

        User[] users = {a, b, c, d, e};

        System.out.println("użytkownicy: " + users.length);

        // wyliczanie średniej wieku:
        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].age;
        }
        double average = sum / users.length;
        System.out.println("średnia wieku wszystkich użytkowników to: " + average);

        //wiek poniżej średniej ma:
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println("Wiek poniżej średniej ma: " + users[i].name);
            }
        }
    }
}
