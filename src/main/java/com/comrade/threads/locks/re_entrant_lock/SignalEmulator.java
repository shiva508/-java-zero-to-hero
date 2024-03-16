package com.comrade.threads.locks.re_entrant_lock;

public class SignalEmulator {
    public static void main(String[] args) {
        SignalReGenerator signalGenerator=new SignalReGenerator();
        Thread threadOne=new Thread(signalGenerator::publishSignal);
        Thread threadTwo=new Thread(signalGenerator::consumeSignal);
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
