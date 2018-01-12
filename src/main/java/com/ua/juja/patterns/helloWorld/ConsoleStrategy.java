package com.ua.juja.patterns.helloWorld;

public final class ConsoleStrategy implements Strategy {
    private static Strategy instance;

    private ConsoleStrategy() {
        // do nothing
    }

    public static Strategy getInstance() {
        return instance = instance == null ? new ConsoleStrategy() : instance;
    }

    public void print(String message) {
        System.out.println(message);
    }
}
