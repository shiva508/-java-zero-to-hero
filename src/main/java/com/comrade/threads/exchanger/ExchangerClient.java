package com.comrade.threads.exchanger;

import java.util.concurrent.Exchanger;
public class ExchangerClient {
    public static void main(String[] args) {
        Exchanger<Integer> exchanger=new Exchanger<>();
        DepositService depositService=new DepositService(exchanger);
        WithdrownService withdrownService=new WithdrownService(exchanger);
        new Thread(depositService).start();
        new Thread(withdrownService).start();
    }
}
