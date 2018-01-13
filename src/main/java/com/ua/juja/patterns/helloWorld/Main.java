package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World";
        AbstractFactory factory = new HappyFactory();
        process(message, factory);
    }

    private static void process(String message, AbstractFactory factory) {
        // long time ago

        Runner runner = RunnerFactory.create();

        runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));

        InMemoryStrategy inMemory = new InMemoryStrategy();
        runner.addTarget(new Adapter(inMemory));

        // long time ago

        runner.addHandler(new HelloWorldHandler(new AddSymbolCommand(factory)));
        runner.addHandler(new HelloWorldHandler(new AddEmotionsCommand(factory)));

        // long time ago

        Component component = runner;
        component = new ToUpperCaseDecorator(component);
        component = new ReplaceSpaceTo(component, factory.getSymbol().get());
        component.run(message);

//        List<String> messages = inMemory.getMessages();
    }

}
