package com.comrade.interview.count.occurrences.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurencesOfWord {
    public static void main(String[] args) {
        String input="India is my my my country country";
        List<String> stringList= Arrays.asList(input.split(" "));
        var map= stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(map);
    }
}
