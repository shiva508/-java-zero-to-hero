package com.comrade.dsa.dsa_arrays.basic;

public class ArrayBasicClient {
    public static void main(String[] args) {
        int [] numArray=new int[9];
        numArray[0]=100;
        numArray[1]=101;
        numArray[2]=102;
        numArray[3]=103;
        numArray[4]=104;
        numArray[5]=105;
        numArray[6]=106;
        numArray[7]=107;
        numArray[8]=108;
        for (int j : numArray) {
            System.out.println(j);
        }
        int index=findIndexOfNumber(numArray,104);
        System.out.println(index);
    }

    public static int findIndexOfNumber(int[] numArray, int input) {
        int index=-1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i]==input){
                index=i;
                break;
            }
        }
        return index;
    }
}
