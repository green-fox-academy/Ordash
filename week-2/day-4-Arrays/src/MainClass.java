public class MainClass {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char ----> limited to one character and the unicode-table can be used to get a character what we want in
        //                between two single quotes.
        // boolean
        // String ---->

        String myString = "This is a string";
        System.out.println("my string equals to" + myString);
        myString = myString + ", and this is more.";
        System.out.println("my string equals to" + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("my string equals to" + myString);


        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString); // <--- treated as text only (string doesn't have any numeric
                                                                //   capability.
        String lastString =  "10";
        int myInt = 50;
        lastString = lastString + myInt;

        System.out.println("Last string is equal to " + lastString); // <--- it converts the Int into a String.

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString); // <-- same with Int just added to the String as text.










    }
}
