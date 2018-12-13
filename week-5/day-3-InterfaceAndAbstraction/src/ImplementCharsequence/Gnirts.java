package ImplementCharsequence;

public class Gnirts implements CharSequence {

    String str;
    public Gnirts(String str) {
        this.str = str;

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return str.charAt(str.length()-index -1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
