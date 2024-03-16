package com.comrade.java_8.functionalinterface.binaryoperator;

import com.comrade.java_8.functionalinterface.bifunction.CustomBiFunction;

@FunctionalInterface
public interface CustomBinaryOperator<T> extends CustomBiFunction<T, T, T> {

}
