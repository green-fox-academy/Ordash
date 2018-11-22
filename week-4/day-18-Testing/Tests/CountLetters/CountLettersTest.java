package CountLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    private CountLetters countLetters = new CountLetters();
    private HashMap<Character, Integer> testMap;

    @BeforeEach
    void setUp() {
        testMap = new HashMap<>();
    }

    @Test
    void countLetterList() {
        testMap.put('q',4);
        testMap.put('w',3);
        testMap.put('e',2);
        testMap.put('r',1);
        assertEquals(testMap, countLetters.countLetterList("qqqqwwweer"));
    }

    @Test
    void countCapitalLetterList() {
        testMap.put('q',4);
        testMap.put('Q',3);
        testMap.put('e',2);
        testMap.put('r',1);
        assertEquals(testMap, countLetters.countLetterList("qqqqQQQeer"));
    }


}