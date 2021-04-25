package domain.carriage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarryingCarriageTest {

    public static CarryingCarriage createCarryingCarriage(String number) {
        return new CarryingCarriage("number") {
            @Override
            public String getFullName() {
                return "full name";
            }
        };
    }

    @Test
    void hasNext() {
        assertFalse(createCarryingCarriage("n1").hasNext());
    }

    @Test
    void getNext() {
        CarryingCarriage carriage1 = createCarryingCarriage("n1");
        CarryingCarriage carriage2 = createCarryingCarriage("n2");
        carriage1.setNext(carriage2);
        assertEquals(carriage2, carriage1.getNext());
    }

    @Test
    void setNext() {
        getNext();
    }
}