import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


public class SquareTest {

    @Nested
    class TestingAreaFunction {
        @Test
        public void checkAreaIsTwentyFiveWhenSideIsFive() {
            Square area = new Square(5);
            double answer = area.area();
            double expected = 25;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void checkAreaIsSixteenWhenSideIsFour() {
            Square area = new Square(4);
            double answer = area.area();
            double expected = 16;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfNegativeNumberException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square area = new Square(-4);
                area.area();}
            );
        }
    }


    @Nested
    class TestingPerimeterFunction{
        @Test
        public void checkPerimeterIsTwentyWhenSideIsFive() {
            Square perimeter = new Square(5);
            double answer = perimeter.perimeter();
            double expected = 20;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void checkPerimeterIsSixteenWhenSideIsFour() {
            Square perimeter = new Square(4);
            double answer = perimeter.perimeter();
            double expected = 16;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square perimeter = new Square(-4);
                perimeter.perimeter();}
            );
        }
    }
}


