package com.comrade.interview.sortingcomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSorting {
    public static void main(String[] args) {
        List<Integer> numbs= Arrays.asList(508,503,506,501,505,502,507,509,504);
        List<Integer> sortedNumbs=numbs.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedNumbs);
        List<Integer> dataOf4= sortedNumbs.stream().limit(4).skip(3).collect(Collectors.toList());
        System.out.println(dataOf4);
    }
}
