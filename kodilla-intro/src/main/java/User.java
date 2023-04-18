public class User {
        private String[] user;
        private String name;
        private int age;
        private int average;

        public User(String name, int age) {
            this.user = new String[5];
            this.name = name;
            this.age = age;
        }

        public void checkAge(){
            for (int i = 0; i < average; i++) {
                if (this.age == i) {    //nie mam pojęcia jak zrobić zbiorczo
                    System.out.println("Wiek poniżej średniej ma: " + this.name);
                }
            }
        }

        public static void main(String[] args) {
            User a = new User("Stefan", 13);
            User b = new User("Ania", 33);
            User c = new User("Adam", 53);
            User d = new User("Zbyszek", 3);
            User e = new User("Basia", 23);

            User[] users = {a, b, c, d, e};
            System.out.println("użytkownicy: " + users.length);
            int average = (a.age + b.age + c.age + d.age + e.age) / users.length; //wylicza średnią
            System.out.println("średnia wieku: " + average);
            //System.out.println("a.age: " + a.age);
            //System.out.println("a.name: " + a.name);

            //wiek poniżej średniej ma:
            for (int i = 0; i < average; i++) {
                if (a.age == i) {    //nie mam pojęcia jak zrobić zbiorczo
                    System.out.println("Wiek poniżej średniej ma: " + a.name);
                }
            }
        }
}
