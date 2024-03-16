package com.comrade.threads.locks.re_entrant_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TdmaSignalReEntrantLock {
    private static int singnalCounter=0;
    private static Lock LOCK=new ReentrantLock();
    public static void signalSampling(){
        LOCK.lock();
        try {
            for (int i = 0; i < 10000; i++) {
                singnalCounter++;
            }
        }finally {
            LOCK.unlock();
        }
    }
    public static void main(String[] args) {
        Thread threadOne=new Thread(TdmaSignalReEntrantLock::signalSampling);
        Thread threadTwo=new Thread(TdmaSignalReEntrantLock::signalSampling);
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(singnalCounter);
    }
}
