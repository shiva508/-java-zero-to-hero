package com.comrade.java_8.functionalinterface.bipredicate;

@FunctionalInterface
public interface CustomBiPredicate<T, U> {
    boolean test(T t, U u);
}
