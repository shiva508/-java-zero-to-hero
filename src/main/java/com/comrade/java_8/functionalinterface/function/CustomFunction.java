package com.comrade.java_8.functionalinterface.function;

@FunctionalInterface
public interface CustomFunction<T, R> {
    R apply(T t);
}
