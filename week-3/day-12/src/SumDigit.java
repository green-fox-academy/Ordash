public class SumDigit {

    public static void main(String[] args) {


        System.out.println(sumDigits(55598));
    }

    public static int sumDigits(int n) {
        int sum = n%10;
        if(n == 0) {
            return 0;

        } else {
            return  sum + sumDigits(n /10);

        }

    }
}
