package com.learndevops.app;

/**
 * A simple application that prints a message to the console.
 */
public class App {

    private static final String MESSAGE = 
        "Hello! This app is deployed using AWS CI/CD\n" +
        "Congratulations, you have Successfully Deployed the application";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}

