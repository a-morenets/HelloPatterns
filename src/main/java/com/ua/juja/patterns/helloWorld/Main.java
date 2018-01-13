package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World!";

        InMemoryStrategy inMemory = new InMemoryStrategy();
        Runner runner = new Runner();

        runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));
        runner.addTarget(new Adapter(inMemory));

        Component component = runner;
        component = new ToUpperCaseDecorator(component);
        component = new ReplaceSpaceTo(component, "-");
        component.run(message);

//        List<String> messages = inMemory.getMessages();
    }

}
