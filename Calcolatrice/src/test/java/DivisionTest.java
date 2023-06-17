import com.example.calcolatrice.CalcController;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    void divisionTest(){
        int a = 10;
        int b = 0;
        CalcController calcController = new CalcController();
        double result = a/b;
    }
}
