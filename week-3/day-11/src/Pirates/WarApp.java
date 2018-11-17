package Pirates;

public class WarApp {
    public static void main(String[] args) {


        Armada theFigthers = new Armada("The Reapers");
        Armada theAlcoholics = new Armada("The Alcoholics");
        theFigthers.createArmada();
        theAlcoholics.createArmada();

        theFigthers.war(theAlcoholics);
        System.out.println(theAlcoholics);

    }
}
