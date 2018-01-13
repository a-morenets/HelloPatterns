package com.ua.juja.patterns.helloWorld;

public class AddEmotionsCommand implements Command {
    private FactoryMethod factory;

    public AddEmotionsCommand(FactoryMethod factory) {
        this.factory = factory;
    }

    @Override
    public Request change(Request request) {
        return new Request(request.getMessage() + factory.getEmotion().get());
    }
}
