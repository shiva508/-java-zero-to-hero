package com.comrade.threads.sequential_processing;

public class SignalClient {
    public static void main(String[] args) {
        TdmaProcessor tdmaProcessor=new TdmaProcessor();
        FdmaProcessor fdmaProcessor=new FdmaProcessor();
        tdmaProcessor.tdmaConvertion();
        fdmaProcessor.fmaConvertion();
    }
}
