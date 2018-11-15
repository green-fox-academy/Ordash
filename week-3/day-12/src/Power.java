public class Power {
    public static void main(String[] args) {
        System.out.println(recursiveToPower(3,4));
    }
    public static int recursiveToPower(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            n--;
            return base * recursiveToPower(base, n);
        }

    }
}
