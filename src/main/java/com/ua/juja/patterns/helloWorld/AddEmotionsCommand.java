package com.ua.juja.patterns.helloWorld;

public class AddEmotionsCommand implements Command {
    private FactoryMethod factory;

    public AddEmotionsCommand(FactoryMethod factory) {
        this.factory = factory;
    }

    @Override
    public void change(Request request) {
        request.setMessage(request.getMessage() + factory.getEmotion().get());
    }
}
