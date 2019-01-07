package com.greenfox.frontend.models;

public class What {

    private String what;
    private int[] numbers;

    public What(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public What() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
