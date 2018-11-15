package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        Ship ship1 = new Ship();

        ship1.fillShip();
        ship1.drinkOrBrawl();
        ship1.shipInfo();

        System.out.println();

        Ship ship2 = new Ship();

        ship2.fillShip();
        ship2.drinkOrBrawl();
        ship2.shipInfo();

        ship1.battle(ship2);
    }

}
