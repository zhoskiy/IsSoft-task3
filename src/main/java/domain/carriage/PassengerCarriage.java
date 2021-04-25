package domain.carriage;

import domain.user.Passenger;

import java.util.HashSet;
import java.util.Set;

public class PassengerCarriage extends CarryingCarriage {
    private final int maxCountOfSeats;
    private final Set<Passenger> passengers = new HashSet<>();

    public PassengerCarriage(String numberCarriage, int maxCountOfSeats) {
        super(numberCarriage);
        this.maxCountOfSeats = maxCountOfSeats;
    }

    public int getMaxCountOfSeats() {
        return maxCountOfSeats;
    }

    @Override
    public String getFullName() {
        return "Passenger carriage №" + getCarriageNumber();
    }

    public void addPassenger(Passenger passenger) {
        if (passenger.getTicket().getCarriageNumber().equals(getCarriageNumber()) && getNumberOfFreeSeats() > 0) {
            passengers.add(passenger);
        }
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public int getNumberOfFreeSeats() {
        return maxCountOfSeats - passengers.size();
    }
}
