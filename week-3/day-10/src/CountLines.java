import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        String userInputPath = "assets/my-file.txt";

        System.out.println("The number lines this file contains: " + lineCounter(userInputPath) + ".");

    }
    public static int lineCounter(String inputPath) {

        int numberOfLines = 0;
        try {
            Path filepath = Paths.get(inputPath);
            List<String> lines = Files.readAllLines(filepath);

            for (int i = 0; i < lines.size(); i++) {
                numberOfLines = i;
            }
            return numberOfLines;

        } catch (Exception e){
            return 0;


        }



    }
}
