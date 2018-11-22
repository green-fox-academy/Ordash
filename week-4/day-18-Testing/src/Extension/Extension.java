package Extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        int[] intArray = new int[3];
        intArray[0] = a;
        intArray[1] = b;
        intArray[2] = c;
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;

    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        if (pool.size() % 2 == 0) {
            int even = (pool.size()/2)-1;
            return (double)(pool.get(even)+pool.get(even+1))/2;
        }
        int odd = pool.size()/2;
        return (double)pool.get(odd);
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i','y').contains(c);
    }

    String translate(String hungarian) {
        int length = hungarian.length();
        for (int i = 0; i < length; i++) {
            char c = hungarian.charAt(i);
            if (isVowel(c)) {
                hungarian = String.join(c + "v" + c, hungarian.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return hungarian;
    }
}