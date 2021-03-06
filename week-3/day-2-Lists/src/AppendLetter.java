
import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static ArrayList<String> appendA(List<String> input) {

        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {

            output.add(input.get(i) + "a");
        }

        return output;
    }

}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"