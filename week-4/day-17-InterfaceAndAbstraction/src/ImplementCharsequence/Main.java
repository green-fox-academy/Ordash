package ImplementCharsequence;

public class Main {
    public static void main(String[] args) {
        Gnirts str = new Gnirts("This is an exmaple");

        int charValue = str.charAt(0);
        int charLength = str.length();
        CharSequence charSequence = str.subSequence(2,5);

        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
// should print out: l

        Shifter s = new Shifter("feuemple", 2);
        System.out.println(s.charAt(0));
// should print out: a
    }
}
