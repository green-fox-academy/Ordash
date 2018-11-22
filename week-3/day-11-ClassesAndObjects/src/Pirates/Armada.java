package Pirates;

import java.util.ArrayList;

public class Armada {

    private ArrayList<Ship> fleet = new ArrayList<>();
    private String armadaName;

    public Armada(String name) {
        this.armadaName = name;
    }

    @Override
    public String toString() {
        return "Armada{" +
                "fleet=" + fleet +
                ", armadaName='" + armadaName + '\'' +
                '}';
    }

    public void createArmada() {

        int shipCount = (int)(Math.random()*5)+5;
        for (int i = 0; i < shipCount; i++) {

            fleet.add(new Ship());
            fleet.get(i).fillShip();
            fleet.get(i).theParty();
            fleet.get(i).shipInfo();
        }
    }

    public void war(Armada anotherArmada) {

        int fleetCounter = 0;
        int anotherFleetCounter = 0;
        while (this.fleet.size() != fleetCounter && anotherArmada.fleet.size() != anotherFleetCounter) {
            boolean isWinner = this.fleet.get(fleetCounter).battle(anotherArmada.fleet.get(anotherFleetCounter));
            if (!isWinner) {
                fleetCounter++;
            } else {
                anotherFleetCounter++;
            }
        }
        if (this.fleet.size() != fleetCounter) {
            System.out.println("The winner is " + this.armadaName + "!!!!!!!!");
            System.out.println("\n");
        } else {
            System.out.println("The winner is " + anotherArmada.armadaName + "!!!!!!!!");
            System.out.println("\n");
        }
    }
}


