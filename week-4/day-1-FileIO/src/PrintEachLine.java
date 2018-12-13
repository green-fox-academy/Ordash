import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"

        try{
            Path filepath = Paths.get("assets/my-file.txt");
            List<String> lines = Files.readAllLines(filepath);



            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));

            }
//            int iteration = 0;
//            while(lines.size() >0)
//            System.out.println(lines.get(iteration));
//            iteration++;

        } catch (Exception e) {
            System.out.println("File is not readable.");

        }

    }
}