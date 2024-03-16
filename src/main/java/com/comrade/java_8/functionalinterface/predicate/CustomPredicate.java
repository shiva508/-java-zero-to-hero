package com.comrade.java_8.functionalinterface.predicate;

@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T t);
}
