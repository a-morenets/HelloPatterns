package com.ua.juja.patterns.helloWorld;

public class SadFactory implements AbstractFactory {
    @Override
    public EmotionProduct getEmotion() {
        return new SadSmileEmotionProduct();
    }

    @Override
    public EmotionProduct getSymbol() {
        return new SadSymbolEmotionProduct();
    }
}
