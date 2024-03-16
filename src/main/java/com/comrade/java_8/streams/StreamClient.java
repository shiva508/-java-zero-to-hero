package com.pool.streams;

import java.util.Arrays;
import java.util.List;

public class StreamClient {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
        Integer sumOfNum = number.stream().reduce(0, Integer::sum);
        System.out.println(sumOfNum);
    }
}
