package com.ua.juja.patterns.helloWorld;

public class RunnerImpl implements Runner {
    private Observable observable = new ObservableImpl();

    @Override
    public void addTarget(Target target) {
        observable.add(new TargetObserverAdapter(target));
    }

    @Override
    public void run(String message) {
        observable.notifyAll(message);
    }
}
