package main.java.music;

public abstract class StringedInstrument extends Instrument {
    private int numberOfStrings;



    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public abstract String sound();
}
