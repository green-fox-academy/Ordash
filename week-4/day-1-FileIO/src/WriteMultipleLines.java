import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.


        String path = "assets/my-file2.txt";
        String word = "GreenFox";
        int numberOfLines = 10;

        multiLineWriter(path,word,numberOfLines);

    }

    public static void multiLineWriter(String pathInput, String stringInput, int linesInput) {

        List<String> content = new ArrayList<>();
        try {
            Path filePath = Paths.get(pathInput);

            for (int i = 0; i < linesInput; i++) {
                content.add(i, stringInput);

            }
            Files.write(filePath, content);


        } catch (Exception e) {
            System.out.println("An error occured");


        }


    }
}
