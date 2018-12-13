import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        try {
            //Convert txt to Arraylist each index is a line of the text.
            List<String> dataLines = Files.readAllLines(Paths.get("assets/duplicated-chars.txt"));

            removeDuplicateChar(dataLines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void removeDuplicateChar(List<String> inputLines) {

        String tempLine;
        char[] tempChar;

        for (int j = 0; j < inputLines.size(); j++) {  //lines >> charArray
            tempLine = inputLines.get(j);
            tempChar = tempLine.toCharArray();
            for (int i = 0; i < tempChar.length; i++) { //Print every second char

                if (i % 2 == 0) {
                    System.out.print(tempChar[i]);

                }

            }
            System.out.println();
        }

    }
}
