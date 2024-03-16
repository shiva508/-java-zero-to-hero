package com.comrade.java_8.functionalinterface.biconsumer;

@FunctionalInterface
public interface CustomBiConsumer<T, U> {
    void accept(T t, U u);
}
