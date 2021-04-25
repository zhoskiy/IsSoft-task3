package domain.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;

import static org.junit.jupiter.api.Assertions.*;

public class DriverTest {

    @Test
    void checkAnyAgesWithoutException() {
        createDriver(20);
        createDriver(19);
    }

    @Test
    void checkAnyAgesWithException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    createDriver(17);
                    createDriver(18);
                }
        );
    }

    public static Driver createDriverWithLicense (int age) {
        Driver driver = createDriver(age);
        driver.setLicense(true);
        return driver;
    }
    public static Driver createDriver (int age) {
        String name = "name";
        String surname = "surname";
        return new Driver(name, surname, age);
    }

}