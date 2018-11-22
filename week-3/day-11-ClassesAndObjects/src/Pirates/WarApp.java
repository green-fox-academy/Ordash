package Pirates;

public class WarApp {
    public static void main(String[] args) {


        Armada theFighters = new Armada("The Drunks");
        Armada theAlcoholics = new Armada("The Alcoholics");
        theFighters.createArmada();
        theAlcoholics.createArmada();

        theFighters.war(theAlcoholics);
        System.out.println(theAlcoholics);

    }
}
