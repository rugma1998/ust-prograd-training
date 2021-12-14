import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
public class WeightConvertorTest {
    MeasurementConvertor measurementConvertor = new MeasurementConvertor();
    @Nested
    public class TestWeightMeasurements{
        @Nested
        public class TestDifferentWeights{
            @Test
            public void checkIfOneGramIsEqualToOneGram(){
                double actualValue=measurementConvertor.baseToBase(1);
                double expectedValue=1;
                Assertions.assertEquals(expectedValue,actualValue);
            }
            @Test
            public void checkIfZerPointOneKilogramIsEqualToOneHundredGram(){
                double actualValue=measurementConvertor.kiloToBase(0.1);
                double expectedValue=100;
                Assertions.assertEquals(expectedValue,actualValue);
            }
            @Test
            public void checkAdditionOfTenGramAndOneKilogramIsThousandAndTenGrams(){
                double actualValue=10+measurementConvertor.kiloToBase(1);
                double expectedValue=1010;
                Assertions.assertEquals(expectedValue,actualValue);
            }
            @Test
            public void checkSubtractionOfOnePointFiveKilogramAndFiveHundredGramIsOneKilogram(){
                double actualValue=1.5-measurementConvertor.baseToKilo(500);
                double expectedValue=1;
                Assertions.assertEquals(expectedValue,actualValue);
            }
        }
    }
}
