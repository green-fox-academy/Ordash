public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(recursiveNumberAdder(6));
    }


    public static int recursiveNumberAdder(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n + recursiveNumberAdder(n-1);
        }



    }
}
