import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Logs {
    public static void main(String[] args) {

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.


        //Path filepath = Paths.get("assets/LogSrc.txt");
        //List<String> lines = Files.readAllLines(filepath);
        //can be shortened like this:
        // List<String> dataLines = Files.readAllLines(Paths.get("assets/LogSrc.txt"));


        try {
            List<String> dataLines = Files.readAllLines(Paths.get("assets/LogSrc.txt"));
            System.out.println(uniqueIP(dataLines));
            System.out.println(getPostRatio(dataLines));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static double getPostRatio(List<String> dataInput) {

        double get = 0;
        double post = 0;
        double ratio = 0;
        for (int i = 0; i < dataInput.size(); i++) {
            if (dataInput.get(i).contains("GET")) {
                get++;

            } else if (dataInput.get(i).contains("POST")) {
                post++;
            }

        }
        ratio = get/post;
        return ratio;


    }

    public static ArrayList<String> uniqueIP(List<String> ArrayInput) {

        String ipV4 = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
        ArrayList<String> IPlist = new ArrayList<>();
        for (int i = 0; i < ArrayInput.size(); i++) {

            if(!IPlist.contains(regexChecker(ipV4, ArrayInput.get(i)))) {
                IPlist.add(regexChecker(ipV4, ArrayInput.get(i)));
            }
        }

        return IPlist;




    }
    public static String regexChecker(String theRegex, String strToCheck) {

        Pattern checkRegex = Pattern.compile(theRegex);

        Matcher regexMatcher = checkRegex.matcher(strToCheck);

        while(regexMatcher.find()) {

            if (regexMatcher.group().length() !=0) {

                return (regexMatcher.group().trim());
            }

        }

        return "0";
    }
}
