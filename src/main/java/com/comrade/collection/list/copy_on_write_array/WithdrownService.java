package com.comrade.collection.list.copy_on_write_array;

import java.util.List;
import java.util.Random;
public class WithdrownService implements Runnable {
    private List<Integer> list;
    Random random;
    public WithdrownService(List<Integer> list) {
        this.list = list;
        random=new Random();
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(list);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.set(random.nextInt(list.size()), random.nextInt(10));
        }
    }
}
