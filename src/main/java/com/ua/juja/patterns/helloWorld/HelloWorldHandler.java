package com.ua.juja.patterns.helloWorld;

public class HelloWorldHandler extends Handler {

    @Override
    public void handle(Request request) {
        String s = request.getMessage().toLowerCase();
        if (s.contains("hello") && s.contains("world")) {
            request.setMessage(request.getMessage() + "!");
        }
        super.handle(request);
    }
}
