package main.java.music;

public class Main {
    public static void main(String[] args) {

        Instrument fgdg = new Instrument("sdsdf") {
            @Override
            public void play() {
                System.out.println("sdfsdf");
            }
        };

        fgdg.play();
    }
}
