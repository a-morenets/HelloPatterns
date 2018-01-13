package com.ua.juja.patterns.helloWorld;

public class HelloWorldHandler extends Handler {

    private final Command command;

    HelloWorldHandler(Command command) {
        this.command = command;
    }

    @Override
    protected Request handleRequest(Request request) {
        String s = request.getMessage().toLowerCase();
        if (s.contains("hello") && s.contains("world")) {
            return command.change(request);
        }
        return request;
    }
}
