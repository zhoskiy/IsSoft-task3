package domain.carriage;

public abstract class CarryingCarriage extends Carriage {
    private CarryingCarriage carryingCarriage;

    public CarryingCarriage(String numberCarriage) {
        super(numberCarriage);
        carryingCarriage = null;
    }

    public boolean hasNext() {
        return carryingCarriage != null;
    }

    public CarryingCarriage getNext() {
        return carryingCarriage;
    }

    public void setNext(CarryingCarriage carryingCarriage) {
        this.carryingCarriage = carryingCarriage;
    }
}
