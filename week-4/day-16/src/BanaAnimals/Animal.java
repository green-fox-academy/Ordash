package BanaAnimals;

public class Animal { //Animal is the superclass and we gonna make subclasses or copies of the superclass
    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName) {//protected means only the subclasses will get access to this method
                                                        // it is important for inheritance
                                                    // final means other subclasses cannot overwrite
                                                     // this method even tho the method name in the subclass gonna be the same.
        this.name = newName;
    }

    protected final String getName() {
        return this.name;
    }

    public void eatStuff() {
        System.out.println("yum" + favFood);
    }

    public void walkAround() {
        System.out.println(this.name + " walk around");
    }

    public Animal() {


    }

    public Animal(String name, String favFood) {
        this.changeName(name);
        this.favFood = favFood;
    }
}
