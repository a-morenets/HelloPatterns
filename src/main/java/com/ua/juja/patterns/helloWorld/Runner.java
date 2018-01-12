package com.ua.juja.patterns.helloWorld;

public class Runner implements Component {
    private Target target;

    public Runner(Target target) {
        this.target = target;
    }

    @Override
    public void run(String message) {
        target.addMessages(message);
    }
}
