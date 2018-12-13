package Garden;

import java.util.ArrayList;

class Garden {
    private ArrayList<Plant> plants;

    Garden() {
        plants = new ArrayList();
    }

    void addPlant(Plant plant) {
        plants.add(plant);
    }

    void checkWaterLevel() {
        for (Plant plant: plants) {
            if(plant.isThirsty()) {
                System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " needs water");
            } else {
                System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " doesnt need water");
            }

        }
    }
    void waterAll(double inputWater) {
        int count = 0;
        for (Plant plant : plants) {
            if (plant.isThirsty()) {
                count++;
            }
        }
        double sharedWater = inputWater/count;
        for (Plant plant: plants) {
            plant.water(sharedWater);
        }
        System.out.println();
        System.out.println("Watering with " +inputWater);
        checkWaterLevel();
    }
}
