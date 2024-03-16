package com.comrade.threads.fork_join;

import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NumberSampler extends RecursiveTask<Integer> {
    private List<Integer> integerList;
    AtomicInteger atomicInteger=new AtomicInteger(0);
    public NumberSampler(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    protected Integer compute() {
        if(integerList.size()>10){
            List<NumberSampler>numberSamplers= integerList.stream().collect(Collectors.groupingBy(integer -> atomicInteger.incrementAndGet()/10)).values().stream().map(NumberSampler::new).toList();
           return ForkJoinTask.invokeAll(numberSamplers).stream().map(ForkJoinTask::join).reduce(Integer::sum).get();
        }else{
            return sampleData();
        }
    }

    public Integer sampleData(){
        System.out.println("Batch Processing "+Thread.currentThread().getName());
        return integerList.stream().map(integer -> integer*2).reduce(Integer::sum).get();
    }
}
