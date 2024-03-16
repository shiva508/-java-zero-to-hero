package com.comrade.java_8.streams.of;

import java.util.stream.IntStream;

public class StreamOfClient {
    public static void main(String[] args) {
        var intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var sum = intStream.asDoubleStream().sum();
        System.out.println(sum);
    }
}
