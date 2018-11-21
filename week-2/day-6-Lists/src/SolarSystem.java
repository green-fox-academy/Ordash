import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        List<String> in = planetList;
        System.out.println(putSaturn(in));
        //System.out.println(planetList.indexOf("Jupiter"));
        //planetList.add(5, "Saturn");
        //System.out.println(planetList);
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"



    }
    public static List putSaturn(List input) {

        input.add(5, "Saturn");

        return input;

    }

}