// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
public class ChessTable {
    public static void main(String[] args) {

        int row = 8;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 ==0) {
                    System.out.print("% ");
                } else {
                    System.out.print(" %");
                }
            }
            System.out.println();

        }

    }
}
