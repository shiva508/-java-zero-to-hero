package com.comrade.collection.list.copy_on_write_array;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArray {
    private List<Integer> list;

    public ConcurrentArray() {
        this.list = new CopyOnWriteArrayList<>();
        this.list.addAll(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
    }

    public void stimullate(){
        Thread threadOne=new Thread(new DepositService(list));
        Thread threadTwo=new Thread(new DepositService(list));
        Thread threadThree=new Thread(new DepositService(list));
        Thread threadFour=new Thread(new WithdrownService(list));
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

    }
}
