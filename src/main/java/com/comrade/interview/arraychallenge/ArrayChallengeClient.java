package com.comrade.interview.arraychallenge;

import java.util.Arrays;

public class ArrayChallengeClient {
    public static void main(String[] args) {
        int [] inputArray = new int[5];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 3;
        inputArray[3] = 4;
        inputArray[4] = 5;
        System.out.println(inputArray);
        int [] copyArray = inputArray;
        System.out.println(copyArray);
        multiplier(inputArray);
        multiplier(copyArray);
        Arrays.stream(inputArray).forEach(System.out::println);
    }

    private static void multiplier(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i] * 2;
        }
    }
}
