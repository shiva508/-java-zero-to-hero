package com.comrade.java_8.streams.generate;

import java.util.stream.Stream;

public class StreamGenerateClient {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(()->Double.toString(Math.random() * 1000)).limit(8);
        stream.forEach(System.out::println);
    }
}
