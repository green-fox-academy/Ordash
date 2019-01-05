import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lamdbaexp1 {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // solving it with good old for loop
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > 3) {
                System.out.println(myList.get(i));
            }
        }

        // solving it with magic
        myList.stream().filter(x -> x > 3).forEach(System.out::println);


        //Write a Stream Expression to get the even numbers from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);


        System.out.println("-----------------");
        //Write a Stream Expression to get the squared value of the positive numbers from the following list:

        List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> uniqueSquares = numbers2.stream()
                .filter(i -> i > 0)
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
        uniqueSquares.forEach(System.out::println);


        System.out.println("-----------------");
        //Write a Stream Expression to find which number squared value is more then 20 from the following list:

        List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squaresGreaterThanTwenty = numbers3.stream()
                .map(i -> i * i)
                .filter(i -> i > 20)
                .distinct()
                .collect(Collectors.toList());
        squaresGreaterThanTwenty.forEach(System.out::println);

        System.out.println("-----------------");

        //Write a Stream Expression to get the average value of the odd numbers from the following list:

        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        IntSummaryStatistics aStats = numbers4.stream()
                .filter(i -> i % 2 == 1)
                .mapToInt((i) -> i)
                .summaryStatistics();

        System.out.println(aStats.getAverage());

        System.out.println("-----------------");

        //Write a Stream Expression to get the sum of the odd numbers in the following list:

        List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        IntSummaryStatistics sStats = numbers5.stream()
                .filter(i -> i % 2 == 1).mapToInt((i) -> i)
                .summaryStatistics();

        System.out.println(sStats.getSum());

        System.out.println("-----------------");

        //Write a Stream Expression to find the uppercase characters in a string!

        System.out.println("There Are Some Upper Casse Letters".chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining()));

        System.out.println("-----------------");

        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        cities.stream()
                .filter(i -> i.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-----------------");

        //Write a Stream Expression to concatenate a Character list to a string!

        List<Character> charactersToString = Arrays.asList('g','r','e','e','n','f','o','x');

        System.out.println(charactersToString.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()));

        System.out.println("-----------------");

        //Write a Stream Expression to find the frequency of characters in a given string!

        System.out.println("greenfox".chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())));

        System.out.println("-----------------");


        /*Create a Fox class with 3 properties (name, color, age) Fill a list with at least 5 foxes and:

                Write a Stream Expression to find the foxes with green color!
                Write a Stream Expression to find the foxes with green color, and age less then 5 years!
                Write a Stream Expression to find the frequency of foxes by color!
        */

        List<Fox> foxes = Arrays.asList(new Fox("sanya","green",1),
                                        new Fox("bela","blue",10),
                                        new Fox("feco","red",3),
                                        new Fox("pista","green",12),
                                        new Fox("beci","red",2));

        foxes.stream().filter(fox -> fox.getColor().matches("green")).forEach(System.out::println);

        System.out.println("-----------------");

        foxes.stream().filter(fox -> fox.getColor().matches("green")).filter(fox -> fox.getAge() < 5).forEach(System.out::println);

        System.out.println("-----------------");

        Map<String, Long>  result = foxes.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));

        System.out.println(result);
    }
}
