package com.comrade.java_11.string.strip;

public class StripClient {
    public static void main(String[] args) {
        String stripTest="  Shiva ";
        System.out.println(stripTest);
        System.out.println(stripTest.strip());
        System.out.println(stripTest.stripTrailing());
        System.out.println(stripTest.stripLeading());
    }
}
