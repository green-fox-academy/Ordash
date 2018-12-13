import java.util.*;

public class Matchmaking{
    public static void main(String... args) {

        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...


        //ArrayList<String> match = new ArrayList<>();
        //for (int i = 0; i < girls.size(); i++); {

        System.out.println(makingMatches(girls, boys));
    }




    public static ArrayList<String> makingMatches(List<String> input1, List<String> input2) {

        ArrayList<String> match = new ArrayList<>();

        for(int i = 0; i < input1.size(); i++) {

            match.add(input1.get(i));
            match.add(input2.get(i));

        }
        return match;




    }
}