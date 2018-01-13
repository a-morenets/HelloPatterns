package com.ua.juja.patterns.helloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test() {
        // given
        ConsoleMock console = new ConsoleMock();

        // when
        Main.main(new String[0]);

        // then
        assertEquals("HELLO-WORLD☻\r\n", console.getOut());
    }
}
