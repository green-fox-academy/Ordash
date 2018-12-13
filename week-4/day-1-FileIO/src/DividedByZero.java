import java.util.Scanner;

public class DividedByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        dividesByTen(userInput);





    }

    public static void dividesByTen(int input) {

        try {
            int divided = 10/input;
            System.out.println(divided);
        } catch(ArithmeticException e) {
            System.out.println("Fail");
        }




    }
}
