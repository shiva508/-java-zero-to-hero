package com.comrade.java_8.functionalinterface.unaryoperator;

import java.util.function.Function;

@FunctionalInterface
public interface CustomUnaryOperator<T> extends Function<T, T> {

}
