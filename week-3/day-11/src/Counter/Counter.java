package Counter;

public class Counter {

    int initialNumber;
    int actualNumber;

    public Counter(int i) {

        actualNumber = i;
        initialNumber = i;

    }
    public Counter() {

        this.initialNumber = 0;
        this.actualNumber = 0;

    }

    public void add(int j) {
        actualNumber += j;
    }

    public void add() {

        actualNumber++;
    }

    public int get() {
        return actualNumber;

    }

    public void reset() {
        actualNumber = initialNumber;

    }

}
