package Pirates;

public class WarApp {
    public static void main(String[] args) {


        Armada dipsomaniacs = new Armada("The Dipsomaniacs");
        Armada pissheads = new Armada("The Pissheads");
        dipsomaniacs.createArmada();
        pissheads.createArmada();

        dipsomaniacs.war(pissheads);
    }
}
