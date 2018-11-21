package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {

    private int healthPoint;
    private int storeOfAmmo;
    private ArrayList<Aircraft> squad;

    public Carrier(int storeOfAmmo, int healthPoint) {
        squad = new ArrayList<>();
        this.storeOfAmmo = storeOfAmmo;
        this.healthPoint = healthPoint;
    }

    public void add(Aircraft aircraft) {
        squad.add(aircraft);
    }

    public int totalSquadAmmoCapacity() {
        int capacity = 0;
        for (Aircraft aircraft : squad) {
            capacity += aircraft.maxAmmo;
        }
        return capacity;
    }

    public void fill() throws noAmmoException {

        if (storeOfAmmo <= 0) {
            throw new noAmmoException("No ammo");
        }
        if (storeOfAmmo > totalSquadAmmoCapacity()) {
            for (Aircraft aircraft : squad) {
                storeOfAmmo = aircraft.refill(storeOfAmmo);
            }
        } else if (storeOfAmmo < totalSquadAmmoCapacity()) {
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

    }


    public int totalSquadDamage() {

        int totalSquadDamage = 0;
        for (Aircraft aircraft : squad) {
            totalSquadDamage += aircraft.allDamage();
        }
        return totalSquadDamage;
    }

    public void fight(Carrier anotherCarrier) {
        for (Aircraft aircraft : squad) {
            anotherCarrier.healthPoint -= aircraft.fight();
        }
    }

    public void getCarrierStatus() {
        System.out.println();
        System.out.println("HP: " + this.healthPoint + ", Aircraft count: " + squad.size() + ", Ammo Storage: " + this.storeOfAmmo + ", Total damage: " + this.totalSquadDamage());
        System.out.println("Aircrafts:");
        for (Aircraft aircraft : squad) {
            aircraft.getStatus();
        }
        System.out.println();
    }
}
