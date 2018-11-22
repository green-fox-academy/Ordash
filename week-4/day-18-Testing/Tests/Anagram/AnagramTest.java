package Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    private Anagram anagram = new Anagram();
    private String word1;
    private String word2;

    @BeforeEach
    void setUp() {
        word1 = "";
        word2 = "";
    }

    @Test
    void isAnagram() {
        word1 = "dad";
        word2 = "add";
        assertTrue(anagram.isAnagram(word1,word2));
    }
}