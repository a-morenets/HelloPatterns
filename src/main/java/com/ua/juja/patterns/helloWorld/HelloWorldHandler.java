package com.ua.juja.patterns.helloWorld;

public class HelloWorldHandler extends Handler {

    private final String symbol;

    HelloWorldHandler(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void handle(Request request) {
        String s = request.getMessage().toLowerCase();
        if (s.contains("hello") && s.contains("world")) {
            request.setMessage(request.getMessage() + symbol);
        }
        super.handle(request);
    }
}
