package Farm;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    public void eat() {
        hunger--;

    }

    public void drink() {
        thirst--;

    }

    public void play() {
        hunger++;
        thirst++;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}
