import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    public void setup(){
        cal = new Calculator();
    }

    @Nested
    class TestingAddFunction{
        @Test
        public void fivePlusFiveIsTen(){
            double answer = cal.add(5,5);
            double expected = 10;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negativeTwentyPlusFiveIsNegativeFifteen(){
            double answer = cal.add(-20,5);
            double expected = -15;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void tenPlusZeroIsTen(){
            double answer = cal.add(10,0);
            double expected = 10;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    class TestingSubFunction{
        @Test
        public void eightMinusFiveIsFive(){
            double answer = cal.sub(8,5);
            double expected = 3;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negativeTenMinusThreeIsNegativeThirteen(){
            double answer = cal.sub(-10,3);
            double expected = -13;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void sixMinusFourIsTwo(){
            double answer = cal.sub(6,4);
            double expected = 2;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    class TestingMulFunction{
        @Test
        public void fiveMultiplyFiveIsTwentyFive(){
            double answer = cal.mul(5,5);
            double expected = 25;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negativeTenMultiplyFiveIsNegativeFifty(){
            double answer = cal.mul(-10,5);
            double expected = -50;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void tenMultiplyZeroIsZero(){
            double answer = cal.mul(10,0);
            double expected = 0;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    class TestingDivFunction{
        @Test
        public void tenDividedTwoIsFive(){
            double answer = cal.div(10,2);
            double expected = 5;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negativeTwentyDividedTenIsNegativeTwo(){
            double answer = cal.div(-20,10);
            double expected = -2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwExceptionWhenDividedByZero(){
            Assertions.assertThrows(ArithmeticException.class, () -> cal.div(5,0));
        }
    }
}
