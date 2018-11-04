// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int userinput = scanner.nextInt();
        int userinput2 = scanner.nextInt();

        if (userinput > userinput2) {
            System.out.println(userinput);
        } else {
            System.out.println(userinput2);
        }




    }
}

