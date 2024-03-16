package com.comrade.threads.wait;

import java.util.Scanner;

public class WaitNotifyProcessor {
    public void produce(){
        synchronized (this){
            try {
                System.out.println("Producer thread running");
                wait();
                System.out.println("Got lock on object again");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
   public void consume(){
       try {
           System.out.println("Please enter something");
           Scanner scanner=new Scanner(System.in);
           Thread.sleep(2000);
           synchronized (this){
               System.out.println("Waiting for return key");
               String name = scanner.nextLine();
               System.out.println("Congratulation :"+name);
               System.out.println("Return key passed");
               notify();
               Thread.sleep(5000);
           }
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}
