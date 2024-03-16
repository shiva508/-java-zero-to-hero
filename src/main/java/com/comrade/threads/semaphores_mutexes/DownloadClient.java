package com.comrade.threads.semaphores_mutexes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadClient {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i = 0; i < 12; i++) {
            executorService.execute(Downloader.INSTANCE::download);
        }
    }
}
