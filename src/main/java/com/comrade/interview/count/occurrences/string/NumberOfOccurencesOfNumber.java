package com.comrade.interview.count.occurrences.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurencesOfNumber {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 5, 3, 4, 4, 4, 4, 4, 5, 5, 5};
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 3, 4, 4, 4, 4, 4, 5, 5, 5);
        Map<Integer,Long> integerLongMap = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(integerLongMap);
        //Integer integer = integerLongMap.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get().getKey();
        Integer integer = integerLongMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(integer);
    }
}
