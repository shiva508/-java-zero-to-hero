package com.comrade.dsa.dsa_arrays.sumof2.brutforce;

import java.util.HashMap;
import java.util.Map;

public class SumOfNumberHashMap {
    public static void main(String[] args) {
        int[] number={11,3,7,9,14,2};
        int target=17;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        //step:1 (17-11=6) check  if 6 is available in map=false and add to map=>11,0
        //step:2 (17-3=14) check  if 14 is available in map=false and add to map=>3,1
        //step:3 (17-7=10) check if 10 is available in map=false and add to map=>7,2
        //step:4 (17-9=8)  check if 8 is available in map=false and add to map=>9,3
        //step:4 (17-14=3) check if 3 is available in map=true we found out match

        for (int i = 0; i < number.length; i++) {
            int remainder=target-number[i];
            if (map.containsKey(remainder)){
                int indexOfElement=map.get(remainder);
                result[0]=indexOfElement;
                result[1]=i;
                break;
            }
            map.put(number[i],i);
        }
        System.out.println("Result "+result[0]+","+result[1]);
    }
}
