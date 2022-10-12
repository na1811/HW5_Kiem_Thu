import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class BmiCsvTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/Data.csv", numLinesToSkip = 1)
    void test(double weight, double height, String result) {
        TinhBMI kq = new TinhBMI();
        assertEquals(kq.tinhBmi(weight,height),result);
    }

}
