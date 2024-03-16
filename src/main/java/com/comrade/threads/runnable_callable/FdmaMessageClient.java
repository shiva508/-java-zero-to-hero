package com.comrade.threads.runnable_callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FdmaMessageClient {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        List<Future<String>> futures=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
           Future<String> future = executorService.submit(new FdmaSampler(String.valueOf(Math.random())));
            futures.add(future);
        }
        futures.forEach(stringFuture -> {
            try {
                System.out.println(stringFuture.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();
        try {
            if ( executorService.awaitTermination(1000, TimeUnit.MILLISECONDS)){
                //executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            throw new RuntimeException(e);
        }
    }
}
