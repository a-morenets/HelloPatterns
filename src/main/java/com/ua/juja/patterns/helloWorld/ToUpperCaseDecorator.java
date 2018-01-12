package com.ua.juja.patterns.helloWorld;

public class ToUpperCaseDecorator extends Decorator {

    protected ToUpperCaseDecorator(Component component) {
        super(component);
    }

    @Override
    public void run(String message) {
        super.run(message.toUpperCase());
    }
}
