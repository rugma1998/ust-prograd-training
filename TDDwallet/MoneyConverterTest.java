import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyConverterTest {

    private MoneyConverter moneyConverter;

    @BeforeEach
    void setup() {
        moneyConverter = new MoneyConverter();
    }

    @Nested
    class RupeeToDollar {

        @Test
        public void checkWhetherSeventyFourPointEightFiveRupeeIsEqualToOneDollar() {
            double actualAmount = moneyConverter.rupeeToDollar(74.85);
            double expectedAmount = 1;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class DollarToRupee {

        @Test
        public void checkWhetherOneDollarIsEqualsToSeventyFourPointEightFiveRupee() {
            double actualAmount = moneyConverter.dollarToRupee(1);
            double expectedAmount = 74.85;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class RupeeToRupee {

        @Test
        public void checkWhetherOneRupeeIsEqualsToOneRupee() {
            double actualAmount = moneyConverter.rupeeToRupee(1);
            double expectedAmount = 1;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class DollarToDollar {

        @Test
        public void checkWhetherOneDollarIsEqualsToOneDollar() {
            double actualAmount = moneyConverter.dollarToDollar(1);
            double expectedAmount = 1;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class AddingTwoDifferentAmount {

        @Test
        public void checkWhetherAdditionOfOneDollarAndFiftyRupeesIsEqualsToOneTwentyFourPointEightFiveRupees() {
            double actualAmount = 50 + moneyConverter.dollarToRupee(1);
            double expectedAmount = 124.85;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class AddingThreeDifferentAmount {

        @Test
        public void checkWhetherAdditionOfSeventyFourPointEightFiveAndOneDollarAndOneFortyNinePointSevenRupeesIsEqualsToFourDollar() {

            double actualAmount = moneyConverter.rupeeToDollar(74.85) + 1 + moneyConverter.rupeeToDollar(149.7);
            double expectedAmount = 4;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class WithDrawingAmount {

        @Test
        public void checkWhetherWithdrawOfOneFortyNinePointSevenRupeeFromThreeDollarIsOneDollar() {
            double actualAmount = 3 - moneyConverter.rupeeToDollar(149.7);
            double expectedAmount = 1;
            assertEquals(expectedAmount, actualAmount);
        }
    }
}
