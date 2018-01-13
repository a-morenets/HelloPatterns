package com.ua.juja.patterns.helloWorld;

public abstract class Decorator implements Component {
    private Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void run(String message) {
        component.run(message);
    }
}
