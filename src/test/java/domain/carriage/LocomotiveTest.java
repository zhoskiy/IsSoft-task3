package domain.carriage;

import domain.user.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import domain.user.DriverTest;

class LocomotiveTest {

    @Test
    void createLocomotiveWithDriverLicenseSuccessfully() {
        new Locomotive("n1", DriverTest.createDriverWithLicense(20));
    }

    @Test
    void createLocomotiveWithDriverLicenseUnSuccessfully() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    new Locomotive("n1", DriverTest.createDriver(20));
                }
        );
    }

}