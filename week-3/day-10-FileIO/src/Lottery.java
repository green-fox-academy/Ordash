import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv

        findTheMostCommonNumbers("assets/lottery.txt");

    }

    public static void findTheMostCommonNumbers(String filePath) {

        try {
            List<String> dataLines = Files.readAllLines(Paths.get(filePath));

            ArrayList<String> nums = new ArrayList<>();
            String[] tempLine;

            for (int i = 0; i < dataLines.size(); i++) {
                tempLine = dataLines.get(i).split(";"); // line split by ";" and saved the elements in tempLine array
                for (int j = tempLine.length - 5; j < tempLine.length; j++) { // the last five element in the array is taken out
                    nums.add(tempLine[j]); // fill the array with the numbers

                }
            }

//            for (String e: dataLines) {
//                System.out.println(e);
//                System.out.println("***");
//
//            }

            String element = "";
            int count = 0;
            for (int i = 0; i < nums.size(); i++) {
                String tempElement = nums.get(i);
                int tempCount = 0;
                for (int j = 0; j < nums.size(); j++) {
                    if (nums.get(j).equals(tempElement)) {
                        tempCount++;
                    }

                }
                if (tempCount > count) {
                    element = tempElement;
                    count = tempCount;
                }
            }


            System.out.println("The most common number is: " + element + " freq.:  " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}