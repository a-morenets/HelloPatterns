package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World!";

        Component component = new Runner(new Adapter(ConsoleStrategy.getInstance()));
        component = new ToUpperCaseDecorator(component);
        component = new ReplaceSpaceTo(component, "-");
        component.run(message);
    }

}
