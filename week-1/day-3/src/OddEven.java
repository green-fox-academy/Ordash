// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int userinput = scanner.nextInt();

        if ((userinput%2)==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }



    }
}