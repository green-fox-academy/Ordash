import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery2 {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        HashMap<String, Integer> map = lottery("assets/lottery.txt");
        System.out.println(findFrequents(map));

    }

    public static HashMap<String, Integer> lottery(String filename) {
        List<String> lines = new ArrayList<>();
        try {
            Path filepath = Paths.get(filename);
            lines = Files.readAllLines(filepath);
        } catch (IOException excep) {
            excep.printStackTrace();
            System.out.println("file can not be read");
        }
        List<String> lotteryNumbers = new ArrayList<>();
        for (String line : lines) {
            for (int j = 11; j < 16; j++) {
                lotteryNumbers.add(line.split(";")[j]);
            }
        }
        HashMap<String, Integer> lotteryMap = new HashMap<>();
        for (int j = 0; j < lotteryNumbers.size(); j++) {
            String key = lotteryNumbers.get(j);
            if (!lotteryMap.containsKey(key)) {
                lotteryMap.put(key, 1);
            } else {
                lotteryMap.put(key, lotteryMap.get(key) + 1);
            }
        }
        return lotteryMap;

    }

    public static List<String> findFrequents(Map<String, Integer> map) {
        List<Integer> occurence = new ArrayList<>(map.values());
        occurence.sort(Comparator.reverseOrder());
        List<String> mostFrequent = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(occurence.get(i)) && !mostFrequent.contains(entry.getKey())) {
                    mostFrequent.add(entry.getKey());
                }
            }
        }
        return mostFrequent;

    }
}
