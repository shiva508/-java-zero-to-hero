package com.comrade.java_8.functionalinterface.bifunction;

public interface CustomBiFunction<T, U, R> {
    R apply(T t, U u);
}
