package com.comrade.threads.wait;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Dev {
    public static void main(String[] args) {
        List<String> inputData= Arrays.asList("1-20","2-10","1-35");
        var stringListMap = inputData.stream()
                .collect(Collectors.groupingBy(s -> s.split("-")[0], Collectors.mapping(s ->Integer.parseInt( s.split("-")[1]), Collectors.toList())))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, stringListEntry -> stringListEntry.getValue().stream().mapToInt(Integer::intValue).sum()));
        System.out.println(stringListMap);
    }
}
