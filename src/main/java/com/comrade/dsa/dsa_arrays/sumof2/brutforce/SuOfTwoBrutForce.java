package com.comrade.dsa.dsa_arrays.sumof2.brutforce;

public class SuOfTwoBrutForce {;
    public static void main(String[] args) {
        int[] number={11,3,7,9,14,2};
        for (int i = 0; i < number.length; i++) {//O(n)
            for (int j = i+1; j < number.length-1; j++) {
                System.out.println("number[i]="+number[i]+",number[j]="+number[j]);
                int sum=number[i]+number[j];
                if(sum==17){
                    System.out.println("Match found");
                    break;
                }
            }
        }
    }
}
