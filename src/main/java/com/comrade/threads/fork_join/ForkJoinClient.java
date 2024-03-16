package com.comrade.threads.fork_join;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinClient {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        RecursiveActionGenerator recursiveActionGenerator=new RecursiveActionGenerator(400);
        recursiveActionGenerator.invoke();
    }
}
