import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;


import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class UsersManagerTest {

    // czy filtruje chemików
    @Test
    public void CorrectUsername() {
        UsersManager usersManager = new UsersManager();
        assertLinesMatch(asList("Walter White", "Gale Boetticher"), usersManager.getUsernames());
    }

    // czy filtruje wiek powyżej zadanego
    @Test
    public void CorrectAge() {
        assertLinesMatch(asList("Walter White", "Gus Firing", "Mike Ehrmantraut"), UsersManager.filterAge(45));
    }

    // czy filtruje nieaktywnych użytkowników
    @Test
    public void ZeroPosts() {
        assertLinesMatch(asList("Gus Firing", "Mike Ehrmantraut"), UsersManager.filterNumberOfPost());
    }
}
