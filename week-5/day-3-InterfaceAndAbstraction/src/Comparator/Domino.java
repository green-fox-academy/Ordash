package Comparator;
import PrintableInterface.Printable;

public class Domino implements Comparable<Domino>, Printable {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino o) {
        Domino compareDomino = o;
        if (this.getLeftSide() < compareDomino.getLeftSide()) {
            return -1;
        } else {
            return 1;
        }
    }


    @Override
    public void printAllFields() {

    }
}
