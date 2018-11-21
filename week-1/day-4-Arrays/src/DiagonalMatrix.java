// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
//import java.util.Arrays;
public class DiagonalMatrix {


    public static void main(String[] args) {

        int[][] dimensions = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}


        };

        for( int i = 0; i<4; i++) {
            for( int j = 0; j <4; j++) {
                System.out.print(dimensions[i][j]);
            }
            System.out.println();
        }





            }

    }
