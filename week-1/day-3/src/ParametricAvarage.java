// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
import java.util.Scanner;

public class ParametricAvarage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter positive numbers:");


        double sumOfNumbers = 0;
        double avarageOfNumbers = 0;


        for (int i = 1; i <= 5; i++) {

            double number = scanner.nextInt();
            sumOfNumbers += number;
            avarageOfNumbers = sumOfNumbers /5;
        }

        System.out.println("The sum is: " + sumOfNumbers);
        System.out.println("The avarage is: " + avarageOfNumbers);



    }
}

