// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {

        int userinput = 5;
        int noOfSpaces = 3;
        for (j=1; j<=noOfSpaces;j++);

        



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
