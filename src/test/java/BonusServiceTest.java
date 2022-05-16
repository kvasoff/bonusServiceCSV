import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void test(int amount, boolean isRegistered, int expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }
}
