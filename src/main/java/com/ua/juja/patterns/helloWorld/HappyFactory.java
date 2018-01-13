package com.ua.juja.patterns.helloWorld;

public class HappyFactory implements AbstractFactory {
    @Override
    public EmotionProduct getEmotion() {
        return new HappySmileEmotionProduct();
    }

    @Override
    public EmotionProduct getSymbol() {
        return new HappySymbolEmotionProduct();
    }
}
