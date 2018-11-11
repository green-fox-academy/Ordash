import java.util.*;

public class StudentCounter{
    public static void main(String... args){
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...


        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Theodor");
        row0.put("age", 9);
        row0.put("candies", 2);
        map.add( row0 );

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add( row1 );

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add( row2 );

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add( row3 );

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add( row4 );

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add( row5 );

        //  - Who has got more candies than 4 candies
        System.out.println("They have more than 4 candies: ");
        for (int i = 0; i < map.size(); i++) {


            Map<String, Object> tempMap = new HashMap<>();
            tempMap = map.get(i);


            int candy = (int) tempMap.get("candies");


            if(candy > 4) {
                System.out.println(tempMap.get("name"));

            }


        }
        //  - Sum the age of people who have less than 5 candies
        double sumOfAges=0;
        for (int j = 0; j < map.size() ; j++) {

            Map<String, Object> tempMap = new HashMap<>();
            tempMap = map.get(j);


            int candy = (int) tempMap.get("candies");
            int ageInt = (int) tempMap.get("age");


            if(candy < 5) {
                sumOfAges += ageInt;

            }


        }
        System.out.println("The sum of the ages of the people who have less than 5 candies: " + sumOfAges);
        // Display the following things:


    }

}