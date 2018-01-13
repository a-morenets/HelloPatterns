package com.ua.juja.patterns.helloWorld;

public class RunnerImpl implements Runner {
    private Observable observable = new ObservableImpl();
    private Handler handler = new NullHandler();

    @Override
    public void addTarget(Target target) {
        observable.add(new TargetObserverAdapter(target));
    }

    @Override
    public void addHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void run(String message) {
        Request request = new Request(message);
        handler.handle(request);

        observable.notifyAll(request.getMessage());
    }
}
