package domain.carriage;

import domain.user.Driver;

public class Locomotive extends Carriage {
    private Driver driver;

    public Locomotive(String numberCarriage, Driver driver) {
        super(numberCarriage);
        checkDriverLicense(driver);
        this.driver = driver;
    }

    private void checkDriverLicense(Driver driver) {
        if (!driver.isLicense()) {
            throw new IllegalArgumentException("Driver must be with license");
        }
    }

    @Override
    public String getFullName() {
        return "Locomotive №" + getCarriageNumber();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
