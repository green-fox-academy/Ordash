package Garden;

public class Plant {
    protected String color;
    protected double waterLevel;
    protected double absorb;
    protected double minWaterLevel;


    public Plant(String color, double absorb, double minWaterLevel) {
        this.color = color;
        this.waterLevel = 0;
        this.absorb = absorb;
        this.minWaterLevel = minWaterLevel;
    }

    public void water(double amountOfWater) {
        if(isThirsty()) {
            waterLevel += amountOfWater * absorb;
        }
    }

    public boolean isThirsty() {
        return waterLevel < minWaterLevel;
    }
}
