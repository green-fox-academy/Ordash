package Garden;

class Plant {
    String color;
    private double waterLevel;
    private double absorb;
    private double minWaterLevel;


    Plant(String color, double absorb, double minWaterLevel) {
        this.color = color;
        this.waterLevel = 0;
        this.absorb = absorb;
        this.minWaterLevel = minWaterLevel;
    }

    void water(double amountOfWater) {
        if(isThirsty()) {
            waterLevel += amountOfWater * absorb;
        }
    }

    boolean isThirsty() {
        return waterLevel < minWaterLevel;
    }
}
