package com.ua.juja.patterns.helloWorld;

public class RunnerImpl implements Runner {
    private Observable observable = new ObservableImpl();
    private Handler handler = Handler.NULL;

    @Override
    public void addTarget(Target target) {
        observable.add(new TargetObserverAdapter(target));
    }

    @Override
    public void addHandler(Handler handler) {
        if (this.handler == Handler.NULL) {
            this.handler = handler;
        } else {
            this.handler.addNext(handler);
        }
    }

    @Override
    public void run(String message) {
        Request request = new Request(message);
        Request changed = handler.handle(request);

        observable.notifyAll(changed.getMessage());
    }
}
