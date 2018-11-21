import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rows should the pyramid have?: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++) {

            for(int j = i; j < number; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k < (i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
