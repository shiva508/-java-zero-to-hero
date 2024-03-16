package com.comrade.threads.fork_join;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
public class RecursiveTaskClient {
    public static void main(String[] args) {
        List<Integer> integerList =IntStream.range(0,1000).boxed().toList();
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        NumberSampler numberSampler=new NumberSampler(integerList);
        System.out.println(forkJoinPool.invoke(numberSampler));
    }
}
