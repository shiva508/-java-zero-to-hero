package com.comrade.java_11.string.blank;

public class BlankClient {
    public static void main(String[] args) {
        String nullTest=null;
        String emptyTest="";
        String emptyLengthTest="      ";
        String leadTrailEmpty=" Shiva ";
        //System.out.println(nullTest.isBlank()); //Exception
        System.out.println(emptyTest.isBlank()); //true
        System.out.println(emptyLengthTest.isBlank());// true
        //System.out.println(nullTest.isEmpty()); //Exception
        System.out.println(emptyLengthTest.isEmpty());
    }
}
