package Pirates;

import java.util.ArrayList;

public class Ship {
    ArrayList<Pirate> ship = new ArrayList<>();

    @Override
    public String toString() {
        return "Ship{" +
                "ship=" + ship +
                '}';
    }


    public int shipScore() {

        // calculating score: alive pirates * 10+captain rum level
        int shipScore = shipInfo() * (10+ship.get(0).lvlOfRum);
        return shipScore;

    }
    public void battle(Ship anotherShip) {

        if (this.shipScore() > anotherShip.shipScore()) {
            this.win();
            anotherShip.lose();
        } else {
            anotherShip.win();
            this.lose();
        }

    }

    public void win() {
        for (int i = 0; i < ship.size(); i++) {
            ship.get(i).drinkSomeRum();
        }

    }

    public void lose() {
        for (int i = 0; i < ship.size(); i++) {
            int loseRandom = (int)(Math.random()*10)+1;
            if (loseRandom < 30) {
                ship.get(i).die();
            }
        }
    }

    public int shipInfo() {
        //Count the dead and the passed out
        int deadCount = 0;
        int passedOutCount = 0;
        int aliveCount;
        for (int i = 0; i < ship.size(); i++) {
            if(ship.get(i).isDead == true) {
                deadCount++;
            } else if (ship.get(i).isPassedOut == true) {
                passedOutCount++;
            }
        }
        aliveCount = ship.size()-deadCount-passedOutCount;
        System.out.println("Ship info: \n");
        System.out.println("Total number of pirates on the ship: " + ship.size());
        System.out.println("The number of bottles of rum what the captain drank: " + ship.get(0).lvlOfRum);
        System.out.println("Number of pirates who died from intoxication or brawling: " + deadCount);
        System.out.println("Number of pirates who passed out from drinking too much or brawling: " + passedOutCount);
        System.out.println("Number of pirates who is alive and not passed out: " + aliveCount);
        return aliveCount;
    }

    public void fillShip() {

        //add captain and set lvlOfRum
        ship.add(new Pirate(true));
        ship.get(0).lvlOfRum = 2;



        int randomCrew = (int) (Math.random()*(20)+20);
        for (int i = 0; i < randomCrew; i++) {
            ship.add(new Pirate(false));
        }

    }

    public void drinkOrBrawl() {

        int drinkOrBrawl;
        int howManyTimes;
        int whichPirate;
        for (int i = 0; i < ship.size(); i++) {
            drinkOrBrawl = (int)(Math.random()*(10)+1);
            whichPirate = (int)(Math.random()*(ship.size()-1)+1);
            howManyTimes = (int)(Math.random()*(3)+1);
            for (int j = 0; j < howManyTimes; j++) {

                if (drinkOrBrawl > 3) {
                    ship.get(i).howIsItGoingMate();
                } else if (drinkOrBrawl <= 3 && whichPirate != i) {
                    ship.get(i).brawl(ship.get(whichPirate));
                }
            }
        }

    }
}
