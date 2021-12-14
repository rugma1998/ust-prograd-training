import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    private Probability probability;

    @BeforeEach
    void setup() {
        probability = new Probability();
    }

    @Test
    public void checkingWhetherProbabilityOfHeadInACoinIsEqualToProbabilityOfTailInACoin() {
        assertEquals(probability.probabilityOfEvent(1, 2), probability.probabilityOfEvent(1, 2));
    }

    @Test
    public void checkingWhetherProbabilityOfTwoEventsOccurringTogether() {
        assertEquals(0.25, probability.probabilityOfTwoEventsOccurring(1, 2, 1, 2));
    }

    @Test
    public void checkingWhetherProbabilityOfEventsNotOccurring() {
        assertEquals(0, (1-probability.probabilityOfEvent(2, 2)));
    }

    @Test
    public void checkingWhetherProbabilityOfEitherOfTwoEventsOccurring() {
        assertEquals(0.5, probability.probabilityOfEvent(2, 4));
    }

}