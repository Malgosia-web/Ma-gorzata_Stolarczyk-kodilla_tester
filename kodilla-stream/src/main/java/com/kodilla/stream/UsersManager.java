package com.kodilla.stream;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }
    public static List<String> filterAge(int age) {
        List<String> userAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return userAge;
    }
    public static List<String> filterNumberOfPost() {
        List<String> userPost = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return userPost;
    }
    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    public List<String> getUsernames() {return filterChemistGroupUsernames();}

    public static String getUserName(User user) {
        return user.getUsername();
    }
}




//public class UsersManager {
//    public static void main(String[] args) {
//        processUsersStream();
//    }
//
//    private static void processUsersStream() {
//        //wywołujemy metodę, która zwraca ArrayList obiektów typu User
//        UsersRepository.getUsersList()
//
//                // uruchamiamy strumień
//                .stream()
//
//                // filtr, który zwraca informację, czy dany obiekt zostaje przepuszczony w strumieniu (gdy true)
//                .filter(user -> user.getGroup().equals("Chemists"))
//
//                // operacja transformująca. Metoda map klasy Stream. Argumentem metody jest wyrażenie lambda.
//                // po lewej od strzałki - argumenty wejściowe, po prawej kod zwracający obiekty wynikowe
//                .map(user -> user.getUsername())
//                // .map(UsersManager::getUserName) - użycie referencji do metody - nazwa_klasy::nazwa_metody
//
//                // wyrażenie terminalne. ForEach klasy Stream wykonuje daną operację na każdym obiekcie przepływającym przez strumień
//                // koniec Stream
//                .forEach(username -> System.out.println(username));
//    }
//    public static String getUserName(User user) {
//        return user.getUsername();
//    }
//}
