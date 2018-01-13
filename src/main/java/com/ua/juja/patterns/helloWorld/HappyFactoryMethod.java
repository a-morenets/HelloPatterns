package com.ua.juja.patterns.helloWorld;

public class HappyFactoryMethod implements FactoryMethod {
    @Override
    public EmotionProduct getEmotion() {
        return new HappySmileEmotionProduct();
    }
}
