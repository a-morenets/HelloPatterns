package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World";
        FactoryMethod factory = new SadFactoryMethod();
        process(message, factory);
    }

    private static void process(String message, FactoryMethod factory) {
//        // long time ago
//
//        Runner runner = RunnerFactory.create();
//
//        runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));
//
//        InMemoryStrategy inMemory = new InMemoryStrategy();
//        runner.addTarget(new Adapter(inMemory));
//
//        // long time ago
//
//        runner.addHandler(new HelloWorldHandler(new AddEmotionsCommand(factory)));
//
//        // long time ago
//
//        Component component = runner;
//        component = new ToUpperCaseDecorator(component);
//        component = new ReplaceSpaceTo(component, factory.getEmotion().get());
//        component.run(message);

//        List<String> messages = inMemory.getMessages();

        Component component = RunnerBuilder
                .forStrategy(ConsoleStrategy.getInstance())
                .andStrategy(new InMemoryStrategy())
                .andHelloWorldCommand(new AddEmotionsCommand(factory))
                .andHandler(Handler.NULL)
                .andDecorator(ToUpperCaseDecorator.class)
                .andDecorator(ReplaceSpaceTo.class)
                .create();

        component.run(message);
    }

}
