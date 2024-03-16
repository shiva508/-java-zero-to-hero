package com.comrade.threads.semaphores_mutexes;

import java.util.concurrent.Semaphore;

public enum Downloader {
    INSTANCE;
    private Semaphore semaphore=new Semaphore(3,true);

    public void download(){
        try {
            semaphore.acquire();
            downloadData();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            semaphore.release();
        }
    }

    private void downloadData() {
        try {
            System.out.println("Downloading data");
            Thread. sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
