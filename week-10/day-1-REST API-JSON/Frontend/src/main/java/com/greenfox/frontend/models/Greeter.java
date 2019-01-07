package com.greenfox.frontend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeter {

    private String welcomeMessage;

    public Greeter(String name, String title) {
        this.welcomeMessage = String.format("Oh, hi there %s, my dear %s!",name, title);
    }

    @JsonProperty("welcome_message")
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
