package com.ua.juja.patterns.helloWorld;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyAll(String message);
}
