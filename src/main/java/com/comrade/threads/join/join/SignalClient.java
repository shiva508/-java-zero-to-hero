package com.comrade.threads.join.join;

public class SignalClient {
    public static void main(String[] args) {
        TdmaProcessor tdmaProcessor=new TdmaProcessor();
        DeamonFdmaProcessor daemonFdmaProcessor=new DeamonFdmaProcessor();
        Thread threadTdma=new Thread(tdmaProcessor);
        Thread threadFdma=new Thread(daemonFdmaProcessor);
        threadFdma.setDaemon(true);
        threadTdma.start();
        threadFdma.start();
    }
}
