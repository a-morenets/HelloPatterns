package com.ua.juja.patterns.helloWorld;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World";
        FactoryMethod factory = new SadFactoryMethod();
        process(message, factory);
    }

    private static void process(String message, FactoryMethod factory) {
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
