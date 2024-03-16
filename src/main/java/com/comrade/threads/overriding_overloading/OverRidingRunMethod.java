package com.comrade.threads.overriding_overloading;

public class OverRidingRunMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Thread method run method");
    }
    public void run(int count) {
        System.out.println(count);
    }

}
