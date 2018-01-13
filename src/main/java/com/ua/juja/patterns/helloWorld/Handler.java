package com.ua.juja.patterns.helloWorld;

public abstract class Handler {
    public static final Handler NULL = new NullHandler();

    private Handler next;

    public void addNext(Handler next) {
        this.next = next;
    }

    public void handle(Request request) {
        handleRequest(request);

        if (next != null) {
            next.handle(request);
        }

        doAfterAll(request);
    }

    private void doAfterAll(Request request) {
        // implement in subclass
    }

    protected abstract void handleRequest(Request request);
}
