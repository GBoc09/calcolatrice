import com.example.calcolatrice.CalcController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SommaTest {
    @Test
    void sommaTest(){
        double a = 2;
        double b = 2;
        CalcController calcController = new CalcController();
        double expectedRes = 2;
        Double res = calcController.somma(a,b);
        Assertions.assertEquals(expectedRes, res);
    }
}
