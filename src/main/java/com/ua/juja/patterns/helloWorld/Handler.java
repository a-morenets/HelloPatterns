package com.ua.juja.patterns.helloWorld;

public abstract class Handler {
    public static final Handler NULL = new NullHandler();

    private Handler next;

    public void addNext(Handler next) {
        this.next = next;
    }

    public Request handle(Request request) {
        Request changed = handleRequest(request);

        if (next != null) {
            changed = next.handle(changed);
        }

        doAfterAll(changed);
        return changed;
    }

    private void doAfterAll(Request request) {
        // implement in subclass
    }

    protected abstract Request handleRequest(Request request);
}
