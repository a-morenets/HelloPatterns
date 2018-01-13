package com.ua.juja.patterns.helloWorld;

public class SadFactoryMethod implements FactoryMethod {
    @Override
    public EmotionProduct getEmotion() {
        return new SadSmileEmotionProduct();
    }
}
