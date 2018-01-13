package com.ua.juja.patterns.helloWorld;

public class RunnerFactory {
    public static Runner create() {
        return new RunnerImpl();
    }
}
