package com.comrade.threads.create.thread;

public class SimpleThread extends Thread {
    public SimpleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Current thread:"+currentThread().getName());
    }

    public static void main(String[] args) {
        Thread threadOne=new SimpleThread("THREAD 1");
        threadOne.setName("THREAD 1");
        Thread threadTwo=new SimpleThread("THREAD 2");
        threadTwo.setName("THREAD 2");
        threadOne.start();
        threadTwo.start();
    }
}
