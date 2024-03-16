package com.comrade.interview.find3rdvalue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindNthValueClient {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(4,3,5,2,6,7);
        Optional<Integer> integer = integers.stream().sorted(Comparator.comparing(Integer::intValue)).limit(3).skip(2).findFirst();
        System.out.println(integer.get());
    }
}
