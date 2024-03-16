package com.comrade.dsa.dsa_arrays.find.max.second;

public class FindSecondMaxClient {
    public static void main(String[] args) {
        int [] inputArray={3,6,2,9,5,1,7};
        findSecondMaxValue(inputArray);
    }

    private static void findSecondMaxValue(int[] inputArray) {
        int max=0;
        int secMax=0;
        for (int i = 0; i < inputArray.length; i++) {
            if (max<inputArray[i]){
                secMax=max;
                max=inputArray[i];
            } else if (secMax<inputArray[i]) {
                secMax=inputArray[i];
            }
        }
        System.out.println("Max="+max);
        System.out.println("Second Max="+secMax);
    }
}
