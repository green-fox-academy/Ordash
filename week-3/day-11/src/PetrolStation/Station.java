package PetrolStation;

public class Station {

    int gasAmount;

    public Station() {
        this.gasAmount = 500000;

    }


    public void refill(Car car) {
        gasAmount = gasAmount - (car.capacity-car.fuelLevel);
        car.fuelLevel = car.capacity;

    }
}
