import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleAreaTest {
    private RectangleArea ar;
    @BeforeEach
    public void setup(){
        ar = new RectangleArea();
    }
    @Nested
    class TestingAreaFunction{
        @Test
        public void checkAreaIsSeventyTwoWhenLengthIsTwelveAndBreadthIsSix(){
            double area = ar.area(12,6);
            double expected = 72;
            Assertions.assertEquals(area,expected);
        }

        @Test
        public void throwExceptionWhenMeasurementsBecomeNegative(){
            Assertions.assertThrows(ArithmeticException.class, () -> ar.area(-2,-5));
        }

        @Test
        public void checkAreaIsTwentyNinePointSixWhenLengthIsSevenPointFourAndBreadthIsFour(){
            double area = ar.area(7.4,4);
            double expected = 29.6;
            Assertions.assertEquals(area,expected);
        }
    }
}
