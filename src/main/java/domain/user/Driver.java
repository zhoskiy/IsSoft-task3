package domain.user;

public class Driver extends User {
    private boolean license;

    public Driver(String name, String surName, int age, boolean license) {
        super(name, surName, age);
        checkAge(age);
        this.license = license;
    }

    private void checkAge(int age) {
        if (age <= 18) {
            throw new IllegalArgumentException("Age dont to be <= 18");
        }
    }

    public Driver(String name, String surName, int age) {
        super(name, surName, age);
        checkAge(age);
        license = false;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }
}
