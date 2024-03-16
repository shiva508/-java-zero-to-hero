package com.comrade.java_8.functionalinterface.binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorClient {
    public static void main(String[] args) {
        simpleBinaryOperator();
        genericWay();
        gintBinaryOperatorWay();
    }

    public static void simpleBinaryOperator() {
        BinaryOperator<Integer> numSum = (num1, num2) -> num1 * num2;
        Integer result = numSum.apply(508, 408);
        System.out.println(result);
    }

    public static void genericWay() {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        BinaryOperator<Integer> sumOpeartor = (num1, num2) -> num1 + num2;
        List<Integer> list = Arrays.asList(numbers);
        Integer initial = 0;
        Integer result = mathSum(list, initial, sumOpeartor);
        System.out.println(result);
    }

    public static <T> T mathSum(List<T> list, T initial, BinaryOperator<T> binaryOperator) {
        T result = initial;
        for (T t : list) {
            result = binaryOperator.apply(t, result);
        }
        return result;
    }

    public static void gintBinaryOperatorWay() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        IntBinaryOperator sumOpeartor = (num1, num2) -> num1 + num2;
        int initial = 0;
        Integer result = intBinaryOperatorSum(numbers, initial, sumOpeartor);
        System.out.println(result);
    }

    public static int intBinaryOperatorSum(int[] list, int initial, IntBinaryOperator intBinaryOperator) {
        int result = initial;
        for (int t : list) {
            result = intBinaryOperator.applyAsInt(t, result);
        }
        return result;
    }
}
