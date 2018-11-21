package AircraftCarrier;

public class Main {
    public static void main(String[] args) {

        try {
            Carrier american = new Carrier(2300, 5000);
            Carrier russian = new Carrier(3000, 4500);

            american.add(new F16());
            american.add(new F16());
            american.add(new F35());
            american.add(new F35());
            american.add(new F35());
            american.add(new F35());

            russian.add(new F16());
            russian.add(new F16());
            russian.add(new F16());
            russian.add(new F16());
            russian.add(new F35());
            russian.add(new F16());
            russian.add(new F35());

            System.out.println("American");
            american.getCarrierStatus();
            System.out.println("Russian");
            russian.getCarrierStatus();

            american.fill();
            russian.fill();

            System.out.println("American");
            american.getCarrierStatus();
            System.out.println("Russian");
            russian.getCarrierStatus();

            russian.fight(american);

            System.out.println("American");
            american.getCarrierStatus();
            System.out.println("Russian");
            russian.getCarrierStatus();

            american.fill();
            russian.fill();

            System.out.println("American");
            american.getCarrierStatus();
            System.out.println("Russian");
            russian.getCarrierStatus();

        } catch (noAmmoException ex) {
            ex.printStackTrace();
        }
    }
}
