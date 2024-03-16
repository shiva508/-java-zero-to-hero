package com.comrade.interview.findrepeatedvaluesum;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedValueSumClient {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,3,4);
        var sumOfDuplicate =  integers.stream()
                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                            .entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue()>1)
                            .map(integerLongEntry ->  integerLongEntry.getValue() * integerLongEntry.getKey())
                            .toList().stream().reduce(0l, Long::sum);
        System.out.println(sumOfDuplicate);
    }
}
