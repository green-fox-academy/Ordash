public class Palindrome {
    public static void main(String[] args) {

        String str = "barmi lehet itt";


        System.out.println(str + palindrome(str));


    }
    public static String palindrome(String input) {


        char[] arr = input.toCharArray();
        char[] output = new char[arr.length];

        for(int i = input.length()-1; i >= 0; i--) {
            output[i] = arr[input.length()-1-i];
        }
        String out = new String(output);
        return out;

    }
}