package com.comrade.java_8.streams.iterate;

import java.util.stream.Stream;

public class StreamIterateClient {
    public static void main(String[] args) {
        Stream.iterate(0,num->num+1)
                .limit(8)
                .forEach(System.out::println);
    }
}
