package AircraftCarrier;

import java.util.ArrayList;

class Carrier {

    private int healthPoint;
    private int storeOfAmmo;
    private ArrayList<Aircraft> squad;

    Carrier(int storeOfAmmo, int healthPoint) {
        squad = new ArrayList<>();
        this.storeOfAmmo = storeOfAmmo;
        this.healthPoint = healthPoint;
    }

    void add(Aircraft aircraft) {
        squad.add(aircraft);
    }

    private int totalSquadAmmoCapacity() {
        int capacity = 0;
        for (Aircraft aircraft : squad) {
            capacity += aircraft.maxAircraftAmmo;
        }
        return capacity;
    }

    void fill() throws noAmmoException {

        if (storeOfAmmo <= 0) {
            throw new noAmmoException("No ammo");
        }
        if (storeOfAmmo > totalSquadAmmoCapacity()) {
            for (Aircraft aircraft : squad) {
                storeOfAmmo = aircraft.refill(storeOfAmmo);
            }
            return;
        }
        for (Aircraft aircraft : squad) {
            if (aircraft.isPriority()) {
                storeOfAmmo = aircraft.refill(storeOfAmmo);
            }
        }
        for (Aircraft aircraft : squad) {
            if (!aircraft.isPriority()) {
                storeOfAmmo = aircraft.refill(storeOfAmmo);
            }
        }
    }

    private int totalSquadDamage() {

        int totalSquadDamage = 0;
        for (Aircraft aircraft : squad) {
            totalSquadDamage += aircraft.allDamage();
        }
        return totalSquadDamage;
    }

    void fight(Carrier anotherCarrier) {
        for (Aircraft aircraft : squad) {
            anotherCarrier.healthPoint -= aircraft.fight();
        }
    }

    void getCarrierStatus() {
        System.out.println();
        System.out.println("HP: " + this.healthPoint + ", Aircraft count: " + squad.size() + ", Ammo Storage: " + this.storeOfAmmo + ", Total damage: " + this.totalSquadDamage());
        System.out.println("Aircrafts:");
        for (Aircraft aircraft : squad) {
            aircraft.getStatus();
        }
        System.out.println();
    }
}
