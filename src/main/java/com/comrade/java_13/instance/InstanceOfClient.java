package com.comrade.java_13.instance;

public class InstanceOfClient {
    public static void main(String[] args) {
        Object input="Shiva";
        oldApproach(input);
        latestApproach(input);
    }

    private static void latestApproach(Object input) {
        if (input instanceof String output) {
            System.out.println(" String value="+output);
        }else {
            System.out.println("Not string value");
        }
    }

    private static void oldApproach(Object input) {
        if (input instanceof String) {
            String output=(String) input;
            System.out.println(" String value="+output);
        }else {
            System.out.println("Not string value");
        }
    }
}
