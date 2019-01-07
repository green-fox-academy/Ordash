package com.greenfox.frontend.models;

public class Result<T> {

    private T result;

    public Result(T result) {
        this.result = result;
    }

    public Result() {
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
