package com.comrade.dsa.dsa_arrays.string.reverse;

public class ReverseOfSteing {

    public static void main(String[] args) {
       String reversed= reverseString("SHIVA");
        System.out.println(reversed);
    }

    public static String reverseString(String input){
        // SHIVA====>AVISH
        String reversed="";
        if (input != null && input.length()>2) {
            char[] charArray = input.toCharArray();
            for (int i = charArray.length-1; i >= 0; i-- ){
                reversed=reversed+charArray[i];
            }
        }
        return reversed;
    }
}
