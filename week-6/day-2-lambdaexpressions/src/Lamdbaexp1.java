import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
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
        uniqueSquares.stream().forEach(System.out::println);


        System.out.println("-----------------");
        //Write a Stream Expression to find which number squared value is more then 20 from the following list:

        List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squaresGreaterThanTwenty = numbers3.stream()
                .map(i -> i * i)
                .filter(i -> i > 20)
                .distinct()
                .collect(Collectors.toList());
        squaresGreaterThanTwenty.stream().forEach(System.out::println);

        System.out.println("-----------------");

        //Write a Stream Expression to get the average value of the odd numbers from the following list:

        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        IntSummaryStatistics stats = numbers4.stream().filter(i -> i % 2 == 1).mapToInt((i) -> i).summaryStatistics();

        System.out.println(stats.getAverage());


        //Write a Stream Expression to get the sum of the odd numbers in the following list:

        List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);





    }
}
