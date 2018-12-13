import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {

        String blabla = "The trouble is that the function doesn't run for each " +
                "item in the array as expected. In the console, it just runs the first item then doesn't output any further. I changed your original function just to include a console.log vs a return statement (either didn't seem to make much of a difference) and I tested that for " +
                "loop to output the currentCharvariable to the console to make sure it worked.";
        //       Key     Value
        //        |       |
        HashMap<String, String> nameCityMap = new HashMap<>();

        nameCityMap.put("Archie", "Budapest");
        System.out.println(nameCityMap);
        System.out.println(nameCityMap.get("Archie"));

        HashMap<Character, Integer> charCounter = new HashMap<>();


    }
}
