package com.comrade.dsa.dsa_stack.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StackArray {
    int [] array;
    int size=0;

    private static int DEFAULT_SIZE=2;
    public StackArray() {
        array=new int[DEFAULT_SIZE];
    }

    public void push(int value){
        if (size== array.length){
            int[] newArray=new int[DEFAULT_SIZE*2];
            for (int i = 0; i < array.length; i++) {
                newArray[i]=array[i];
            }
            newArray[size]=value;
            array=newArray;
        }else {
            array[size]=value;
        }
        size++;
    }

    public void pop(){
        int removedValue=array[size-1];
        System.out.println("Removed ="+removedValue);
        array[size-1]=0;
        size--;
    }
    public void print(){
       String result= IntStream.of(array).mapToObj(String::valueOf).collect(Collectors.joining("->"));
        System.out.println(result);
    }

}
