package com.ua.juja.patterns.helloWorld;

import java.util.Iterator;
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
        MyIterator<Observer> iterator = iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.get();
            observer.handle(message);
        }
    }

    @Override
    public MyIterator<Observer> iterator() {
        final Iterator<Observer> iterator = observers.iterator();

        return new MyIterator<Observer>() {
            private Observer next = null;

            @Override
            public boolean hasNext() {
                boolean result = iterator.hasNext();
                if (result) {
                    next = iterator.next();
                }
                return result;
            }

            @Override
            public Observer get() {
                return next;
            }
        };
    }
}
