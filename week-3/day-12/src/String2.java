// Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class String2 {
    public static void main(String[] args) {


        System.out.println(removeX("xenia loves xzibit"));
    }

    public static String removeX(String str) {

        if (str.length() == 0) {
            return str;
        } else {
            if (str.charAt(0) == 'x') {
                return "" + removeX(str.substring(1));
            } else {
                return str.charAt(0) + removeX(str.substring(1));
            }
        }


    }
}
