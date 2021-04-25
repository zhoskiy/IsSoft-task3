package domain.carriage;

import domain.cargo.Cargo;
import domain.cargo.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoCarriageTest {
    public static CargoCarriage createCargoCarriageWithCargo (int capacity) {
        Cargo cargo = new Cargo(1, 1, Type.COMMON);
        CargoCarriage carriage = createCargoCarriage(capacity);
        carriage.addCargo(cargo);
        return carriage;
    }

    public static CargoCarriage createCargoCarriage (int capacity) {
        return new CargoCarriage("cargo number", capacity);
    }

    @Test
    void addCargoSuccessfully() {
        assertEquals(1, createCargoCarriageWithCargo(5).getCargos().size());
    }

    @Test
    void addCargoUnsuccessfully() {
        CargoCarriage carriage = createCargoCarriage(5);
        Cargo cargo = new Cargo(1, 6, Type.COMMON);
        carriage.addCargo(cargo);
        assertEquals(0, carriage.getCargos().size());
    }

    @Test
    void getCurrentFreeWeight() {
        int capacity = 10;
        int weight = 6;
        int expected = capacity - weight;
        CargoCarriage carriage = createCargoCarriage(capacity);
        Cargo cargo = new Cargo(1, weight, Type.COMMON);
        carriage.addCargo(cargo);
        assertEquals(expected, carriage.getCurrentFreeWeight());
    }
}