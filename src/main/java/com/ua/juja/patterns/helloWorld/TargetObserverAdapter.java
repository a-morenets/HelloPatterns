package com.ua.juja.patterns.helloWorld;

public class TargetObserverAdapter implements Observer {
    private Target target;

    public TargetObserverAdapter(Target target) {
        this.target = target;
    }

    @Override
    public void handle(String message) {
        target.addMessages(message);
    }
}
