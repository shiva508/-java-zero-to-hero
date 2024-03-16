package com.comrade.threads.wait;

public class SignalEmulator {
    public static void main(String[] args) {
        SignalGenerator signalGenerator=new SignalGenerator();
        Thread threadOne=new Thread(signalGenerator::publishSignal);
        Thread threadTwo=new Thread(signalGenerator::consumeSignal);
        threadOne.start();
        threadTwo.start();
    }
}
