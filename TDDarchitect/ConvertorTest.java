import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ConvertorTest {
    private Convertor convertor;
    @BeforeEach
    public void setup(){
        convertor = new Convertor();
    }
    @Nested
    public class CoversionOfUnits{
        @Test
        public void checkIfOneCentimeterIsOneCentimeter(){
            double actualMeasurement= convertor.unitConvertor(1,"cm","cm");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfOneMeterIsHundredCentimeter(){
            double actualMeasurement= convertor.unitConvertor(1,"m","cm");
            double expectedMeasurement = 100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfHundredCentimeterIsPointZeroZeroOneKilometer(){
            double actualMeasurement= convertor.unitConvertor(100,"cm","km");
            double expectedMeasurement = 0.001;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfOneKilometerIsThousantMeter(){
            double actualMeasurement= convertor.unitConvertor(100,"cm","m");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfTwoMeterIsPointZeroZeroTwoKilometer(){
            double actualMeasurement= convertor.unitConvertor(2,"m","km");
            double expectedMeasurement = 0.002;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfTenCentimeterIsPointZeroOneMeter(){
            double actualMeasurement= convertor.unitConvertor(10,"cm","m");
            double expectedMeasurement = 0.1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsNegative(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(-1,"cm","cm");});
        }
        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsZero(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(0,"cm","cm");});
        }
        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsInvalid(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(10,"mm","cm");});
        }
    }
    @Nested
    public class ArithmaticOperationsOnUnits{
        @Test
        public void checkIfOneMeterPlusHundresCentimeterIsTwoMeter(){
            double actualMeasurement= convertor.add(1,"m",100,"cm");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfOneMeterMinusFiftyCentimeterIsZeroPointFiveMeterMeter(){
            double actualMeasurement= convertor.subtract(1,"m",50,"cm");
            double expectedMeasurement = 0.5;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public  void checkIfTwoHundredCentimeterPlusOneKilometerIsHundredThousandTwoHundredCentimeter(){
            double actualMeasurement = convertor.add(200,"cm",1,"km");
            double expectedMeasurement = 100200;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfTwoThousandCentimeterMinusOneMeterIsNinteenHundredCentimeter(){
            double actualMeasurement= convertor.subtract(2000,"cm",1,"m");
            double expectedMeasurement = 1900;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIfFourThousandMeterMinuseTwoMeterIsTwoThousandMeter(){
            double actualMeasurement= convertor.subtract(4000,"m",2,"km");
            double expectedMeasurement = 2000;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
        @Test
        public void checkIf4KilometerMinuseTwoKilometerIs2Kilometer(){
            double actualMeasurement= convertor.subtract(4,"km",2,"km");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }
    }
}