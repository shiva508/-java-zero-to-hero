package com.comrade.dsa.how_to_solve_problem;

public class GoogleInterview {
    public static void main(String[] args) {
        int[] inputOne={1,3,0,4,4};
        brutForceApproach(inputOne,8);
        brutForceApproach(inputOne,9);
    }

    private static void brutForceApproach(int[] inputOne,int targetSum) {
        for (int i = 0; i < inputOne.length; i++) {
            for (int j = 1; j < inputOne.length; j++) {
                if(i != j){
                    int sum=inputOne[i]+inputOne[j];
                    if (sum == targetSum) {
                        System.out.println("Index One="+i+", Value="+inputOne[i]+" :: Index Two="+i+", Value="+inputOne[j]);
                    }
                }
            }
        }
    }
}
