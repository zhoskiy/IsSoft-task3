package domain.user;

public abstract class User {
    private final String name;
    private final String surname;

    private final int age;

    public User(String name, String surName, int age) {
        this.name = name;
        this.surname = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
