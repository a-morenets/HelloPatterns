package com.ua.juja.patterns.helloWorld;

import java.util.LinkedList;
import java.util.List;

public class InMemoryStrategy implements Strategy {

    private List<String> messages = new LinkedList<>();

    public void print(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
