import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void add_emptyString_ReturnsZero(){
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void lengthOneReturnsThatNumber(){
        assertEquals(1, StringCalculator.add("1"));
        assertEquals(2, StringCalculator.add("2"));
        assertEquals(9, StringCalculator.add("9"));
    }

    @Test
    public void twoNumbersSum(){
        assertEquals(5, StringCalculator.add("2,3"));
    }

    @Test
    public void threeOrMoreNumbersSum(){
        assertEquals(9, StringCalculator.add("2,3,4"));
        assertEquals(100, StringCalculator.add("90,10"));
    }

}