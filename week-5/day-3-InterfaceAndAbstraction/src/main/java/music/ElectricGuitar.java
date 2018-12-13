package main.java.music;

public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }

    Instrument dsfs = new Instrument("efefe") {
        @Override
        public void play() {
            System.out.println("sdfsdf");
        }
    };

    @Override
    public String sound() {
        String sound = "Twang";
        return sound;
    }
}
