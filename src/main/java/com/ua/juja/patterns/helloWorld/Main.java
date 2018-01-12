package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        new Runner(new Adapter(ConsoleStrategy.getInstance())).run();
    }

}
