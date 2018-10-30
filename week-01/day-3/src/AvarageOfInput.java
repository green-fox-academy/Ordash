// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
import java.util.Scanner;
public class AvarageOfInput {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a positive number:");


        int sumOfNumbers = 0;
        int avarageOfNumbers = 0;


        for (int i = 1; i <= 5; i++) {

            int number = scanner.nextInt();
            sumOfNumbers = sumOfNumbers + number;
            avarageOfNumbers = sumOfNumbers /5;
        }

        System.out.println("The sum is: " + sumOfNumbers);
        System.out.println("The avarage is: " + avarageOfNumbers);



    }
}