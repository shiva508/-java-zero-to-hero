package com.comrade.dsa.dsa_list.arraylist;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DsArrayList {

    private int [] array;
    private int size=0;
    private static final int DEFAULT_SIZE=2;

    public DsArrayList() {
        this.array=new int [DEFAULT_SIZE];
    }

    public void addAtFront(int value){
        this.addAtIndex(0,value);
    }

    public void addAtBack(int value){
        this.addAtIndex(size,value);
    }

    public void addAtIndex(int index,int value){

        if (size==array.length){
            copyArrayOnMaxSize();
            addNewEntry(index, value);
        }else {
            addNewEntry(index, value);
        }
        size++;
    }

    private void addNewEntry(int index, int value) {
        for (int i = size; i >= index +1; i--) {
            array[i]=array[i-1];
        }
        array[index]= value;
    }

    private void copyArrayOnMaxSize() {
        int [] modifiedArray=new int[size*2];
        for (int i = 0; i < array.length; i++) {
            modifiedArray[i]=array[i];
        }
        array=modifiedArray;
    }

    public void removeFromFront(){
        this.removeFromIndex(0);
    }

    public void removeFromBack(){
        this.removeFromIndex(size-1);
    }

    public void removeFromIndex(int index){
        int removedId=array[index];
        System.out.println(String.format("Removed num=%d",removedId));
        array[index]=0;
        for (int i = index; i < size-1; i++) {
                array[i]=array[i+1];
        }
        array[size-1]=0;
        size--;
    }

    public void printData(){
        String result = IntStream.of(array).mapToObj(String::valueOf).collect(Collectors.joining("->"));
        System.out.println(result);
    }
}
