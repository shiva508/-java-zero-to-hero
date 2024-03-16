package com.comrade.threads.join.join;

public class DeamonFdmaProcessor implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("FDMA Daemon");
        }
    }
}
