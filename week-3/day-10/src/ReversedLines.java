import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        try {
            //Convert txt to Arraylist each index is a line of the text.
            List<String> dataLines = Files.readAllLines(Paths.get("assets/reversed-lines.txt"));

            reversedDecrypter(dataLines);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static void reversedDecrypter(List<String> inputPath) {

        String tempLine;
        char[] tempchar;

        for (int i = 0; i < inputPath.size(); i++) {

            tempLine = inputPath.get(i);
            tempchar = tempLine.toCharArray();

            for (int j = tempchar.length-1; j >= 0; j--) {

                System.out.print(tempchar[j]);

            }
            System.out.println();

        }





    }
}