// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();

        for (int i = 1; i <= userinput; i++)
        {
            for (int j = 1; j <= userinput; j++)
            {
                if (j<=i)
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
