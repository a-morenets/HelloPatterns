package com.ua.juja.patterns.helloWorld;

public class ReplaceSpaceTo extends Decorator {
    private final String replacement = "-";

    public ReplaceSpaceTo(Component component) {
        super(component);
    }

    @Override
    public void run(String message) {
        super.run(message.replaceAll(" ", replacement));
    }
}
