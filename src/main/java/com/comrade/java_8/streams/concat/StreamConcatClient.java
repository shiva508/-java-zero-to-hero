package com.comrade.java_8.streams.concat;

import java.util.stream.Stream;

public class StreamConcatClient {
    public static void main(String[] args) {
        Stream<String> streamOne = Stream.of("I", "AM", "Good ");
        Stream<String> streamTwo = Stream.of("AT", "SOMETHING", "-Shiva");
        Stream<String> mergedStream = Stream.concat(streamOne, streamTwo);
        mergedStream.forEach(System.out::println);
    }
}
