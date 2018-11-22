package Anagram;

import java.util.Arrays;

public class Anagram {


    public boolean isAnagram(String input1, String input2){

        String  s1= input1.replaceAll("\\s", "");
        String s2 = input2.replaceAll("\\s", "");

        if(s1.length() != s2.length()) {
            return false;
        } else {

            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            if (Arrays.equals(s1Array, s2Array)) {
                return true;
            }
        }
        return false;
    }
}

