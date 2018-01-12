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
        Runner runner = new Runner(new Adapter(strategy));

        // when
        runner.run();

        // then
        assertEquals("[Hello World!]", strategy.getMessages().toString());
    }

    private List<String> messages = new LinkedList<>();

    @Test
    public void test2() {
        // given
        Runner runner = new Runner(messages -> RunnerTest.this.messages.addAll(Arrays.asList(messages)));

        // when
        runner.run();

        // then
        assertEquals("[Hello World!]", messages.toString());
    }
}
