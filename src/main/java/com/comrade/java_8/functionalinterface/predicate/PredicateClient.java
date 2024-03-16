package com.comrade.java_8.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateClient {
    public static void main(String[] args) {
        simplePredicate();
        simplePredicateWithAnd();
        simplePredicateWithOr();
        simplePredicateWithNegate();
        simplePredicateWithTest();

    }

    public static void simplePredicate() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isGreaterThanFour = num -> num > 4;
        List<Integer> filteredNum = nums.stream().filter(isGreaterThanFour).collect(Collectors.toList());
        System.out.println(filteredNum);
    }

    public static void simplePredicateWithAnd() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> lowerLimit = num -> num > 3;
        Predicate<Integer> upperLimit = num -> num < 9;
        List<Integer> filteredNum = nums.stream().filter(lowerLimit.and(upperLimit)).collect(Collectors.toList());
        System.out.println(filteredNum);
    }

    public static void simplePredicateWithOr() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> lowerLimit = num -> num > 3;
        Predicate<Integer> upperLimit = num -> num < 9;
        List<Integer> filteredNum = nums.stream().filter(lowerLimit.and(upperLimit)).collect(Collectors.toList());
        System.out.println(filteredNum);
    }

    public static void simplePredicateWithNegate() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> lowerLimit = num -> num > 3;
        Predicate<Integer> upperLimit = num -> num < 9;
        List<Integer> filteredNum = predicatUsntTest(nums, lowerLimit, upperLimit);
        System.out.println(filteredNum);
    }

    public static void simplePredicateWithTest() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> lowerLimit = num -> num > 3;
        Predicate<Integer> upperLimit = num -> num < 9;
        List<Integer> filteredNum = predicatUsntTest(nums, lowerLimit, upperLimit);
        System.out.println(filteredNum);
    }

    private static List<Integer> predicatUsntTest(List<Integer> nums, Predicate<Integer> lowerLimit,
            Predicate<Integer> upperLimit) {
        List<Integer> filteredNum = nums.stream().filter(data -> lowerLimit.and(upperLimit).negate().test(
                data))
                .collect(Collectors.toList());
        return filteredNum;
    }
}
