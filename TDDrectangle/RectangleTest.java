import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;

public class RectangleTest {

    @Nested
    class TestingAreaFunction {
        @Test
        public void checkAreaIsSeventyTwoWhenLengthIsTwelveAndBreadthIsSix() {
            Rectangle area = new Rectangle(12, 6);
            double answer = area.area();
            double expected = 72;
            Assertions.assertEquals(answer, expected);
        }


        @Test
        public void checkAreaIsTwentyNinePointSixWhenLengthIsSevenPointFourAndBreadthIsFour() {
            Rectangle area = new Rectangle(7.4, 4);
            double answer = area.area();
            double expected = 29.6;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfNegativeNumberException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                        Rectangle area = new Rectangle(-2, 0);
                        area.area();}
            );
        }
    }

    @Nested
    class TestingPerimeterFunction{
        @Test
        public void checkPerimeterIsTwentyFourWhenLengthIsSevenAndBreadthIsFive() {
            Rectangle perimeter = new Rectangle(7, 5);
            double answer = perimeter.perimeter();
            double expected = 24;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void checkPerimeterForDecimalMeasurements() {
            Rectangle perimeter = new Rectangle(5.4, 3.2);
            DecimalFormat df = new DecimalFormat("#.#");
            double answer = perimeter.perimeter();
            double expected = 17.2;
            Assertions.assertEquals(df.format(answer), df.format(expected));
        }
        @Test
        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Rectangle perimeter = new Rectangle(-4, 0);
                perimeter.perimeter();}
            );
        }
    }
}
