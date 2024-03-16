package com.comrade.dsa.dsa_arrays.find.first.reoccuring;

import java.util.HashMap;
import java.util.Hashtable;

public class FirstReoccuringNumClient {
    public static void main(String[] args) {
        HashMap<Integer,Integer> integerHashtable=new HashMap<>();
        int [] inputArrayOne={2,5,1,2,3,5,1,2,4};
        int [] inputArrayTwo={2,1,1,2,3,5,1,2,4};
        int [] inputArrayThree={2,3,4,5};
        
        findFirstOccurence(inputArrayOne,integerHashtable);
        System.out.println(integerHashtable);
    }

    private static void findFirstOccurence(int[] inputArrayOne, HashMap<Integer, Integer> integerHashtable) {
        for (int i = 0; i < inputArrayOne.length; i++) {
            Integer i1 = integerHashtable.get(inputArrayOne[i]);
            if (null != i1){
                Integer repeateCount = i1+1;
                integerHashtable.put(inputArrayOne[i],repeateCount);
            }else {
                integerHashtable.put(inputArrayOne[i],1);
            }
        }
    }
}
