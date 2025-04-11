package com.learndevops.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage(), "Messages from different instances should be equal.");
    }

    @Test
    public void testAppMessage() {
        App app = new App();
        String expectedMessage = 
            "Hello! This app is deployed using AWS CI/CD\n" +
        "Congratulations, you have Successfully Deployed the application";
        assertEquals(expectedMessage, app.getMessage(), "The message should match the expected value.");
    }
}

