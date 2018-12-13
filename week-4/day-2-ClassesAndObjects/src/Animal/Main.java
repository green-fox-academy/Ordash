package Animal;

public class Main {
    public static void main(String[] args) {

        Animal fox = new Animal();

        System.out.println(fox.hunger);
        fox.eat();
        System.out.println(fox.hunger);
        fox.play();
        System.out.println(fox.hunger);
        System.out.println(fox.thirst);
    }
}
