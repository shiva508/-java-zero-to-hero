package com.comrade.threads.thread_priority;

public class ThreadPriorityClient {
    public static void main(String[] args) {
        Thread threadSwimming=new Thread(new Swimming());
        threadSwimming.setPriority(Thread.MAX_PRIORITY);
        threadSwimming.start();
        var name = Thread.currentThread().getName();
        System.out.println("Thread Name: "+name);
        var priority = Thread.currentThread().getPriority();
        System.out.println("Thread Priority: "+priority);
    }
}
