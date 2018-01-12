package com.ua.juja.patterns.helloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunnerTest {

    @Test
    public void test() {
        // given
        InMemoryStrategy strategy = new InMemoryStrategy();
        Runner runner = new Runner(strategy);

        // when
        runner.run();

        // then
        assertEquals("[Hello World!]", strategy.getMessages().toString());
    }
}
