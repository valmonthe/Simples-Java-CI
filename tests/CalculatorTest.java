import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(6, Calculator.add(3, 3));
    }

    @Test
    public void testSubstraction() {
        assertEquals(5, Calculator.substract(7, 2));
    }

}
    