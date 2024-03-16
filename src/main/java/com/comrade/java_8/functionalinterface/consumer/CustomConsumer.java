package com.comrade.java_8.functionalinterface.consumer;

@FunctionalInterface
public interface CustomConsumer<T> {
    void accept(T t);
}
