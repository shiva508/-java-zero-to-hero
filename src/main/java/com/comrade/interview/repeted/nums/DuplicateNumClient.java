package com.comrade.interview.repeted.nums;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateNumClient {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,6,7,11,2,7,4,11,6);
        Map<Integer, List<Integer>> integerListMap = IntStream.range(0,integers.size())
                                                              .boxed()
                                                              .collect(Collectors.groupingBy(integers::get,LinkedHashMap::new,Collectors.toCollection(ArrayList::new)));
        System.out.println(integerListMap);
        Map<Integer, List<Integer>> integerListMapTwo = IntStream.range(0,integers.size())
                                                                 .boxed()
                                                                 .collect(Collectors.groupingBy(integers::get,LinkedHashMap::new,Collectors.toList()));
        System.out.println(integerListMapTwo);

    }
}
