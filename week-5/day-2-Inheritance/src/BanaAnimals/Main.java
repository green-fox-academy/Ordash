package BanaAnimals;

public class Main {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal();

        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");

        System.out.println();
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        //we gonna create an Animal which is a cat

        Animal tabby = new Cat("Tabby", "Salmon", "Ball");

        acceptAnimal(tabby);
    }

    public static void acceptAnimal(Animal randomAnimal) {

        System.out.println();

        System.out.println(randomAnimal.getName());
        System.out.println(randomAnimal.favFood);

        System.out.println();

        randomAnimal.walkAround(); // The walkAround() method is defined in the Animal class but java knows
                                    // that is defined in the Cat subclass also so it will use the method in
                                    // the Cat subclass. THIS IS CALLED POLYMORPHISM!

        Cat tempCat = (Cat) randomAnimal; // we can cast from Animal to Cat like this
        System.out.println(tempCat.favToy);

        System.out.println(((Cat) randomAnimal).favToy);

        if(randomAnimal instanceof Cat) {
            System.out.println(randomAnimal.getName() + " is a Cat");
        }

    }
}
