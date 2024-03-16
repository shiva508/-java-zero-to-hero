package com.comrade.dsa.dsa_sorting.bubble_sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BubbleSortClient {
    public static void main(String[] args) {
        int [] numArray={20,35,15,7,55,1,22};
        //bubbleSortProcess(numArray);
        bubbleSortProcessBetter(numArray);
        printData(numArray);
    }

    public static void bubbleSortProcess(int[] numArray) {
        for (int i = numArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numArray[j]> numArray[j+1]){
                    swapNumber(numArray,j,j+1);
                }
            }
        }
    }

    public static void bubbleSortProcessBetter(int[] numArray) {
        for (int i = 0; i < numArray.length-1; i++) {
            boolean swapped=false;
            for (int j = 0; j < numArray.length-1-i; j++) {
                if (numArray[j]> numArray[j+1]){
                    swapNumber(numArray,j,j+1);
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    public static void swapNumber(int[] numArray, int i, int j) {
        if(i==j){
            return;
        }
        int temp=numArray[i];
        numArray[i]=numArray[j];
        numArray[j]=temp;
    }
    public static void printData(int [] numArray){
        String result = IntStream.of(numArray).mapToObj(String::valueOf).collect(Collectors.joining("->"));
        System.out.println(result);
    }
}