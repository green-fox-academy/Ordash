import java.util.*;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> sweetList = new ArrayList<>();
        sweetList.add("Cupcake");
        sweetList.add(2);
        sweetList.add("Brownie");
        sweetList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(sweetList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    public static ArrayList<Object> sweets(ArrayList<Object> input) {

        ArrayList<Object> output = new ArrayList<>();

        output.add(input.get(0));
        output.add("Croissant");
        output.add(input.get(2));
        output.add("Ice Cream");

        return output;
    }
}
