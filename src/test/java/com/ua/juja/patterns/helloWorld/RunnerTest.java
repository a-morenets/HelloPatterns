package com.ua.juja.patterns.helloWorld;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RunnerTest {

    @Test
    public void test() {
        // given
        InMemoryStrategy strategy = new InMemoryStrategy();
        Runner runner = RunnerFactory.create();
        runner.addTarget(new Adapter(strategy));

        runner.addHandler(new HelloWorldHandler("☺"));

        // when
        runner.run("Hello World!");

        // then
        assertEquals("[Hello World!☺]", strategy.getMessages().toString());
    }

    private List<String> messages = new LinkedList<>();

    @Test
    public void test2() {
        // given
        Runner runner = RunnerFactory.create();
        runner.addTarget(messages -> RunnerTest.this.messages.addAll(Arrays.asList(messages)));

        // when
        runner.run("Hello World!");

        // then
        assertEquals("[Hello World!]", messages.toString());
    }
}
