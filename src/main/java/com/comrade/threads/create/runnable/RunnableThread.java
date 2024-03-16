package com.comrade.threads.create.runnable;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread threadOne=new Thread(new RunnableThread());
        Thread threadtwo=new Thread(new RunnableThread());
        threadOne.start();
        threadtwo.start();
    }
}
