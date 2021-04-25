package domain.carriage;

import domain.user.Passenger;
import domain.user.PassengerTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerCarriageTest {

    public static PassengerCarriage createPassengerCarriage(String number, int count) {
        return new PassengerCarriage(number, count);
    }

    @Test
    void addPassengerSuccessfully() {
        Passenger passenger = PassengerTest.createPassenger(1, "n1");
        PassengerCarriage passengerCarriage = createPassengerCarriage("n1", 10);
        passengerCarriage.addPassenger(passenger);
        assertTrue(passengerCarriage.getPassengers().contains(passenger));
    }

    @Test
    void getNumberOfFreeSeats() {
        Passenger passenger = PassengerTest.createPassenger(1, "n1");
        PassengerCarriage passengerCarriage = createPassengerCarriage("n1", 10);
        passengerCarriage.addPassenger(passenger);
        assertEquals(9, passengerCarriage.getNumberOfFreeSeats());
    }
}