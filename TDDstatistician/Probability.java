public class Probability {
    private double probabilityOfEventOne, probabilityOfEventTwo;


    public double probabilityOfEvent(double possibleEvents, double totalEvents) {
        return possibleEvents / totalEvents;
    }

    public double probabilityOfTwoEventsOccurring(double possibleEvents1, double totalEvents1, double possibleEvents2, double totalEvents2) {
        probabilityOfEventOne = probabilityOfEvent(possibleEvents1, totalEvents1);
        probabilityOfEventTwo = probabilityOfEvent(possibleEvents2, totalEvents2);
        return probabilityOfEventOne * probabilityOfEventTwo;
    }
}