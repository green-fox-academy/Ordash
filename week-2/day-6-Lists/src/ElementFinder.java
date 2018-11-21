import java.util.*;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(numbers));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }


    public static String containsSeven(ArrayList<Integer> input) {

        //ArrayList<Integer> check = new ArrayList<>();

        String output = "";


        for (int i = 0; i < input.size(); i++) {
            if (input.contains(7)) {
                output = "Hooray";
            } else {
                output = "Noooo";
            }

        }
        return output;

    }
}
