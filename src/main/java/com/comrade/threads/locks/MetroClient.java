package com.comrade.threads.locks;

public class MetroClient {
    public static int counterOne=0;
    public static int counterTwo=0;
    public static void main(String[] args) {
        startTrailRun();
    }

    private static void startTrailRun() {
        Thread threadOne=new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increamentOne();
            }
        });

        Thread threadTwo=new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increamentTwo();
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
        System.out.println(counterOne);
        System.out.println(counterTwo);
    }

    private synchronized static void increamentOne() {
        counterOne=counterOne+1;
    }
    private synchronized static void increamentTwo() {
        counterTwo=counterTwo+1;
    }
}
