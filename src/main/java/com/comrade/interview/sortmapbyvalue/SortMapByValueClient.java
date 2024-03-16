package com.comrade.interview.sortmapbyvalue;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueClient {
    public static void main(String[] args) {
        Map<String,Integer> input= Map.of("C",508,"A",200,"B", 600);
        LinkedHashMap<String,Integer> hashMap = input.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                     .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(old,naya)->naya,LinkedHashMap::new));
        System.out.println(hashMap);
    }
}
