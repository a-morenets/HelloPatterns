package com.ua.juja.patterns.helloWorld;

public class Runner implements Component {
    private Observable observable = new ObservableImpl();

    public void addTarget(Target target) {
        observable.add(new TargetObserverAdapter(target));
    }

    @Override
    public void run(String message) {
        observable.notifyAll(message);
    }
}
