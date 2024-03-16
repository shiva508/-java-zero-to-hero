package com.comrade.dsa.dsa_arrays.sumof3.brutforce;

import java.util.HashSet;

public class SumOfThreeBruthForce {
    public static void main(String[] args) {
        int [] numbers={7,-6,3,8,-1,8,-11};
        int target=0;
        HashSet<String> outcomes=new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                for (int k = j+1; k < numbers.length; k++) {
                    if (numbers[i]+numbers[j]+numbers[k] == target && !outcomes.contains(numbers[i]+"_"+numbers[j]+"_"+numbers[k])) {
                        outcomes.add(numbers[i]+"_"+numbers[j]+"_"+numbers[k]);
                    }
                }
            }
        }

        System.out.println(outcomes);
    }
}
