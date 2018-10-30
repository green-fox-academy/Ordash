import java.util.Scanner; // <---- Loads the input scanner
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in); // <-----Creates Scanner

        System.out.println("Please type distance in Kilometers: ");
        // The program stops and waits for user input and to press enter
        int userInput1 = scanner.nextInt();
        int inMiles = ((userInput1 * 16) / 10);


        System.out.println("Distance in Miles: " + inMiles);


    }
}