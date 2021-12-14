import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConvertorTest {
    private LengthConvertor lengthConvertor;

    @BeforeEach
    void setup() {
        lengthConvertor = new LengthConvertor();
    }

    @Nested
    class CentiMeterToCentiMeter {
        @Test
        public void checkOneCentiMeterIsEqualToOneCentimeter() {
            double actualLength = lengthConvertor.centimeterToCentimeter(1);
            double expectedLength = 1;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class MeterToCentimeter {
        @Test
        public void checkOneMeterIsToIsEqualToHundredCentimeter() {
            double actualLength = lengthConvertor.meterToCentimeter(1);
            double expectedLength = 100;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class CentiMeterToKiloMeter {
        @Test
        public void checkOneCentimeterIsEqualToPointZeroZeroKilometer() {
            double actualLength = lengthConvertor.centimeterToKilometer(1);
            double expectedLength = 0.001;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class AddingLength {
        @Test
        public void checkAdditionOfOneMeterAndOneCentimeterIsEqualToTwoMeter() {
            double actualLength = 1 + lengthConvertor.centimeterToMeter(100);
            double expectedLength = 2;
            assertEquals(expectedLength, actualLength);
        }

        @Test
        public void checkAdditionOfTwoHundredCentimeterAndOneKilometerIsEqualToOneLAndTwoHundredCentimeter() {
            double actualLength = 200 + lengthConvertor.kilometerToCentiMeter(1);
            double expectedLength = 100200;
            assertEquals(expectedLength, actualLength);
        }
    }

    @Nested
    class SubtractingLength {
        @Test
        public void checkSubtractionOfOneMeterAndFiftyCentimeterIsEqualToPointFiveMeter() {
            double actualLength = 1 - lengthConvertor.centimeterToMeter(50);
            double expectedLength = 0.5;
            assertEquals(expectedLength, actualLength);
        }

        @Test
        public void checkSubtractionOfTwoThousandCentimeterAndOneMeterIsEqualToThousandNineHundredCentimeter() {
            double actualLength = 2000 - lengthConvertor.meterToCentimeter(1);
            double expectedLength = 1900;
            assertEquals(expectedLength, actualLength);
        }
    }
}