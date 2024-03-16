package com.comrade.dsa.how_to_solve_problem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HowToSolveProblem {
    public static void main(String[] args) {
        String [] inputOne={"a","z","n","g","a"};
        String [] inputTwo={"n","p","m","g"};
        findCommonValues(inputOne,inputTwo);
        findCommonValuesBetterApproach(inputOne,inputTwo);
    }

    private static void findCommonValuesBetterApproach(String[] inputOne, String[] inputTwo) {
        //Create Map with inputOne
        Map<String, Boolean> inputOneCollect = Arrays.stream(inputOne).collect(Collectors.toMap(s -> s, s -> true,(oldVal,newVal)->oldVal));
       //MapInputOne Check if any value from inputTwo
        boolean isElementFound = Arrays.stream(inputTwo).anyMatch(inputOneCollect::containsKey);
        List<String> elmFound = Arrays.stream(inputTwo).filter(inputOneCollect::containsKey).toList();
        System.out.println("Element found="+isElementFound);
        System.out.println(elmFound);
    }

    private static void findCommonValues(String[] inputOne, String[] inputTwo) {
        boolean found=false;
        for (int i = 0; i < inputOne.length; i++) {
            for (int j = 0; j < inputTwo.length; j++) {
                if(inputOne[i].equals(inputTwo[j])){
                    System.out.println(inputOne[i]+"=="+inputTwo[j]);
                }
            }
        }
    }
}