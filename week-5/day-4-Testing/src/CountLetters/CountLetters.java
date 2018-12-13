package CountLetters;

import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> countLetterList (String input) {

        char[] chars = input.toCharArray();
        char character;
        HashMap<Character, Integer> countedLetters = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            character = chars[i];
            if(countedLetters.containsKey(character)) {
                countedLetters.put(character, countedLetters.get(character)+1);
            } else {
                countedLetters.put(character, 1);
            }
        }
        return countedLetters;
    }
}
