import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {
    private Wallet wallet;
@BeforeEach
void setup(){
    wallet= new Wallet();
}
    @Nested
    class RupeeToDollar {

        @Test
        public void checkWhetherSeventyFourPointEightFiveRupeeIsEqualToOneDollar() {

            double actualAmount = wallet.rupeesToDollars(74.85);
            double expectedAmount = 1;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class DollarToRupee {
        @Test
        public void checkWhetherOneDollarIsEqualsToSeventyFourPointEightFiveRupee() {

            double actualAmount = wallet.dollarsToRupees(1);
            double expectedAmount = 74.85;
            assertEquals(expectedAmount, actualAmount);
        }
    }


    @Nested
    class AddingTwoDifferentAmount {
        @Test
        public void checkWhetherAdditionOfOneDollarAndFiftyRupeesIsEqualsToOneTwentyFourPointEightFiveRupees() {

            double actualAmount = 50 + wallet.dollarsToRupees(1);
            double expectedAmount = 124.85;
            assertEquals(expectedAmount, actualAmount);
        }
    }
    @Nested
    class AddingThreeDifferentAmount {
        @Test
        public void checkWhetherAdditionOfSeventyFourPointEightFiveAndOneDollarAndOneFourtyNinePointSevenRupeesIsEqualsToFourDollar() {

            double actualAmount =   wallet.rupeesToDollars(74.85)+1+wallet.rupeesToDollars(149.7);
            double expectedAmount = 4;
            assertEquals(expectedAmount, actualAmount);
        }
    }

    @Nested
    class SubtractingDifferentAmount {
        @Test
        public void checkWhetherSubtractionOfThreeDollarAndOneFourtyNinePointSevenRupeeIsEqualsToOneDollar() {

            double actualAmount = 3 - wallet.rupeesToDollars(149.7);
            double expectedAmount = 1;
            assertEquals(expectedAmount, actualAmount);
        }
    }
}


