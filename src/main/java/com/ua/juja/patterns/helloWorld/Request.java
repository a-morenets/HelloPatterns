package com.ua.juja.patterns.helloWorld;

public class Request {
    private String message;

    Request(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
