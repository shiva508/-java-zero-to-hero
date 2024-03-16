package com.comrade.java_8.functionalinterface.unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorClient {
    public static void main(String[] args) {
        simapleUnaryOperation();
        multiSumDataClient();
    }

    public static void simapleUnaryOperation() {
        UnaryOperator<Integer> multiply = num -> num * 2;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = sumData(list, multiply);
        System.out.println(output);
    }

    public static <T> List<T> sumData(List<T> list, UnaryOperator<T> multiply) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            result.add(multiply.apply(t));
        }
        return result;
    }

    public static void multiSumDataClient() {
        UnaryOperator<Integer> multiply = num -> num * 2;
        UnaryOperator<Integer> sum = num -> num + 1;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = multiSumData(list, multiply, sum);
        System.out.println(output);
    }

    public static <T> List<T> multiSumData(List<T> list, UnaryOperator<T> multiply, UnaryOperator<T> sum) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            result.add(multiply.andThen(sum).apply(t));
        }
        return result;
    }
}
