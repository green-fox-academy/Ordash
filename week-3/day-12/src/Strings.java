public class Strings {
    public static void main(String[] args) {

        String words = "yenia loves y-zibit";
        char from = 'y';
        char to = 'x';

        System.out.println(stringCompute(words,from,to));

    }
    public static String stringCompute(String str, char from, char  to) {

        if (str.length() < 1) {
            return str;
        } else {
            char first = from == str.charAt(0) ? to : str.charAt(0);
            return first + stringCompute(str.substring(1), from, to);

        }


    }
}
