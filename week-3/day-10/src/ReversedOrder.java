import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        try {
            //Convert txt to Arraylist each index is a line of the text.
            List<String> dataLines = Files.readAllLines(Paths.get("assets/reversed-order.txt"));
            reversedOrderDecrypter(dataLines);

        } catch (IOException e){
            e.printStackTrace();

        }

    }
    public static void reversedOrderDecrypter(List<String> inputLines) {


        for (int i = inputLines.size()-1; i >= 0; i--) {

            System.out.println(inputLines.get(i));

        }



    }
}