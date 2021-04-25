package domain.cargo;

public class Cargo {
    private final int number;
    private final int weight;
    private final Type type;

    public Cargo(int number, int weight, Type type) {
        this.number = number;
        this.weight = weight;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public Type getType() {
        return type;
    }
}
