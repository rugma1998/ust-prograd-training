import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
public class LengthConvertorTest {
    MeasurementConvertor measurementConvertor = new MeasurementConvertor();
    @Nested
    public class TestLengthMeasurements {
        @Nested
        public class TestDifferentLengths {
            @Test
            public void TestingOneCentimeterIsEqualToOneCentimeter() {
                double actualValue = measurementConvertor.centiToCenti(1);
                double expectedValue = 1;
                Assertions.assertEquals(expectedValue, actualValue);
            }
            @Test
            public void TestingOneMeterIsEqualToOneCentimeter() {
                double actualValue = measurementConvertor.baseToCenti(1);
                double expectedValue = 100;
                Assertions.assertEquals(expectedValue, actualValue);
            }
            @Test
            public void TestingOneHundredCmIsEqualToZeroPointZeroZeroOneKilometers() {
                double actualValue = measurementConvertor.centiToKilo(100);
                double expectedValue = 0.001;
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }
        @Nested
        public class AddingLengths {
            @Test
            public void checkAdditionOfOneMeterAndOneHundredCentimetersIsTwoMeters() {
                double actualValue = 1 + measurementConvertor.centiToBase(100);
                double expectedValue = 2;
                Assertions.assertEquals(expectedValue, actualValue);
            }
            @Test
            public void checkAdditionOfTwoHundredCentimeterAndOneKilometerIsOneLakhTwoHundredCentimeter() {
                double actualValue = 200 + measurementConvertor.kiloToCenti(1);
                double expectedValue = 100200;
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }
        @Nested
        public class SubtractingLengths {
            @Test
            public void checkSubtractionOfOneMeterAndFiftyCentimetersIsZeroPointFiveMeters() {
                double actualValue = 1 - measurementConvertor.centiToBase(50);
                double expectedValue = 0.5;
                Assertions.assertEquals(expectedValue, actualValue);
            }
            @Test
            public void checkSubtractionOfTwoThousandCentimeterAndOneMeterIsNineteenHundredCentimeter() {
                double actualValue = 2000 - measurementConvertor.baseToCenti(1);
                double expectedValue = 1900;
                Assertions.assertEquals(expectedValue, actualValue);
            }
        }
    }
}
