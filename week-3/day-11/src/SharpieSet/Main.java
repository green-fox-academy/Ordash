package SharpieSet;

public class Main {
    public static void main(String[] args) {

        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.sharpieAdder(new Sharpie("black", 0.5));
        sharpieSet.sharpieAdder(new Sharpie("orange", 0.2));
        sharpieSet.sharpieAdder(new Sharpie("blue", 0.2));
        sharpieSet.sharpieAdder(new Sharpie("red", 0.5));

        for (int j = 0; j < sharpieSet.setOfSharpies.size(); j++) {
            sharpieSet.setOfSharpies.get(j).use();
        }

        System.out.println("Useable sharpies after first use: " + sharpieSet.countUsable());

        for (int j = 0; j < sharpieSet.setOfSharpies.size(); j++) {
            sharpieSet.setOfSharpies.get(j).use();
        }

        System.out.println("Useable sharpies after second use: " + sharpieSet.countUsable());

        sharpieSet.removeTrash();

        for (int k = 0; k < sharpieSet.setOfSharpies.size(); k++) {
            System.out.println(sharpieSet.setOfSharpies.get(k).toString());
        }



    }

}
