package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World!";

        Runner runner = RunnerFactory.create();

        runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));

        InMemoryStrategy inMemory = new InMemoryStrategy();
        runner.addTarget(new Adapter(inMemory));

        // long time ago

        Component component = runner;
        component = new ToUpperCaseDecorator(component);
        component = new ReplaceSpaceTo(component, "-");
        component.run(message);

//        List<String> messages = inMemory.getMessages();
    }

}
