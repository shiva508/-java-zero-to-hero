package com.comrade.threads.wait;

import java.util.ArrayList;
import java.util.List;

public class SignalGenerator {

    private final static int MIN=0;
    private final static int MAX=10;
    private int val=10;
    private static final Object LOCK=new Object();
    private final List<Integer> integers=new ArrayList<>();
    public void publishSignal(){
        synchronized (LOCK){
          while (true){
              if (integers.size()==MAX){
                  System.out.println("Reached Max Signal limit");
                  try {
                      LOCK.wait();
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }else {
                  System.out.println("Adding new Signal");
                  integers.add(val);
                  val++;
                  LOCK.notify();
              }
          }
        }
    }

    public void consumeSignal(){
        synchronized (LOCK){
            while (true){
                if (integers.size()==MIN){
                    System.out.println("Waiting for new signals");
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    System.out.println("Adding new Signal");
                    integers.remove(integers.size()-1);
                    val--;
                    LOCK.notify();
                }
            }
        }
    }

}
