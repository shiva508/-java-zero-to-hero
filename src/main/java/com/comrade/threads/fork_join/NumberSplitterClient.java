package com.comrade.threads.fork_join;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class NumberSplitterClient {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        List<Integer> integerList =IntStream.range(0,1000).boxed().toList();
        NumberSplitter numberSplitter=new NumberSplitter(integerList);
        numberSplitter.invoke();
    }
}
