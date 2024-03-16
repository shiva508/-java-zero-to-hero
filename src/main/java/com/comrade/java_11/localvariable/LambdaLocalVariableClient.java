package com.comrade.java_11.localvariable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLocalVariableClient {
    public static void main(String[] args) {
        List<String> aphabets= Arrays.asList("a","b","c",null);
        general(aphabets);
        nullHandler(aphabets);
    }

    private static void nullHandler(List<String> aphabets) {
        aphabets.stream().map((var apha)->apha.toUpperCase()).collect(Collectors.joining(","));
    }

    private static void general(List<String> aphabets) {
        var result= aphabets.stream().map((var apha)->apha.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(result);
    }
}
