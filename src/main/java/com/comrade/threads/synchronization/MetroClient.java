package com.comrade.threads.synchronization;

public class MetroClient {
    public static int counter=0;
    public static void main(String[] args) {
        startTrailRun();
    }

    private static void startTrailRun() {
        Thread threadOne=new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increament();
            }
        });

        Thread threadTwo=new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increament();
            }
        });
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }

    private static void increament() {
        counter=counter+1;
    }
}
