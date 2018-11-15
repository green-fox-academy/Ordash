package SharpieSet;

public class Sharpie {

    String color;
    double width;
    double inkAmount =100;

    public Sharpie(String color, double width) {

        this.color = color;
        this.width = width;


    }

    public void use() {
        inkAmount -= (Math.random()*100);


    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }
}
