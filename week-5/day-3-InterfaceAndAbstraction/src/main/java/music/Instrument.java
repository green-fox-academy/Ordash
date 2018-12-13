package main.java.music;

public abstract class Instrument {
    String name;

    Instrument(String name) {
        this.name = name;
    }

    public abstract void play();


}
