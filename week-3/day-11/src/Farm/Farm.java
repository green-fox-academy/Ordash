package Farm;

import java.util.ArrayList;

public class Farm {
    ArrayList<Animal> setOfAnimals = new ArrayList<>();


    public void breed() {

        if (setOfAnimals.size() < 10) {

            setOfAnimals.add(new Animal());
        }
    }

    public void slaugher() {

        int minHunger = setOfAnimals.get(0).hunger;
        int minHungerIndex = 0;

        for (int i = 0; i < setOfAnimals.size(); i++) {
            if (setOfAnimals.get(i).hunger < minHunger) {
                minHunger = setOfAnimals.get(i).hunger;
                minHungerIndex = i;
            }
        }
        setOfAnimals.remove(minHungerIndex);
    }

    public void eatDrinkPlay() {

        //Each animal will eat, drink and play for random amount of times.
        int tempRandom;
        for (int i = 0; i < setOfAnimals.size(); i++) {
            tempRandom = (int) (Math.random() * 20);
            for (int j = 0; j < tempRandom; j++) {
                setOfAnimals.get(i).eat();
            }
            tempRandom = (int) (Math.random() * 20);
            for (int k = 0; k < tempRandom; k++) {
                setOfAnimals.get(i).drink();
            }
            tempRandom = (int) (Math.random() * 10);
            for (int l = 0; l < tempRandom; l++) {
                setOfAnimals.get(i).play();
            }
        }
    }
}
