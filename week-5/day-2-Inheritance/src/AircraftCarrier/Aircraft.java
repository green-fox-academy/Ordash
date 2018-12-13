package AircraftCarrier;

class Aircraft {
    private int ammo;
    int maxAircraftAmmo;
    private int baseDamage;
    private String type;

    Aircraft(int maxAmmo, int baseDamage, String type) {
        this.ammo = 0;
        this.maxAircraftAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.type = type;
    }

    int allDamage() {
        return ammo * baseDamage;
    }

    int fight() {
        int dmgDealt = ammo * baseDamage;
        ammo = 0;
        return dmgDealt;
    }

    int refill(int num) {
        if (num > maxAircraftAmmo) {
            int remainingAmmo = num - maxAircraftAmmo;
            ammo = maxAircraftAmmo;
            return remainingAmmo;
        }
        ammo = num;
        return 0;
    }

    void getStatus() {
        System.out.format("Type %s, Ammo: %d, Base Damage: %d, All Damage: " + allDamage(), type, ammo, baseDamage);
        System.out.println();
    }

    boolean isPriority() {
        return type.equals("F35");
    }
}
