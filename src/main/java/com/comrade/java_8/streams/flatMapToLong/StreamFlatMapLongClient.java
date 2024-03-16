package com.comrade.java_8.streams.flatMapToLong;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class StreamFlatMapLongClient {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("1", "2"),
                Arrays.asList("5", "6"),
                Arrays.asList("3", "4")
        );
        var longStream = listOfLists.stream().flatMapToLong(strings -> strings.stream().mapToLong(Long::parseLong));
        var sum = longStream.peek(System.out::println).sum();
        System.out.println(sum);

        String[][] arrayOfArrays = {{"1", "2"}, {"5", "6"}, {"3", "4"}};
        var longStream1 = Arrays.stream(arrayOfArrays).flatMapToLong(strings -> Arrays.stream(strings).mapToLong(Long::parseLong));
        var sum1 = longStream1.peek(System.out::println).sum();
        System.out.println(sum1);

    }
}
