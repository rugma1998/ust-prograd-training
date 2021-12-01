import java.util.PriorityQueue;
public class FlightTicket{
    public static void main(String[] args)
    {
        PriorityQueue people = new PriorityQueue(10);
        System.out.println("Tickets that people taken");
        for(int i=1;i<=10;i++)
        {
            people.add(i);
        }
        System.out.println(people);
        people.poll(); // 1 person removed from queue
        if(people.size()==10)
        {
            System.out.println("Ticket booking is closed");
        }
        else{
            System.out.println("Booking is open");
        }
        System.out.println(people.poll());
    }
}
