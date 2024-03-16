package com.comrade.threads.cyclic_barrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CatchDevil implements Runnable{
    private int id;
    private Random random;
    private CyclicBarrier cyclicBarrier;
    public CatchDevil(int id, CyclicBarrier cyclicBarrier) {
        this.id = id;
        this.random = new Random();
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        doWork();
    }
    private void doWork() {
        System.out.println("Thread with ID " + id + " starts the task...");
        try {
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread with ID " + id + " finished...");

        try {
            cyclicBarrier.await();
            System.out.println("After await...");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public String toString() { return ""+this.id; };
}
