package com.comrade.threads.atomic_variable;

public class SignalClient {
    public static void main(String[] args) {
        SignalSampler signalSamplerOne=new SignalSampler();

        Thread threadOne=new Thread(signalSamplerOne::samplingRate);
        Thread threadTwo=new Thread(signalSamplerOne::samplingRate);
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sample Value signalSamplerOne:"+signalSamplerOne.getSamplerCount());

        SignalSamplerSync signalSamplerSync=new SignalSamplerSync();

        Thread threadThree=new Thread(signalSamplerSync::samplingRate);
        Thread threadFour=new Thread(signalSamplerSync::samplingRate);
        threadThree.start();
        threadFour.start();
        try {
            threadThree.join();
            threadFour.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sample Value signalSamplerSync:"+signalSamplerSync.getSamplerCount());

        SignalSamplerAtomic signalSamplerAtomic=new SignalSamplerAtomic();
        Thread threadFive=new Thread(signalSamplerAtomic::samplingRate);
        Thread threadSix=new Thread(signalSamplerAtomic::samplingRate);
        threadFive.start();
        threadSix.start();
        try {
            threadFive.join();
            threadSix.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sample Value signalSamplerAtomic:"+signalSamplerAtomic.getSamplerCount());
    }
}
