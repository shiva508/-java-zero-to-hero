package com.comrade.threads.locks.re_entrant_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SignalReGenerator {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void publishSignal(){
        try {
            lock.lock();
            System.out.println("publishSignal method");
            condition.await();
            System.out.println("Again publishSignal method");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
    public void consumeSignal(){
        try {
            Thread.sleep(2000);
            lock.lock();
            System.out.println("consumeSignal Method");
            Thread.sleep(3000);
            condition.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();        }
    }

}
