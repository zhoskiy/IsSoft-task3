package domain.user;

import domain.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
 public class PassengerTest {

    public static Passenger createPassenger(int placeNumber, String carriageNumber) {
        Ticket ticket = new Ticket(placeNumber, carriageNumber);
        return new Passenger("name1", "name2", 10, ticket);
    }

    @Test
    void testEquals() {
        Passenger passenger1 = createPassenger(10, "n1");
        Passenger passenger2 = createPassenger(10, "n1");
        boolean actual = passenger1.equals(passenger2);
        assertTrue(actual);
    }

    @Test
    void testHashCode() {
        Ticket ticket = new Ticket(20, "n2");
        Passenger passenger1 = new Passenger("name1", "name2", 18, ticket);
        Passenger passenger2 = new Passenger("name1", "name2", 20, ticket);
        assertEquals(passenger2.hashCode(), passenger1.hashCode());
    }
}