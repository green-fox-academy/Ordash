import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userInputRange, userInputGuess;


        //Choosing the range.
        System.out.println("On what range would you like to make the guess?(please input an integer)");
        try {
            //nextInt will throw InputMismatchException
            //if the next token does not match the Integer
            //regular expression, or is out of range
            userInputRange = scanner.nextInt();
            int randomNum = (int) (1 + (Math.random() * (userInputRange + 1)));

            //Guessing a number.
            System.out.println("Guess a number between 1 and " + userInputRange + "." + "(please input an integer)");
            try {


                for (int i = 4; i >= 0; i--) {
                    userInputGuess = scanner.nextInt();

                    if (randomNum > userInputGuess) {

                        if (i > 0) {
                            System.out.println("Too LOW. You have " + (i) + " try left.");
                        } else {
                            System.out.println("Sorry You LOST... The number you were looking for was " + randomNum + ".");
                        }

                    } else if (randomNum < userInputGuess) {

                        if (i > 0) {
                            System.out.println("Too HIGH. You have " + (i) + " try left.");
                        } else {
                            System.out.println("Sorry You LOST... The number you were looking for was " + randomNum + ".");
                        }

                    } else if (randomNum == userInputGuess) {
                        System.out.println("Congrats! You WON!");
                        break;
                    }

                }


            } catch (InputMismatchException exception) {

                System.out.println("This is not an integer");

            }


        } catch (InputMismatchException exception) {
            //Print "This is not an integer"
            //when user put other than integer
            System.out.println("This is not an integer");
        }


    }

}
