package com.comrade.threads.wait;

public class WaitNotifyProcessorSimulator {
    public static void main(String[] args) {
        final WaitNotifyProcessor notifyProcessor=new WaitNotifyProcessor();
        Thread threadOne=new Thread(notifyProcessor::produce);
        Thread threadTwo=new Thread(notifyProcessor::consume);
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
