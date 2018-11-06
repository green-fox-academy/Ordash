import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class PowerOfThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int thorX = initialTX;
        int thorY = initialTY;


        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String directionX = "";
            String directionY = "";
            if (thorY > lightY ) {
                directionY = "N";
            }
            else if ( thorY < lightY ) {
                directionY = "W";
            }
            if ( thorX < lightX ) {
                directionX = "S";
            }
            else if ( thorX > lightX ){
                directionX = "W";
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(directionY + directionX);
        }

    }
}