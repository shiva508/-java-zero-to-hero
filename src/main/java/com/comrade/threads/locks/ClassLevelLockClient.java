package com.comrade.threads.locks;

public class ClassLevelLockClient {
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

    public static void increamentOne() {
        ///Class level locking
        synchronized (ClassLevelLockClient.class){
            counterOne=counterOne+1;
        }
    }
    public static void increamentTwo() {
        ///Object level locking without static
        synchronized (ClassLevelLockClient.class){
            counterOne=counterOne+1;
        }
    }

}
