package com.comrade.collection.list.copy_on_write_array;

import java.util.List;
import java.util.Random;

public class DepositService implements Runnable{
    private List<Integer> list;
    public DepositService(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(50);
            System.out.println(list);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
