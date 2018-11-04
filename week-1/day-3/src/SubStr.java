public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter

        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        //System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`
        //System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`

        //String text = "0123hello9012hello8901hello7890";
        //String word = "hello";

        //System.out.println(text.indexOf(word)); // prints "4"
        //System.out.println(text.lastIndexOf(word));


        String str = "pityu szereti a sort";
        String str2 = "sor";

        System.out.println(subStr(str,str2));

        //String length = .substring(5,6);
        //System.out.println(str.indexOf(str2));



    }

    public static int subStr(String input1, String input2) {

       int index = input1.indexOf(input2);

       if (index >= 0) {

           return index; }
       else {
           return -1;
       }


   }
}
