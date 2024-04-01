package com.comrade.java_21.virtual_thread;

public class VirtualThreadClient {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> System.out.println("My thread");
        Thread.startVirtualThread(runnable);
        Runnable runnableList = () -> {
            for(int i=0; i<10; i++) {
                System.out.println(STR."Index: \{i}");
            }
        };
        Thread.startVirtualThread(runnableList);
        Thread.sleep(1000);
    }
}
