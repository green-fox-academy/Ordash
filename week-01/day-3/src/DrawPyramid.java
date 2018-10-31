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
        int row,temp,c,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        temp = n;
        for ( row = 1 ; row <= n ; row++ )
        {
            for ( c = 1 ; c < temp ; c++ )
                System.out.print(" ");

            temp--;

            for ( c = 1 ; c <= 2*row - 1 ; c++ )
                System.out.print("*");

            System.out.println("");
        }
    }

}
