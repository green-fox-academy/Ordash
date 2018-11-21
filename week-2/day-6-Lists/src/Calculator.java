import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {

        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Operation? (+,-,*,/,%): ");
        String userinput1 = scanner.nextLine();
        if (userinput1.equals("+") || userinput1.equals("-") || userinput1.equals("*") || userinput1.equals("/") || userinput1.equals("%")) {

        } else {
            System.out.println("Wrong input");
        }

        System.out.println("Please insert operand 1");
        String userinput2 = scanner.nextLine();
        String number1 = userinput2;
        double operand1 = Double.parseDouble(number1);

        System.out.println("Please insert operand 2");
        String userinput3 = scanner.nextLine();
        String number2 = userinput3;
        double operand2 = Double.parseDouble(number2);

        if (userinput1.equals("+")) {

            System.out.println(userinput2 + " + " + userinput3 + " = " + (operand1+operand2));

        }
        if (userinput1.equals("-")) {

            System.out.println(userinput2 + " - " + userinput3 + " = " + (operand1-operand2));

        }
        if (userinput1.equals("*")) {

            System.out.println(userinput2 + " * " + userinput3 + " = " + (operand1*operand2));
        }
        if (userinput1.equals("/")) {

            System.out.println(userinput2 + " / " + userinput3 + " = " + (operand1/operand2));

        }
        if (userinput1.equals("%")) {

            System.out.println(userinput2 + " % " + userinput3 + " = " + (operand1/operand2));

        }


    }
}