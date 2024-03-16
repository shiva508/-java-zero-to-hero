package com.comrade.threads.concurrent_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSynchronization {
    public static void main(String[] args) {
        withoutSynchronization();
        withSynchronization();
    }

    private static void withSynchronization() {
        List<Integer> nums= Collections.synchronizedList(new ArrayList<>());
        Thread threadOne=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                nums.add(i);
            }
        });
        Thread threadTwo=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                nums.add(i);
            }
        });
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Size of list Non-Sync:"+nums.size());
    }

    private static void withoutSynchronization() {
        List<Integer> nums=new ArrayList<>();
        Thread threadOne=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                nums.add(i);
            }
        });
        Thread threadTwo=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                nums.add(i);
            }
        });
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Size of list Sync:"+nums.size());
    }
}
