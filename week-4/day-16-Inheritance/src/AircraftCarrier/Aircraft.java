package AircraftCarrier;

public class Aircraft {
    protected int ammo;
    protected int maxAmmo;
    protected int baseDamage;
    protected String type;

    public Aircraft(int maxAmmo, int baseDamage, String type) {
        this.ammo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.type = type;
    }

    public int getAmmo() {
        return ammo;
    }

    public int allDamage() {
        return ammo * baseDamage;
    }

    public int fight() {
        int dmgDealt = ammo * baseDamage;
        ammo = 0;
        return dmgDealt;
    }

    public int refill(int num) {
        if (num > maxAmmo) {
            int remainingAmmo = num - maxAmmo;
            ammo = maxAmmo;
            return remainingAmmo;
        }
        ammo = num;
        return 0;

    }

    public String getType() {
        return type;
    }

    public void getStatus() {
        System.out.format("Type %s, Ammo: %d, Base Damage: %d, All Damage: " + allDamage(), type, ammo, baseDamage);
        System.out.println();
    }

    public boolean isPriority() {
        return type.equals("F35");
    }
}
