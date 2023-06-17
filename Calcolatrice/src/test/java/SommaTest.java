import com.example.calcolatrice.CalcController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SommaTest {
    @Test
    void sommaTest(){
        int a = 2;
        int b = 2;
        CalcController calcController = new CalcController();
        int expectedRes = 2;
        int res = calcController.somma(a,b);
        Assertions.assertEquals(expectedRes, res);
    }
}
