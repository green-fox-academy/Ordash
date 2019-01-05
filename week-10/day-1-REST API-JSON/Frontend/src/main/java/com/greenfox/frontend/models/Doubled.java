package com.greenfox.frontend.models;

public class Doubled {

    private Integer received;
    private Integer result;

    public Doubled(Integer received) {
        this.received = received;
        this.result = received*2;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
