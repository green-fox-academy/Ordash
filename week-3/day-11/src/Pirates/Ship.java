package Pirates;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> crew = new ArrayList<>();
    private String shipName;


    public Ship(String name) {
        this.shipName = name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "crew=" + crew +
                '}';
    }

    private int shipScore() {
        // calculating score: alive pirates * 10+captain rum level
        return calculateAliveCount() * (5 + crew.get(0).getLevelOfRum());


    }

    public boolean battle(Ship anotherShip) {

        if (this.shipScore() > anotherShip.shipScore()) {
            this.win();
            anotherShip.lose();
            return true;

        } else {
            anotherShip.win();
            this.lose();
            return false;
        }

    }

    private void win() {
        for (int i = 0; i < crew.size(); i++) {
            crew.get(i).drinkSomeRum();
        }
        if (crew.get(0).getLevelOfRum() > 10) {
            crew.get(0).passOut();
        }

    }

    private void lose() {
        for (int i = 1; i < crew.size()-1; i++) {
            int loseRandom = (int) (Math.random() * 100) + 1;
            if (loseRandom < 30) {
                crew.get(i).die();
            }
        }
    }

    public void shipInfo() {
        //Count the dead and the passed out

        System.out.println("Ship info: " + this.shipName + "\n");
        System.out.println("Total number of pirates on the crew: " + crew.size());
        System.out.println("The number of bottles of rum what the captain drank: " + crew.get(0).getLevelOfRum());
        System.out.println("Number of pirates who died from intoxication or brawling: " + calculateDeadCount());
        System.out.println("Number of pirates who passed out from drinking too much or brawling: " + calculatePassedOutCount());
        System.out.println("Number of pirates who is alive and not passed out: " + calculateAliveCount());
        System.out.println("SHIP SCORE: " + shipScore() + "\n");
    }

    private int calculatePassedOutCount() {
        int passedOutCount = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).isPassedOut() && !crew.get(i).isDead()) {
                passedOutCount++;
            }

        }
        return passedOutCount;
    }

    private int calculateDeadCount() {
        int deadCount = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).isDead()) {
                deadCount++;
            }
        }
        return deadCount;
    }

    private int calculateAliveCount() {
        return crew.size() - calculateDeadCount() - calculatePassedOutCount();
    }

    public void fillShip() {

        //add captain and with a base rum level 2
        crew.add(new Pirate(true));

        int randomCrew = (int) (Math.random() * (5) + 5);
        for (int i = 0; i < randomCrew; i++) {
            crew.add(new Pirate(false));
        }

    }

    private Pirate getRandomPirate() {
        return crew.get((int) (Math.random() * (crew.size() - 1) + 1));
    }


    public void theParty() {

        int drinkOrBrawl;
        int howManyTimes;
        for (int i = 0; i < crew.size(); i++) {
            drinkOrBrawl = (int) (Math.random() * (10) + 1);
            howManyTimes = (int) (Math.random() * (3) + 1);
            for (int j = 0; j < howManyTimes; j++) {

                if (drinkOrBrawl > 3) {
                    crew.get(i).howIsItGoingMate();
                } else if (drinkOrBrawl < 3 && getRandomPirate() != crew.get(i)) {
                    crew.get(i).brawl(getRandomPirate());
                }
            }
        }
    }
}
