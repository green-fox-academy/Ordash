package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        Ship ship1 = new Ship();

        ship1.fillShip();
        ship1.theParty();
        ship1.shipInfo();

        Ship ship2 = new Ship();

        ship2.fillShip();
        ship2.theParty();
        ship2.shipInfo();

        ship1.battle(ship2);


        ship1.shipInfo();
        ship2.shipInfo();
    }

}
