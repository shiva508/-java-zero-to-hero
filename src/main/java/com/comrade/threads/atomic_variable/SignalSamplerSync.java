package com.comrade.threads.atomic_variable;

public class SignalSamplerSync {
    private int samplerCount=0;
    public synchronized void samplingRate(){
        for (int i = 0; i < 10000; i++) {
            samplerCount++;
        }
    }
    public int getSamplerCount() {
        return samplerCount;
    }
}
