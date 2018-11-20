import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {


// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

        String pathCopyFrom = "assets/my-file.txt";
        String pathCopyTo = "assets/my-file2.txt";

        if (copyFiles(pathCopyFrom, pathCopyTo)) {
            System.out.println("File copied successfully.");
        } else {
            System.out.println("File copy failed.");
        }



    }

    public static boolean copyFiles(String pathInputFrom, String pathInputTo) {


        try {
            Path filePathFrom = Paths.get(pathInputFrom);
            List<String> linesFrom = Files.readAllLines(filePathFrom);

            Path filePathTo = Paths.get(pathInputTo);
            List<String> linesTo = Files.readAllLines(filePathTo);

            linesTo.addAll(linesFrom);

            Files.write(filePathTo, linesTo);

            return true;


        } catch (Exception e) {
            return false;


        }


    }
}
