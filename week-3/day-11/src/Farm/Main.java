package Farm;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();

        for (int i = 0; i < 8; i++) {
            farm.breed();
        }


        for (int i = 0; i < farm.setOfAnimals.size(); i++) {
            System.out.println(farm.setOfAnimals.get(i).toString());
        }
        System.out.println();

        farm.eatDrinkPlay();

        System.out.println("After eat, drink and play:");
        for (int i = 0; i < farm.setOfAnimals.size(); i++) {
            System.out.println(farm.setOfAnimals.get(i).toString());
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            farm.slaugher();
        }


        System.out.println("After the slaughter:");
        for (int i = 0; i < farm.setOfAnimals.size(); i++) {
            System.out.println(farm.setOfAnimals.get(i).toString());
        }
        System.out.println();

        farm.breed();
        farm.breed();

        System.out.println("After the re-breed:");
        for (int i = 0; i < farm.setOfAnimals.size(); i++) {
            System.out.println(farm.setOfAnimals.get(i).toString());
        }
    }
}
