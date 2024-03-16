package com.comrade.threads.create.thread;

public class SignalClient {
    public static void main(String[] args) {
        Thread threadTdma=new TdmaProcessor();
        Thread threadFdma=new FdmaProcessor();
        threadTdma.start();
        threadFdma.start();
        System.out.println("<============================>");
    }
}
