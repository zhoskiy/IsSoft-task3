package domain.carriage;

public abstract class Carriage {
    private final String numberCarriage;

    public Carriage(String numberCarriage) {
        this.numberCarriage = numberCarriage;
    }

    public String getCarriageNumber() {
        return numberCarriage;
    }

    public abstract String getFullName();
}
