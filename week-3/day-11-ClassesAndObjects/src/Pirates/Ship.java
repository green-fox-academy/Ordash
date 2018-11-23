package Pirates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ship {
    private ArrayList<Pirate> crew = new ArrayList<>();
    private String shipName;
    private static List<String> alreadyNames = new ArrayList<>();


    Ship() {
        this.shipName = getShipName((int)(Math.random()*32)+1);

    }

    @Override
    public String toString() {
        return "Ship{" +
                "crew=" + crew +
                '}'+"\n";
    }

    private int shipScore() {
        // calculating score: alive pirates * 10+captain rum level
        return calculateAliveCount() * (5 + crew.get(0).getLevelOfRum());


    }

    boolean battle(Ship anotherShip) {

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
        for (Pirate aCrew : crew) {
            aCrew.drinkSomeRum();
        }
        if (crew.get(0).getLevelOfRum() > 10) {
            crew.get(0).passOut();
        }

    }

    private void lose() {
        for (int i = 1; i < crew.size() - 1; i++) {
            int loseRandom = (int) (Math.random() * 100) + 1;
            if (loseRandom < 30) {
                crew.get(i).die();
            }
        }
    }

    void shipInfo() {
        //Count the dead and the passed out

        System.out.println("Ship: " + this.shipName + "\n");
        System.out.println("Total number of pirates on the crew: " + crew.size());
        System.out.println("The number of bottles of rum what the captain drank: " + crew.get(0).getLevelOfRum());
        System.out.println("Number of pirates who died from intoxication or brawling: " + calculateDeadCount());
        System.out.println("Number of pirates who passed out from drinking too much or brawling: " + calculatePassedOutCount());
        System.out.println("Number of pirates who is alive and not passed out: " + calculateAliveCount());
        System.out.println("SHIP SCORE: " + shipScore() + "\n");
    }

    private int calculatePassedOutCount() {
        int passedOutCount = 0;
        for (Pirate aCrew : crew) {
            if (aCrew.isPassedOut() && !aCrew.isDead()) {
                passedOutCount++;
            }

        }
        return passedOutCount;
    }

    private int calculateDeadCount() {
        int deadCount = 0;
        for (Pirate aCrew : crew) {
            if (aCrew.isDead()) {
                deadCount++;
            }
        }
        return deadCount;
    }

    private int calculateAliveCount() {
        return crew.size() - calculateDeadCount() - calculatePassedOutCount();
    }

    void fillShip() {

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


    void theParty() {

        int drinkOrBrawl;
        int howManyTimes;
        for (Pirate aCrew : crew) {
            drinkOrBrawl = (int) (Math.random() * (10) + 1);
            howManyTimes = (int) (Math.random() * (3) + 1);
            for (int j = 0; j < howManyTimes; j++) {

                if (drinkOrBrawl > 3) {
                    aCrew.howIsItGoingMate();
                } else if (drinkOrBrawl < 3 && getRandomPirate() != aCrew) {
                    aCrew.brawl(getRandomPirate());
                }
            }
        }
    }

    private List<String> readShipNames() {


        List<String> dataLines = new ArrayList<>();

        try {
            dataLines = Files.readAllLines(Paths.get("shipnames.txt"));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is not readable");
        }
        return dataLines;
    }

    public String getShipName() {
        return shipName;
    }

    private String getShipName(int random) {

        String tempShip = readShipNames().get(random);
        if(!alreadyNames.contains(tempShip)) {
            alreadyNames.add(tempShip);
            return tempShip;
        } else {
            return getShipName((int)(Math.random()*32)+1);
        }
    }

    int getCaptainAlcoholLevel() {
        return this.crew.get(0).getLevelOfRum();
    }
}
