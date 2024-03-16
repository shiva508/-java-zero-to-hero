package com.comrade.threads;

public class SignalHacker implements Runnable{
    private volatile boolean hacked;

    public boolean isHacked() {
        return hacked;
    }

    public void setHacked(boolean hacked) {
        this.hacked = hacked;
    }

    @Override
    public void run() {
        System.out.println("Hacking status :"+hacked);
        while (!hacked){
            System.out.println("Hacking...................");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
