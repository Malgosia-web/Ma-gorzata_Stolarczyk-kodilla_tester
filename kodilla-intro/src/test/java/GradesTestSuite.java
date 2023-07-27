import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {
    Grades test = new Grades();
    @Test
    public void shouldShowLastAddedGrade() {
        test.add(3);
        test.add(5);
        assertEquals(5, test.showLast());
    }
    @Test
    public void shouldNotAddGradeIfSizeIs10() {
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(5);
        assertEquals(2, test.showLast());
    }
    @Test
    public void checkAverage() {
        test.add(2);
        test.add(6);
        assertEquals(4, test.checkAverage());
    }
}