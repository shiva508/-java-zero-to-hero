package com.comrade.dsa.dsa_arrays.basic.operations;

public class BasicArrayOperations {
    private int CURRENT_MAX_INDEX = 0;
    private int LENGTH = 2;
    private int [] arrays;

    public BasicArrayOperations(){
        arrays = new int[LENGTH];
    }

    public void push(int value){
        if (LENGTH <= CURRENT_MAX_INDEX) {
            LENGTH = LENGTH*2;
            //Create proxy array with new size
            int [] proxyArray = new int[LENGTH];
            //Copy values from old array to new array
            for (int i = 0; i < arrays.length; i++) {
                proxyArray[i] = arrays[i];
            }
            arrays = proxyArray;
            proxyArray = null;
        }
            arrays[CURRENT_MAX_INDEX] = value;
            CURRENT_MAX_INDEX++;
    }
    public void  pop(){
        int removableIndex = CURRENT_MAX_INDEX-1;
        this.arrayDataShifter(removableIndex,LENGTH);
        CURRENT_MAX_INDEX--;
    }

    public void arrayDataShifter(int currentMaxIndex,int maxArrayLength){
        for (int i = currentMaxIndex; i < maxArrayLength-1; i++) {
            this.arrays[i] = this.arrays[i+1];
        }
    }
    public void printData(){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println("<==========================================>");
    }

    public void deleteValue(int value){
        //Step 1 find the index of value
        int targetIndex = findIndexOfValue(value);
        if (targetIndex==-1){
            System.out.println(value+ "not found in array");
        }else {
            arrayDataShifter(targetIndex,arrays.length);
            CURRENT_MAX_INDEX--;
        }
    }

    private int findIndexOfValue(int value) {
        int targetIndex=-1;
        //Step 2 find value
        for (int i = 0; i < arrays.length-1; i++) {
                if (value == arrays[i]){
                    targetIndex = i;
                    break;
                }
        }
        return targetIndex;
    }
}
