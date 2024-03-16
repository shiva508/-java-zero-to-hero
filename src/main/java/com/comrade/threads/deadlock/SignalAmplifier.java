package com.comrade.threads.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SignalAmplifier {
    private Lock lockOne=new ReentrantLock(true);
    private Lock lockTwo=new ReentrantLock(true);

    public void sendingSignal(){
        lockOne.lock();
        System.out.println("Lock.One Lock");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lockTwo.lock();
        System.out.println("Lock.Two Lock");
        lockOne.unlock();
        lockTwo.unlock();
    }

    public void receiveSignal(){
        lockTwo.lock();
        System.out.println("Lock.Two Lock");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lockOne.lock();
        System.out.println("Lock.One Lock");
        lockTwo.unlock();
        lockOne.unlock();
    }

}
