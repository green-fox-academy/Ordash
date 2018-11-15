package PetrolStation;

public class Main {
    public static void main(String[] args) {


        Car honda = new Car(5,100);

        Station bp = new Station();

        System.out.println("Before refill");
        System.out.println("Gas amount of petrol station: " + bp.gasAmount);
        System.out.println("Car fuel level: " + honda.fuelLevel);

        bp.refill(honda);

        System.out.println("After refill");
        System.out.println("Gas amount of petrol station: " + bp.gasAmount);
        System.out.println("Car fuel capacity: " + honda.capacity);
        System.out.println("Car fuel level: " + honda.fuelLevel);


    }
}
