package main.java.music;

public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }


    @Override
    public String sound() {
        String sound = "Twang";
        return sound;
    }
}
