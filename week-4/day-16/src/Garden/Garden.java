package Garden;

import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants;

    public Garden() {
        plants = new ArrayList();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }


    public void checkWaterLevel() {
        for (Plant plant: plants) {
            if(plant.isThirsty()) {
                System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " needs water");
            } else {
                System.out.println("The " + plant.color + " " + plant.getClass().getSimpleName() + " doesnt need water");
            }

        }
    }
    public void waterAll(double inputWater) {
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
