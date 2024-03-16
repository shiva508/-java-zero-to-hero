package com.comrade.java_8.streams.empty;

import java.util.stream.Stream;

public class StreamEmptyClient {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        System.out.println(stream.toString());
    }
}
