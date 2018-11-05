public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Glory";
        String s2 = "Gloryhole";
        String s3 = "       Glorious like a gloryhole    ";

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());

        if(s2.startsWith(s1)) {
            System.out.println("Yes it starts with the same word.");
        }
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("Yes its the same");
        }
        System.out.println(s1.concat(s2 ));

        System.out.println(s1.charAt(0));

        System.out.println(s1.indexOf('r'));

        System.out.println(s1.substring(3));

        System.out.println(s2.replace('o' , '0'));

        System.out.println(s3.trim());
    }
}
