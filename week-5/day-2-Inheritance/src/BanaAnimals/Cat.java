package BanaAnimals;

public class Cat extends Animal { //This is how to copy all the methods and fields from Animal class.
                                    //This is called inheritance
    public String favToy = "Yarn"; //Only Cat has access to this field Animal does not
    public void playWith() {
        System.out.println("Yeah" + favToy);

    }
    //we can overwrite walkaround() method from Animal class because its not final
    public void walkAround() {
        System.out.println(this.getName() + " stalks around");
    }

    public String getToy() {

        return this.favToy;
    }

    public Cat() { //generic

    }

    public Cat(String name, String favFood, String favToy) {
        super(name, favFood);
        this.favToy = favToy;
    }


}
