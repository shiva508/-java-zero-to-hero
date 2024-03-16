package com.comrade.collection.queue.priority_queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueClient {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue=new PriorityBlockingQueue<>();
        DepositService depositService=new DepositService(queue);
        WithdrownService withdrownService=new WithdrownService(queue);
        new Thread(depositService).start();
        new Thread(withdrownService).start();

    }
}
