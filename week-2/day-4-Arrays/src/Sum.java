//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class Sum {
    public static void main(String[] args) {

        int number = 3;

        System.out.println(sum(number));
        System.out.println(sum(5));

        int sumof3 = sum(number);

        System.out.println(sumof3 + 1);
    }

    public static int sum(int input) {

        int sum = 0;

        for (int i = 0; i <= input ; i++) {

            sum = sum + i;

        }

        return sum;

    }


}
