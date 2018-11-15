// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class String3 {
    public static void main(String[] args) {

        String str = "sdfherbsdfgr";
        System.out.println(starAdder(str));

    }

    public static String starAdder(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + starAdder(str.substring(1));
        }

    }
}
