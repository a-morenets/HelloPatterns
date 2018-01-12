package com.ua.juja.patterns.helloWorld;

public class Runner {
    private Target target;

    public Runner(Target target) {
        this.target = target;
    }

    public void run() {
        target.addMessages("Hello World!");
    }
}
