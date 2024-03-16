package com.comrade.threads.deamon_worker_thread;

public class SignalClient {
    public static void main(String[] args) {
        TdmaProcessor tdmaProcessor=new TdmaProcessor();
        FdmaProcessor fdmaProcessor=new FdmaProcessor();
        Thread threadTdma=new Thread(tdmaProcessor);
        Thread threadFdma=new Thread(fdmaProcessor);
        threadTdma.start();
        threadFdma.start();
        try {
            threadTdma.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("<=========================================>");
    }
}
