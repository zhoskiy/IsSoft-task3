package domain;

import java.util.Objects;

public class Ticket {
    private final int placeNumber;
    private final String carriageNumber;

    public Ticket(int placeNumber, String carriageNumber) {
        this.placeNumber = placeNumber;
        this.carriageNumber = carriageNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (placeNumber != ticket.placeNumber) return false;
        return Objects.equals(carriageNumber, ticket.carriageNumber);
    }

    @Override
    public int hashCode() {
        int result = placeNumber;
        result = 31 * result + (carriageNumber != null ? carriageNumber.hashCode() : 0);
        return result;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public String getCarriageNumber() {
        return carriageNumber;
    }
}
