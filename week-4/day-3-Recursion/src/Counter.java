public class Counter {
    public static void main(String[] args) {

        recursiveCounter(6);

    }
    public static void recursiveCounter(int n) {
        System.out.println(n);
        if (n == 0) {
            return;
        } else {
            recursiveCounter(n-1);
        }

    }
}
