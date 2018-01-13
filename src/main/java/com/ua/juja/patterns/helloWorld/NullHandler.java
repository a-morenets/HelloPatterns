package com.ua.juja.patterns.helloWorld;

class NullHandler extends Handler {
    @Override
    protected Request handleRequest(Request request) {
        // do nothing
        return request;
    }
}
