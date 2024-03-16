package com.comrade.threads.fork_join;

import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NumberSplitter extends RecursiveAction {
    AtomicInteger atomicInteger=new AtomicInteger(0);
    private List<Integer> integerList;
    private int batchNumber;
    public NumberSplitter(List<Integer> integerList) {
        this.integerList = integerList;
    }
    @Override
    protected void compute() {
        if (integerList.size()>10) {
            List<NumberSplitter> numberSplitters=integerList.stream().collect(Collectors.groupingBy(integer -> atomicInteger.incrementAndGet()/10)).values().stream().map(NumberSplitter::new).toList();
            invokeAll(numberSplitters);
        }else {
            integerList.forEach(num->{
                System.out.println(Thread.currentThread().getName()+" value :"+num);
            } );
        }
    }
}
