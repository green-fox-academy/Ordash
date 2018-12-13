package AircraftCarrier;

public class Main {
    public static void main(String[] args) {

        try {
            Carrier american = new Carrier(1400, 10000);
            Carrier russian = new Carrier(1500, 9000);

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

        } catch (NoAmmoException ex) {
            ex.printStackTrace();
        }
    }
}
