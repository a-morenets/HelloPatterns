package com.ua.juja.patterns.helloWorld;

import java.util.LinkedList;
import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers = new LinkedList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String message) {
        for (Observer observer : observers) {
            observer.handle(message);
        }
    }
}
