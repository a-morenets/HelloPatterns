package com.ua.juja.patterns.helloWorld;

public class Runner {
    private Strategy strategy;

    public Runner(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.print("Hello World!");
    }

    private void print(String message) {
        System.out.println(message);
    }
}
