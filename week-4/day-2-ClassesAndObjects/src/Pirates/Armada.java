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

    void createArmada() {

        int shipCount = (int) (Math.random() * 5) + 5;
        for (int i = 0; i < shipCount; i++) {

            fleet.add(new Ship());
            fleet.get(i).fillShip();
            fleet.get(i).theParty();
            fleet.get(i).shipInfo();
        }
    }

    void war(Armada anotherArmada) {

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
            System.out.println("*******************************************************");
            System.out.println("The winner of the war is " + this.armadaName + "!!!!!!!!");
            System.out.println("The average bottles of rum count what the captains drank in the fleet during the war: " + this.getAvarageAlcoholLevelOfTheCaptains());
            System.out.println("The drunkest Captain is the Captain of the " + this.getNameOFTheShipWithTheDrunkestCaptain() + ". The number of bottles he drank during the war:" + this.getMaxAlcoholLevelOfTheCaptainFromTheFleet());
            System.out.println("*******************************************************");

        } else {
            System.out.println("*******************************************************");
            System.out.println("The winner of the war is " + anotherArmada.armadaName + "!!!!!!!!");
            System.out.println("The average bottles of rum count what the captains drank in the fleet during the war: " + anotherArmada.getAvarageAlcoholLevelOfTheCaptains());
            System.out.println("The drunkest Captain is the Captain of the " + anotherArmada.getNameOFTheShipWithTheDrunkestCaptain() + ". The number of bottles he drank during the war:" + anotherArmada.getMaxAlcoholLevelOfTheCaptainFromTheFleet());
            System.out.println("*******************************************************");

        }
    }

    private double getAvarageAlcoholLevelOfTheCaptains() {
        int totalAlcoholLevel = 0;
        for (Ship ship : fleet) {
            totalAlcoholLevel += ship.getCaptainAlcoholLevel();
        }
        return (double) totalAlcoholLevel / fleet.size();
    }

    private int getMaxAlcoholLevelOfTheCaptainFromTheFleet() {
        int max = 0;
        for (Ship ship : fleet) {
            if (max < ship.getCaptainAlcoholLevel()) {
                max = ship.getCaptainAlcoholLevel();
            }
        }
        return max;
    }

    private String getNameOFTheShipWithTheDrunkestCaptain() {
        String shipName = "";
        int max = 0;
        for (Ship ship : fleet) {
            if (max < ship.getCaptainAlcoholLevel()) {
                max = ship.getCaptainAlcoholLevel();
                shipName = ship.getShipName();
            }
        }
        return shipName;
    }
}


