package com.comrade.dsa.dsa_sorting.selection_sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelectionSortClient {
    public static void main(String[] args) {
        int [] numArray={20,35,-15,7,55,1,-22};
        int [] numArray0={20,35,-15,7,55,1,-22};
        //maxNumToMinNumApproach(numArray);
        //minNumToMaxNumApproach(numArray0);
        selectionSortProcessor(numArray);
        String result= IntStream.of(numArray).mapToObj(String::valueOf).collect(Collectors.joining("->"));
        System.out.println(result);
    }

    public static void selectionSortProcessor(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            int minIndex=i;
            for (int j = i+1; j < numArray.length; j++) {
                //System.out.println(String.format("numArray[%d]>numArray[%d]=%d>%d",i,j,numArray[minIndex],numArray[j]));
                    if (numArray[minIndex]>numArray[j]){
                        minIndex=j;
                    }
            }
            //System.out.println(String.format("numArray[i]=%d,numArray[minIndex]=%d",numArray[i],numArray[minIndex]));
            int temp=numArray[i];
            numArray[i]=numArray[minIndex];
            numArray[minIndex]=temp;
        }
    }

    private static void minNumToMaxNumApproach(int[] numArray) {
        for (int firstIndex = 0; firstIndex < numArray.length-1 ; firstIndex++) {
            int minNumIndex=0;
            for (int i = firstIndex+1; i < numArray.length; i++) {
                if (numArray[minNumIndex]<numArray[i]){
                    minNumIndex=i;
                }
            }
            swapNumber(numArray,firstIndex,minNumIndex);
        }
        for (int j : numArray) {
            System.out.println(j);
        }
    }

    private static void maxNumToMinNumApproach(int[] numArray) {
        for (int lastIndex = numArray.length-1; lastIndex >0; lastIndex--) {
            int maxNumIndex=0;
            for (int i = 1; i < lastIndex; i++) {
                if(numArray[i]> numArray[maxNumIndex]){
                    maxNumIndex=i;
                }
            }
            swapNumber(numArray,maxNumIndex,lastIndex);
        }

        for (int j : numArray) {
            System.out.println(j);
        }
    }

    private static void swapNumber(int[] numArray, int maxNumIndex, int lastIndex) {
        if(maxNumIndex==lastIndex){
            return;
        }
        int temp=numArray[maxNumIndex];
        numArray[maxNumIndex]=numArray[lastIndex];
        numArray[lastIndex]=temp;
        System.out.println(numArray[maxNumIndex]+"<===>"+numArray[lastIndex]);
    }
}