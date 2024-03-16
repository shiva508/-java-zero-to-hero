package com.comrade.java_21.virtualthreads;

public class VirtualThreadClient {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("My thread");
    }
}
