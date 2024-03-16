package com.comrade.threads.deadlock;

public class ResourceManager {
    public static void main(String[] args) {
        SignalAmplifier signalAmplifier=new SignalAmplifier();
        Thread threadOne=new Thread(signalAmplifier::sendingSignal);
        Thread threadTwo=new Thread(signalAmplifier::receiveSignal);
        threadOne.start();
        threadTwo.start();
    }
}
