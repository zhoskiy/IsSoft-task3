package domain.user;

import domain.Ticket;

import java.util.Objects;

public class Passenger extends User{
    private final Ticket ticket;

    public Passenger(String name, String surName, int age, Ticket ticket) {
        super(name, surName, age);
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        return Objects.equals(ticket, passenger.ticket);
    }

    @Override
    public int hashCode() {
        return ticket != null ? ticket.hashCode() : 0;
    }
}
