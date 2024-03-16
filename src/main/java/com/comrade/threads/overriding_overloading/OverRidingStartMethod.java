package com.comrade.threads.overriding_overloading;

public class OverRidingStartMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Invoked using thread");
    }

    @Override
    public synchronized void start() {
        System.out.println("WOO, We Should not do that");
    }
}
