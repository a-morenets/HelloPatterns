package com.ua.juja.patterns.helloWorld;

public final class Request {
    private final String message;

    /**
     * Copy constructor
     */
    Request(Request request) {
        this.message = request.getMessage();
    }

    Request(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
