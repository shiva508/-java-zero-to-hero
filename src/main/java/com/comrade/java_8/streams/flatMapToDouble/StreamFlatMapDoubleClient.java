package com.comrade.java_8.streams.flatMapToDouble;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapDoubleClient {
    public static void main(String[] args) {
        List<List<String>> treeNums= Arrays.asList(
                Arrays.asList("1", "2"),
                Arrays.asList("5", "6"),
                Arrays.asList("3", "4")
        );
        var doubleStream = treeNums.stream().flatMapToDouble(strings -> strings.stream().mapToDouble(Double::parseDouble));
        var sum = doubleStream.peek(System.out::println).sum();
        System.out.println(sum);

        String[][] arrayOfArrays = {{"1", "2"}, {"5", "6"}, {"3", "4"}};
        var doubleStream1 = Arrays.stream(arrayOfArrays).flatMapToDouble(strings -> Arrays.stream(strings).mapToDouble(Double::parseDouble));
        var sum1 = doubleStream1.peek(System.out::println).sum();
        System.out.println(sum1);
    }
}

