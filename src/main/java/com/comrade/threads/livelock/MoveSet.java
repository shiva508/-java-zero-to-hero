package com.comrade.threads.livelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MoveSet {
    private Lock lockOne=new ReentrantLock(true);
    private Lock lockTwo=new ReentrantLock(true);

    public void signalTx(){
        while (true){
            try {
                lockOne.tryLock(20, TimeUnit.MILLISECONDS);
                System.out.println("signalTx acquired LOCK-ONE");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("signalTx tries to get LOCK-TWO");
            if(lockTwo.tryLock()){
                System.out.println("signalTx acquired LOCK-TWO");
                lockTwo.unlock();
            }else {
                System.out.println("signalTx can not acquired LOCK-TWO");
                continue;
            }
            break;
        }
        lockOne.unlock();
        lockTwo.unlock();
    }

    public void signalRx(){
        while (true){
            try {
                lockTwo.tryLock(50,TimeUnit.MILLISECONDS);
                System.out.println("signalRx acquired LOCK-TWO");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("signalRx tries to get LOCK-ONE");
            if (lockOne.tryLock()){
                System.out.println("signalRx acquired LOCK-ONE");
                lockOne.unlock();
            }else {
                System.out.println("signalRx can not acquired LOCK-ONE");
                continue;
            }
            break;
        }
        lockOne.unlock();
        lockTwo.unlock();
    }
}
