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

    public void fill() {
        if (storeOfAmmo > 500) {
            for (Aircraft aircraft : squad) {
                storeOfAmmo = aircraft.refill(storeOfAmmo);
            }
        } else if (storeOfAmmo > 0) {
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
        } else {
            try {
                for (Aircraft aircraft : squad) {
                    storeOfAmmo = aircraft.refill(storeOfAmmo);
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    public int totalSquadAmmo() {
        int totalSquadAmmo = 0;
        for (Aircraft aircraft : squad) {
            totalSquadAmmo += aircraft.ammo;
        }
        return totalSquadAmmo;
    }
    public int totalSquadDamage() {

        int totalSquadDamage = 0;
        for (Aircraft aircraft : squad) {
            totalSquadDamage += aircraft.allDamage();
        }
        return totalSquadDamage;

    }
    public void fight(Carrier anotherCarrier) {
        anotherCarrier.healthPoint -= this.totalSquadAmmo();

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
