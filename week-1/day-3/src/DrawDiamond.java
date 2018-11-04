import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        int row,asterisk, space;

        for ( row = 0; row <=10; row++)
        {
            for ( space = 0; space <=10-row; space++)
            {
                System.out.print(" ");
            }

            for ( asterisk = 0; asterisk <= row; asterisk++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        for ( row = 9; row >=0; row--)
        {
            for ( space = 0; space <=10-row; space++)
            {
                System.out.print(" ");
            }

            for ( asterisk = 0; asterisk <= row; asterisk++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }



    }
}