import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("a + b 는 3이다")
    @Test
    public void junitTest() {
        int a = 1;
        int b = 2;

        Assertions.assertEquals(3, a + b);
    }

    @DisplayName("a + b 는 4이다")
    @Test
    public void junitFailedTest() {
        int a = 1;
        int b = 3;

        Assertions.assertEquals(3, a + b);
    }
}
