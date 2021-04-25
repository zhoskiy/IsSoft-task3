package domain.carriage;

import domain.cargo.Cargo;

import java.util.ArrayList;
import java.util.List;

public class CargoCarriage extends CarryingCarriage {
    private final int liftingCapacity;
    private final List<Cargo> cargos = new ArrayList<>();
    private int currentFreeWeight;

    public CargoCarriage(String numberCarriage, int liftingCapacity) {
        super(numberCarriage);
        this.liftingCapacity = liftingCapacity;
        this.currentFreeWeight = liftingCapacity;
    }

    @Override
    public String getFullName() {
        return "Cargo carriage №" + getCarriageNumber();
    }

    public void addCargo(Cargo cargo) {
        if (currentFreeWeight >= cargo.getWeight()) {
            cargos.add(cargo);
            currentFreeWeight -= cargo.getWeight();
        }
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public int getCurrentFreeWeight() {
        return currentFreeWeight;
    }
}
