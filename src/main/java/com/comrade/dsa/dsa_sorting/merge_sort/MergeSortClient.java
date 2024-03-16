package com.comrade.dsa.dsa_sorting.merge_sort;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSortClient {
    public static void main(String[] args) {
        int [] inputArray=new int[5];
        Random random=new Random();
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]= random.nextInt(1000000);
        }
        mergeSortProcessor(inputArray);
        display("Sorted",inputArray);
    }


    private static void mergeSortProcessor(int[] inputArray) {
        int arraySize=inputArray.length;
        if(arraySize<2){
            return;
        }
        int arrayMidSize=arraySize/2;
        int [] leftArray= new int[arrayMidSize];
        int [] rightArray= new int[arraySize-arrayMidSize];

        for (int i = 0; i < arrayMidSize; i++) {
            leftArray[i]=inputArray[i];
        }

        display("Left Array",leftArray);
        int indexCount=0;
        for (int i = arrayMidSize; i < arraySize; i++) {
            rightArray[indexCount]=inputArray[i];
            indexCount++;
        }
        display("Right Array",rightArray);
        mergeSortProcessor(leftArray);
        mergeSortProcessor(rightArray);
        mergeSort(inputArray,leftArray,rightArray);
    }

    public static void mergeSort(int [] inputArray,int [] leftArray,int [] rightArray){
        int leftArraySize=leftArray.length;
        int rightArraySize=rightArray.length;
        int i=0;
        int j=0;
        int k=0;
        while (i<leftArraySize && j<rightArraySize){
            if(leftArray[i]<=rightArray[j]){
                inputArray[k]=leftArray[i];
                i++;
            }else {
                inputArray[k]=rightArray[j];
                j++;
            }
            k++;
        }

        while (i<leftArraySize){
            inputArray[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<rightArraySize){
            inputArray[k]=rightArray[j];
            j++;
            k++;
        }
    }

    public static void display(String text,int[] elements){
        System.out.println(text);
        String result = IntStream.of(elements).mapToObj(String::valueOf).collect(Collectors.joining("->"));
        System.out.println(result);
    }
}

