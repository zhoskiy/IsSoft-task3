package domain.carriage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Train extends Carriage {
    private static final Logger logger = LoggerFactory.getLogger("logger");

    private final Locomotive locomotive;
    private CarryingCarriage firstCarriage;

    public Train(String numberTrain, Locomotive locomotive, CarryingCarriage firstCarriage) {
        super(numberTrain);
        this.locomotive = locomotive;
        this.firstCarriage = firstCarriage;
        logger.debug("Train created successfully");
    }

    @Override
    public String getFullName() {
        return "Train № " + getCarriageNumber();
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public CarryingCarriage getFirstCarriage() {
        return firstCarriage;
    }

    public void setFirstCarriage(CarryingCarriage firstCarriage) {
        logger.debug(this.firstCarriage.getFullName() + " was changed on " + firstCarriage.getFullName());
        this.firstCarriage = firstCarriage;
    }

    public CarryingCarriage getLastCarriage() {
        CarryingCarriage carriage = firstCarriage;
        while (carriage.hasNext()) {
            carriage = carriage.getNext();
        }
        logger.debug("Get last " + carriage.getFullName() + " of "+getFullName());
        return carriage;
    }
}
