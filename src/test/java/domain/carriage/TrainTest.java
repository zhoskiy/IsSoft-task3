package domain.carriage;

import domain.user.DriverTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {
    @Test
    void getLastCarriage() {
        Locomotive locomotive = new Locomotive("n1", DriverTest.createDriverWithLicense(20));
        CargoCarriage carriage = CargoCarriageTest.createCargoCarriageWithCargo(10);
        PassengerCarriage passengerCarriage = PassengerCarriageTest.createPassengerCarriage("number", 10);
        Train train = new Train("number", locomotive, carriage);
        train.getLastCarriage().setNext(passengerCarriage);
        assertEquals(passengerCarriage, train.getLastCarriage());
    }
}