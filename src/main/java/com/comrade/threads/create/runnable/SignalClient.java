package com.comrade.threads.create.runnable;

public class SignalClient {
    public static void main(String[] args) {
        TdmaProcessor tdmaProcessor=new TdmaProcessor();
        FdmaProcessor fdmaProcessor=new FdmaProcessor();
        Thread threadTdma=new Thread(tdmaProcessor);
        Thread threadFdma=new Thread(fdmaProcessor);
        threadTdma.start();
        threadFdma.start();
    }
}
