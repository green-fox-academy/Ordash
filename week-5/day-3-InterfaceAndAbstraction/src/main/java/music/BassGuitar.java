package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar(int numberOfStrings) {
        super("Bass Guitar", numberOfStrings);
    }

    public BassGuitar() {
        super("Bass Guitar", 4);
    }


    @Override
    public String sound() {
        String sound = "Duum-duum-duum";
        return sound;
    }
}
