public class Greet {

    public static void main(String[] args) {

        String al = "geenfox";
        String two = "Archie";


        System.out.println(greet(two));
        System.out.println(greet(al) + " !");

    }

    public static String greet(String inputString){


        String GreetingMessage = "Greetings Dear, " + inputString;
        return GreetingMessage;
    }
}
