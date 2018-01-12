package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new ConsoleStrategy();
        new Runner(strategy).run();
    }

}
