package com.comrade.interview.arrays;

import java.util.List;
import java.util.stream.IntStream;

public class ArrayEvenNumSqureRootClient {
    public static void main(String[] args) {
        int []  ints = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> integerList = IntStream.of(ints).boxed().toList().stream().map(integer ->  integer % 2 == 0 ? integer * integer : integer).toList();
        System.out.println(integerList);
    }
}
