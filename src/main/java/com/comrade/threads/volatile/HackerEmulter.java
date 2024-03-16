package com.comrade.threads;

public class HackerEmulter {

    public static void main(String[] args) {
        SignalHacker signalHacker=new SignalHacker();
        Thread threadOne=new Thread(signalHacker);
        threadOne.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        signalHacker.setHacked(true);
        System.out.println("Hacking terminated");
    }
}
