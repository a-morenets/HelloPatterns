package com.ua.juja.patterns.helloWorld;

public class ConsoleStrategy implements Strategy {
    public void print(String message) {
        System.out.println(message);
    }
}
