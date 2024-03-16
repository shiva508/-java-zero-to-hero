package com.comrade.java_8.streams.builder;

import java.util.stream.Stream;

public class StreamBuilderClient {
    public static void main(String[] args) {
        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> stream = streamBuilder.add("Shiva").add("Dasari").build();
        stream.forEach(student -> System.out.println(student));
    }
}
